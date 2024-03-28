// Interface untuk perilaku terbang
interface FlyBehavior {
    void fly();
}

// Implementasi terbang untuk bebek-buruk
class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Aku terbang dengan sayap!");
    }
}

// Implementasi terbang untuk bebek yang tidak bisa terbang
class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Aku tidak bisa terbang!");
    }
}

// Kelas bebek
abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
}

// Kelas MallardDuck yang mewarisi dari kelas Duck
class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Aku benar-benar bebek Mallard");
    }
}

// Kelas RubberDuck yang mewarisi dari kelas Duck
class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("Saya seekor bebek karet");
    }
}
