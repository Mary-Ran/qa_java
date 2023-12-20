import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline mock_feline;

    @Test
    public void getKittens() {
        Lion lion = new Lion(mock_feline);
        int expected = 1;
        Mockito.when(mock_feline.getKittens()).thenReturn(expected);
        Assert.assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getFoodForALion() throws Exception {
        Lion lion = new Lion(mock_feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(mock_feline.getFood("Хищник")).thenReturn(expected);
        Assert.assertEquals(expected, lion.getFood());
    }

}