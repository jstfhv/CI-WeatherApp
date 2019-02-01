package at.fhv.weather.handlers;

// Start of user code (user defined imports)
import java.time.Instant;
// End of user code


public class HistoryHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static HistoryHandler INSTANCE;
	
	private HistoryHandler(){
	    // singleton
	}
	
	public static HistoryHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new HistoryHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.weather.models.History getHistory(String token) throws Exception {
		// Start of user code getHistory
		if (token == null || "".equals(token)){
			throw new Exception("Token must not be Empty");
		}

		at.fhv.weather.models.User user = AuthHandler.getInstance().getUser(token);
		return user.getHistory();
		// End of user code
	}
	
	public void addHistory(String token, String text, at.fhv.weather.models.WeatherResult result) throws Exception {
		// Start of user code addHistory
		at.fhv.weather.models.User user = AuthHandler.getInstance().getUser(token);
		at.fhv.weather.models.HistoryItem item = new at.fhv.weather.models.HistoryItem();
		item.setRequested(Instant.now().toEpochMilli());
		item.setWeather(text);
		item.setResult(result);
		user.getHistory().getItems().add(item);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
