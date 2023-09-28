package machine;

public class RequiredIngrediant {
    public static int totalMlOfMilk;
    public static int totalMlOfWater;
    public static int totalGmOfCoffee;
    public static int totalMoney;
    public static int totalCups;

    public static void setInitialCapicityOfMachine() {
        totalMoney = 550;
        totalMlOfWater = 400;
        totalMlOfMilk = 540;
        totalGmOfCoffee = 120;
        totalCups = 9;
    }

    static void printIntialCapicityOfMachine() {
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                %d of money\n
                """, totalMlOfWater, totalMlOfMilk, totalGmOfCoffee, totalCups, totalMoney);
    }

}
