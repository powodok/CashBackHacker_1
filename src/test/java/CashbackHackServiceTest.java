import org.testng.Assert;
import org.testng.annotations.Test;
import ru_netology.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void testRemainShouldReturnZeroWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int expectedRemain = 1000;

        int actualRemain = service.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainShouldReturnRemainderWhenAmountIsNotMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;
        int expectedRemain = 500;

        int actualRemain = service.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainShouldReturnBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expectedRemain = 1000;

        int actualRemain = service.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }
}
