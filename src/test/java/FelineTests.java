import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTests {
    @Test
    public void eatMeatReturnsCorrectFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Кошачьи едят животных, птиц и рыб", expected, feline.eatMeat());

    }
    @Test(expected = Exception.class)
    public void getFoodThrowsExceptionTest() throws Exception {
        Feline feline = new Feline();
        feline.getFood("Неземное");
    }
    @Test
    public void getFamilyReturnsFelineTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals("Должно быть семейство кошачьих", expected, feline.getFamily());
    }

    @Test
    public void getKittensReturnsOneByDefaultTest(){
        Feline feline = new Feline();
        Assert.assertEquals("По умолчанию должно быть: 1", 1, feline.getKittens());
    }
}
