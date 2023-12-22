import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String sex;
    private final boolean hasManeExpected;
    Feline feline;

    public LionParamTest(String sex, boolean hasManeExpected) {
        this.sex = sex;
        this.hasManeExpected = hasManeExpected;
    }

    @Parameterized.Parameters
    public static Object[][] hasManeALion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
            Lion lion = new Lion(feline, sex);
            Assert.assertEquals(hasManeExpected, lion.doesHaveMane());
    }
}
