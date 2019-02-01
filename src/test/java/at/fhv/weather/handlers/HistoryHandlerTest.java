package at.fhv.weather.handlers;

import org.junit.Assert;
import org.junit.Test;

public class HistoryHandlerTest {

    @Test
    public void testSingleton() {
        Assert.assertNotNull(HistoryHandler.getInstance());
    }

}