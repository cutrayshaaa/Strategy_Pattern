// Define the Strategy interface
interface Strategy {
    int execute(int[] data);
}

// Define ConcreteStrategy classes
class ConcreteStrategyAdd implements Strategy {
    public int execute(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum;
    }
}

class ConcreteStrategyMultiply implements Strategy {
    public int execute(int[] data) {
        int result = 1;
        for (int num : data) {
            result *= num;
        }
        return result;
    }
}

// Context class
class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int[] data) {
        return strategy.execute(data);
    }
}

