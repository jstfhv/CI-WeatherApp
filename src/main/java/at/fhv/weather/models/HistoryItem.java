package at.fhv.weather.models;

// Start of user code (user defined imports)

// End of user code

public class HistoryItem {
	/**
	 * Description of the property weather.
	 */
	public String weather = null;
	
	/**
	 * Description of the property requested.
	 */
	public long requested = 0;
	
	/**
	 * Description of the property result.
	 */
	public at.fhv.weather.models.WeatherResult result = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getWeather(){
		   return this.weather;
		}
		
		public void setWeather(String weather){
		   this.weather = weather;
		}
		
		public long getRequested(){
		   return this.requested;
		}
		
		public void setRequested(long requested){
		   this.requested = requested;
		}
		
		public at.fhv.weather.models.WeatherResult getResult(){
		   return this.result;
		}
		
		public void setResult(at.fhv.weather.models.WeatherResult result){
		   this.result = result;
		}
		
	
}
