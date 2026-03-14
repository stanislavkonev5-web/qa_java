import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline feline;

    @Test
    public void getKittensReturnsCorrectValueTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
        Assert.assertEquals(5, lion.getKittens());
    }
    @Test
    public void getFoodReturnsCorrectListTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, lion.getFood());
    }
    @Test(expected = Exception.class)
    public void exceptionOnUnknownSexTest() throws Exception {
        new Lion("Само", feline);
    }

}
