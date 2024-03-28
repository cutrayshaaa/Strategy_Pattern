public class Main3 {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubberDuckie = new RubberDuck();

        System.out.println("Mallard Duck:");
        mallard.display();
        mallard.performFly();

        System.out.println("\nRubber Duck:");
        rubberDuckie.display();
        rubberDuckie.performFly(); // Perhatikan, bebek karet tidak bisa terbang
    }
}