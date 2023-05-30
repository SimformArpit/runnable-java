public class OrderRunnable implements Runnable {
    String customerName;
    String item;

    public OrderRunnable(String customerName, String item) {
        this.customerName = customerName;
        this.item = item;
    }

    @Override
    public void run() {
        placeorder();
    }

    private void placeorder() {
        System.out.println(customerName + " is placing an order for " + item);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(customerName + "'s order for " + item + " is Ready");
    }

}
