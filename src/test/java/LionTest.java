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

    Feline feline;
    String actualResultException;
    @Mock
    Feline mock_feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(mock_feline, "Самец");
        int expected = 1;
        Mockito.when(mock_feline.getKittens()).thenReturn(expected);
        Assert.assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getFoodForALion() throws Exception {
        Lion lion = new Lion(mock_feline, "Самка");
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(mock_feline.getFood("Хищник")).thenReturn(expected);
        Assert.assertEquals(expected, lion.getFood());
    }

    @Test
    public void doesHaveManeException() {
        try {
            Lion lion = new Lion(feline, "Кошка");
        } catch (Exception e) {
            actualResultException = "Используйте допустимые значения пола животного - самец или самка";
        } finally {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", actualResultException);
        }
    }

}