package CoffeeMaking;

public class abstractionMain {
    public static void main(String[] args) {
        CoffeeMachine esprosso = new Esprosso();
        CoffeeMachine americano = new Americano();

        esprosso.startMachine();
        esprosso.makeCoffee("Esprosso");
        esprosso.stopMachine();

        americano.startMachine();
        americano.makeCoffee("Americano");
        americano.stopMachine();
    }
}


