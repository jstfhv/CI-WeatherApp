package at.fhv.weather.endpoints;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthEndpointTest {

    /**
     * Test successful login
     */
    @Test
    public void testLogin() throws Exception {
        AuthEndpoint endpoint = new AuthEndpoint();
        String token = endpoint.login("user@test.com");
        Assert.assertNotNull(token);
        Assert.assertNotEquals("", token);
    }

    /**
     * Test login with empty mail
     */
    @Test(expected = Exception.class)
    public void testLoginEmptyMail() throws Exception {
        AuthEndpoint endpoint = new AuthEndpoint();
        endpoint.login("");
    }

    /**
     * Test login with null mail
     */
    @Test(expected = Exception.class)
    public void testLoginNullMail() throws Exception {
        AuthEndpoint endpoint = new AuthEndpoint();
        endpoint.login(null);
    }

    /**
     * Test successful logout
     */
    @Test
    public void testLogout() throws Exception {
        AuthEndpoint endpoint = new AuthEndpoint();
        endpoint.logout("user@test.com");
    }

    /**
     * Test logout with empty mail
     */
    @Test(expected = Exception.class)
    public void testLogoutEmptyMail() throws Exception {
        AuthEndpoint endpoint = new AuthEndpoint();
        endpoint.logout("");
    }

    /**
     * Test logout with null mail
     */
    @Test(expected = Exception.class)
    public void testLogoutNullMail() throws Exception {
        AuthEndpoint endpoint = new AuthEndpoint();
        endpoint.logout(null);
    }


}