package at.fhv.weather.endpoints;

import org.junit.Test;

import static org.junit.Assert.*;

public class HistoryEndpointTest {


    /**
     * Test history loading with empty token
     */
    @Test(expected = Exception.class)
    public void testGetHistoryEmptyToken() throws Exception {
        HistoryEndpoint endpoint = new HistoryEndpoint();
        endpoint.getHistory("");
    }

    /**
     * Test history loading with null token
     */
    @Test(expected = Exception.class)
    public void testGetHistoryNullToken() throws Exception {
        HistoryEndpoint endpoint = new HistoryEndpoint();
        endpoint.getHistory(null);
    }

}