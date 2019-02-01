package at.fhv.weather.models;

// Start of user code (user defined imports)

// End of user code

public class User {
	/**
	 * Description of the property name.
	 */
	public String name = null;
	
	/**
	 * Description of the property history.
	 */
	public at.fhv.weather.models.History history = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getName(){
		   return this.name;
		}
		
		public void setName(String name){
		   this.name = name;
		}
		
		public at.fhv.weather.models.History getHistory(){
		   return this.history;
		}
		
		public void setHistory(at.fhv.weather.models.History history){
		   this.history = history;
		}
		
	
}
