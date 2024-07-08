package CoffeeMaking;

public abstract class CoffeeMachine {
    abstract void makeCoffee(String Type);

    void startMachine(){
        System.out.println("The machine starts");
    }

    void stopMachine(){
        System.out.println("The machine stops");
    }
}
