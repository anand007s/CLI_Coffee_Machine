package machine;

public class RequiredIngrediant {
    public static int totalCupOfCoffeeNeeded;

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

}
