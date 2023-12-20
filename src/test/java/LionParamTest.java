import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.Arrays;
import java.util.List;

//@RunWith(Parameterized.class)
//public class LionParameterizedTest {
//
//    private final String sex;
//    private final boolean hasManeExpected;
//
//    public LionParameterizedTest(String sex, boolean hasManeExpected) {
//        this.sex = sex;
//        this.hasManeExpected = hasManeExpected;
//    }
//
//    @Parameterized.Parameters
//    public static Object[][] hasManeALion() {
//        return new Object[][] {
//                {"Самец", true},
//                {"Самка", false}
//        };
//    }

//    @Test
//    public void doesHaveManeALion() {
//        Lion lion = new Lion(sex);
//        lion.doesHaveMane();
//        Assert.assertEquals(hasManeExpected, lion.doesHaveMane());
//
//
//    }

//    public void getFoodForALion() throws Exception {
//        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
//        spy_lion.getFood();
//        Mockito.verify(spy_lion, Mockito.times(1)).getFood("Хищник");
//        Assert.assertEquals(expected, spy_lion.getFood());
//    }




//}
