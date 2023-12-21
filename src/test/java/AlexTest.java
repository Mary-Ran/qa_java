import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AlexTest {
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex(feline, "Самец");
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriends() throws Exception {
        Alex alex = new Alex(feline, "Самец");
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        Assert.assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex(feline, "Самец");
        String expectedPlace = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expectedPlace, alex.getPlaceOfLiving());
    }

}
