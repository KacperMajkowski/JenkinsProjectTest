import org.example.Calculator;
import org.junit.Test;

public class CalculationTest {

    @Test
    public void additionTest() {

        Calculator calc = new Calculator();

        int x = 2;
        int y = 3;
        assert calc.add(x, y) == 7;
    }



}
