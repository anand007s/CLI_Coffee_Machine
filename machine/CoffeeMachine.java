package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        RequiredIngrediant.setInitialCapicityOfMachine();
        AskUser.writeAction();
        AskUser.perfromAction();

    }
}
