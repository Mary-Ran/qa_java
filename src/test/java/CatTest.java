import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Feline feline;

    @Mock
    Feline mock_feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(mock_feline);
        List<String> expectedFoodList = Arrays.asList("Рыба", "Курица", "Мышь");
        Mockito.when(mock_feline.eatMeat()).thenReturn(expectedFoodList);
        Assert.assertEquals(expectedFoodList, cat.getFood());
    }

}
