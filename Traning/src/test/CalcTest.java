import org.example.UnitTests.h1.Calculator.Calculator;
import static org.assertj.core.api.Assertions.*;

public class CalcTest {
    @org.junit.Test
    public void checkTest(){
        Calculator calculator = new Calculator();
        int purchaseAmount = 1000;
        int discountAmount = 50;
        calculator.calculatingDiscount(purchaseAmount, discountAmount);

        assertThat(purchaseAmount).isNotNegative().isNotZero().isNotNull();
        assertThat(discountAmount).isNotNegative().isBetween(0, 99);
    }
}
