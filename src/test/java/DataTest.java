import com.google.gson.Gson;
import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DataTest {


    @Test
    public void tmpTest() {
        Assert.assertEquals(true, true);
    }

    @Test //Aufgabe 2 "sinnvoller" Test
    public void numDataPointsTest() {
        DataLoader dataLoader = new DataLoader();
        Gson gson = new Gson();

        String json = dataLoader.loadJsonFile("countries-aggregated_json.json");
        CountryDataPoint[] dataPoints = gson.fromJson(json, CountryDataPoint[].class);
        Assert.assertEquals(dataPoints.length, 143668);
        //Assert.assertEquals(dataPoints.length, 42);
    }
}
