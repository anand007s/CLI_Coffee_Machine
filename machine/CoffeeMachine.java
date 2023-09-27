package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        AskUser.askHowManyMlOfWaterMachineHas();
        AskUser.askHowManyMlOfMilkMachineHas();
        AskUser.askHowManyGmOfCoffeeMachineHas();
        AskUser.askHowManyCupsOfCoffeeWillNeeded();
        RequiredIngrediant.isSupplyEnough();
    }

    static void makeMyCoffee() {
        System.out.println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!
                """);
    }
}
