package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        RequiredIngrediant.setInitialCapicityOfMachine();
        RequiredIngrediant.printIntialCapicityOfMachine();
        AskUser.writeAction();
        AskUser.perfromAction();
        RequiredIngrediant.printIntialCapicityOfMachine();

    }
}
