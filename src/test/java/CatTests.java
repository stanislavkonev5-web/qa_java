import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnsMeowTest(){
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodWantsEatMeatTest() throws Exception{
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Кошки едят животных, птиц и рыб", expectedFood, cat.getFood());
    }

}
