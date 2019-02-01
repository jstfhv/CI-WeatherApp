package at.fhv.weather.handlers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnalysisHandlerTest {

    @Test
    public void testSingleton() {
        Assert.assertNotNull(AnalysisHandler.getInstance());
    }
}