import org.junit.Assert;
import org.junit.Test;
import ru_netology.CashbackHackService;

public class CashbackHackServiceTest_2 {
    @Test
    public void testRemainShouldReturnZeroWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3000;
        int expectedRemain = 0;

        int actualRemain = service.remain(amount);

        Assert.assertEquals(expectedRemain, actualRemain);
    }

    @Test
    public void testRemainShouldReturnRemainderWhenAmountIsNotMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;
        int expectedRemain = 500;

        int actualRemain = service.remain(amount);

        Assert.assertEquals(expectedRemain, actualRemain);
    }

    @Test
    public void testRemainShouldReturnBoundaryWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expectedRemain = 1000;

        int actualRemain = service.remain(amount);

        Assert.assertEquals(expectedRemain, actualRemain);
    }

    @Test(expected = RuntimeException.class)
    public void testRemainShouldThrowExceptionWhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        service.remain(amount);
    }
}
