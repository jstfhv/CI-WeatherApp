package at.fhv.weather.endpoints;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class AnalysisEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/getWeather")
	public at.fhv.weather.models.WeatherResult getWeather(@org.springframework.web.bind.annotation.RequestParam("text") String text, @org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code analyze
		return at.fhv.weather.handlers.AnalysisHandler.getInstance().getWeather(text, token);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
