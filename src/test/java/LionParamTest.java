import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String sex;
    private final boolean hasManeExpected;

    public LionParamTest(String sex, boolean hasManeExpected) {
        this.sex = sex;
        this.hasManeExpected = hasManeExpected;
    }

    @Parameterized.Parameters
    public static Object[][] hasManeALion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Кошка", false}
        };
    }

    @Test
    public void doesHaveMane() {
        try {
            Lion lion = new Lion(sex);
            Assert.assertEquals(hasManeExpected, lion.doesHaveMane());
        } catch (Exception e) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }

    }

}
