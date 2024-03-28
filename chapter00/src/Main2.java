public class Main2 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};

        // Using addition strategy
        Strategy addStrategy = new ConcreteStrategyAdd();
        Context context = new Context(addStrategy);
        int resultAdd = context.executeStrategy(data);
        System.out.println("Result of addition strategy: " + resultAdd);

        // Using multiplication strategy
        Strategy multiplyStrategy = new ConcreteStrategyMultiply();
        context = new Context(multiplyStrategy);
        int resultMultiply = context.executeStrategy(data);
        System.out.println("Result of multiplication strategy: " + resultMultiply);
    }
}