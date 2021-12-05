package atm;
import org.junit.Test;

public class ATMtest {

    @Test
    public void testCorrect() {
        ATM atm = new ATM();
        atm.process(100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrong() {
        ATM atm = new ATM();
        atm.process(101);
    }
}
