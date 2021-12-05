package atm;

public abstract class DefaultTray implements Tray{
    private final int bill;
    private Tray nextTray;

    public DefaultTray(int bill) {
        this.bill = bill;

    }
    public void process(int amount) {
        int numb = amount / bill;
        if (nextTray != null) {
            nextTray.process(amount - numb * bill);
        } else {
            if (amount - numb * bill != 0) {
                throw new IllegalArgumentException("Cannot be processed!");
            }
        }
        System.out.println("Get " + amount / bill + " banknotes with amount of " + bill);
    }

    public void setNext(Tray tray) {
        this.nextTray = tray;
    }
}
