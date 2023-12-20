import com.example.Alex;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AlexTest {

    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex("Самец");
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriends() throws Exception {
        Alex alex = new Alex("Самец");
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        Assert.assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex("Самец");
        String expectedPlace = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expectedPlace, alex.getPlaceOfLiving());
    }

}
