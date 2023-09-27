package machine;

import java.util.Scanner;

public class AskUser {
    public static void askHowManyCupsOfCoffeeWillNeeded() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        RequiredIngrediant.totalCupOfCoffeeNeeded = scanner.nextInt();
    }

    public static void askHowManyMlOfWaterMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        RequiredIngrediant.totalMlOfWater = scanner.nextInt();
    }

    public static void askHowManyMlOfMilkMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of milk the coffee machine has:");
        RequiredIngrediant.totalMlOfMilk = scanner.nextInt();
    }

    public static void askHowManyGmOfCoffeeMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        RequiredIngrediant.totalGmOfCoffee = scanner.nextInt();
    }
}
