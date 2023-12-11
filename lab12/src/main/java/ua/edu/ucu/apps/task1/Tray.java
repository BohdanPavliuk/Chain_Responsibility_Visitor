package ua.edu.ucu.apps.task1;

public abstract class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public void setNext(Tray next) {
        this.next = next;
    }
    
    public void process(int amount) {
        if (next != null) {
            next.process(amount % denomination);
        } else if (amount % denomination != 0) {
            throw new IllegalArgumentException();
        }

        System.out.format("Please take %d of denomination %d\n", amount / denomination, denomination);
}
}