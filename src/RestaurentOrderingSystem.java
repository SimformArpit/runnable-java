// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RestaurentOrderingSystem {
    public static void main(String[] args) {
        OrderRunnable order1 = new OrderRunnable("Arpit", "Pizza");
        OrderRunnable order2 = new OrderRunnable("Sailesh", "Salad");
        OrderRunnable order3 = new OrderRunnable("Nimit", "Burger");
        OrderRunnable order4 = new OrderRunnable("Yash", "vada-pav");
        OrderRunnable order5 = new OrderRunnable("Parth", "chicken");
        Thread T1 = new Thread(order1);
        Thread T2 = new Thread(order2);
        Thread T3 = new Thread(order3);
        Thread T4 = new Thread(order4);
        Thread T5 = new Thread(order5);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();


    }
}