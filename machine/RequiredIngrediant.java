package machine;

public class RequiredIngrediant {
    public static int totalCupOfCoffeeNeeded;
    public static int totalMlOfMilk;
    public static int totalMlOfWater;
    public static int totalGmOfCoffee;
    public static int actualCupOfCoffeeMachineIs;

    public static int waterNeeded(int totalCupOfCoffeeNeeded) {
        return totalCupOfCoffeeNeeded * 200;
    }

    public static int milkNeeded(int totalCupOfCoffeeNeeded) {
        return totalCupOfCoffeeNeeded * 50;
    }

    public static int CoffeeBeanNeeded(int totalCupOfCoffeeNeeded) {
        return totalCupOfCoffeeNeeded * 15;
    }

    public static void printRequiredIngrediantNeeded() {
        System.out.printf("For %d cups of coffee you will need:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans",
                totalCupOfCoffeeNeeded,
                RequiredIngrediant.waterNeeded(totalCupOfCoffeeNeeded),
                RequiredIngrediant.milkNeeded(totalCupOfCoffeeNeeded),
                RequiredIngrediant.CoffeeBeanNeeded(totalCupOfCoffeeNeeded));
    }

    public static void isSupplyEnough() {
        actualCupOfCoffeeMachineIs = Math.min(totalMlOfWater/200, Math.min(totalMlOfMilk/50, totalGmOfCoffee/15));

        if (totalCupOfCoffeeNeeded == actualCupOfCoffeeMachineIs) {
            System.out.printf("Yes, I can make that amount of coffee");
        } else if (totalCupOfCoffeeNeeded > actualCupOfCoffeeMachineIs) {
            System.out.printf("No, I can make only %d cup(s) of coffee", actualCupOfCoffeeMachineIs);
        } else if (totalCupOfCoffeeNeeded < actualCupOfCoffeeMachineIs) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)",
                    actualCupOfCoffeeMachineIs - totalCupOfCoffeeNeeded);
        }
    }

}
