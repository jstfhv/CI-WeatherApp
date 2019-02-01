package at.fhv.weather.models;

// Start of user code (user defined imports)

// End of user code

public class WeatherResult {
	/**
	 * Description of the property weather.
	 */
	public String weather = null;
	
	/**
	 * Description of the property location.
	 */
	public String location = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getWeather(){
		   return this.weather;
		}
		
		public void setWeather(String weather){
		   this.weather = weather;
		}
		
		public String getLocation(){
		   return this.location;
		}
		
		public void setLocation(String location){
		   this.location = location;
		}
		
	
}
