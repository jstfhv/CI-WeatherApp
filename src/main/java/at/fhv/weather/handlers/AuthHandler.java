package at.fhv.weather.handlers;

// Start of user code (user defined imports)

// End of user code

public class AuthHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static AuthHandler INSTANCE;
	
	private AuthHandler(){
	    // singleton
	}
	
	public static AuthHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AuthHandler();
	    }
	
	    return INSTANCE;
	}
	
	public void logout(String token) throws Exception {
		// Start of user code logout
		
		// End of user code
	}
	
	public String login(String email) throws Exception {
		// Start of user code login(in email: String): String

		return null;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
