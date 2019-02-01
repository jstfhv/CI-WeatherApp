package at.fhv.weather.endpoints;

import at.fhv.weather.models.WeatherResult;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnalysisEndpointTest {

    @Test
    public void getWeather() {
    }

    /**
     * Test analysis with empty text
     */
    @Test
    public void testAnalyzeEmptyText() throws Exception {
        AuthEndpoint authEndpoint = new AuthEndpoint();
        AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
        String token = authEndpoint.login("user@test.com");
        WeatherResult result = analysisEndpoint.getWeather("", token);

        Assert.assertNotNull(result);
        Assert.assertEquals("not found", result.getWeather());
        Assert.assertEquals("no location entered", result.getLocation());
    }
    /**
     * Test analysis with null text
     */
    @Test
    public void testAnalyzeNullText() throws Exception {
        AuthEndpoint authEndpoint = new AuthEndpoint();
        AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
        String token = authEndpoint.login("user@test.com");
        WeatherResult result = analysisEndpoint.getWeather("", token);

        Assert.assertNotNull(result);
        Assert.assertEquals("not found", result.getWeather());
        Assert.assertEquals("no location entered", result.getLocation());
    }

    /**
     * Test analysis with empty token
     */
    @Test(expected = Exception.class)
    public void testAnalyzeEmptyToken() throws Exception {
        AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
        analysisEndpoint.getWeather("Dornbirn", "");
    }

    /**
     * Test analysis with null token
     */
    @Test(expected = Exception.class)
    public void testAnalyzeNullToken() throws Exception {
        AnalysisEndpoint analysisEndpoint = new AnalysisEndpoint();
        analysisEndpoint.getWeather("Wien", null);
    }




}