import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Spy
    Feline spy_feline;

    @Test
    public void getFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensFelineWithParam() {
        int expected = 5;
        Assert.assertEquals(expected, feline.getKittens(expected));
    }

    @Test
    public void getKittensFelineWithoutParam() {
        int expected = 1;
        Assert.assertEquals(expected, feline.getKittens());
    }

    @Test
    public void eatMeat() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(spy_feline.getFood("Хищник")).thenReturn(expected);
        Assert.assertEquals(expected, spy_feline.eatMeat());
    }

}
