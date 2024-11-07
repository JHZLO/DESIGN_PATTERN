public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Try This!");

        MyPizzaStore myPizzaStore = new MyPizzaStore();
        myPizzaStore.orderPizza("clam");
        myPizzaStore.orderPizza("cheese");

    }
}
