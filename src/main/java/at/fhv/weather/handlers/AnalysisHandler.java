package at.fhv.weather.handlers;

// Start of user code (user defined imports)
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.text.DecimalFormat;
// End of user code


public class AnalysisHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static AnalysisHandler INSTANCE;
	
	private AnalysisHandler(){
	    // singleton
	}
	
	public static AnalysisHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AnalysisHandler();
	    }
	    return INSTANCE;
	}
	
	public at.fhv.weather.models.WeatherResult getWeather(String text, String token) throws Exception {
		// Start of user code analyze

		if(token == null || "".equals(token)) {
			throw new Exception("Not authenticated");
		}

		if(text == null || "".equals(text)) {
			at.fhv.weather.models.WeatherResult empty = new at.fhv.weather.models.WeatherResult();
			empty.setWeather("not found");
			empty.setLocation("no location entered");
			return empty;
		}

		HttpResponse response = Request.Get("http://api.openweathermap.org/data/2.5/weather?q="+text+"&appid=de7553ae3344b58c5c0bbdd222b3043b")
				.execute().returnResponse();


		String result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		Gson gson = new GsonBuilder().create();
		JsonObject jsonObject = gson.fromJson(result, JsonObject.class);
		String weatherInfo;
		try {
			float temp = gson.fromJson(jsonObject.getAsJsonObject("main").get("temp"), Float.class);
			float humidity = gson.fromJson(jsonObject.getAsJsonObject("main").get("humidity"), Float.class);
			float wind = gson.fromJson(jsonObject.getAsJsonObject("wind").get("speed"), Float.class);
			temp -= 273.15;
			weatherInfo = "temperature: " + new DecimalFormat("#.#").format(temp) + "°C,  humidity: " + humidity +"%,  wind-speed: " +wind + "m/s";
		} catch (NullPointerException ex){
			weatherInfo = "City not found";
		}


		at.fhv.weather.models.WeatherResult weatherResult = new at.fhv.weather.models.WeatherResult();
		weatherResult.setLocation(text);
		weatherResult.setWeather(weatherInfo);

		HistoryHandler.getInstance().addHistory(token, text, weatherResult);
		return weatherResult;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
