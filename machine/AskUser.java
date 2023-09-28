package machine;

import java.util.Scanner;

public class AskUser {

    static String action;
    static int buy;
    private static void askHowManyCupsOfCoffeeWillNeeded() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        RequiredIngrediant.totalCupOfCoffeeNeeded = scanner.nextInt();
    }

    private static void askHowManyMlOfWaterMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        RequiredIngrediant.totalMlOfWater += scanner.nextInt();
    }

    private static void askHowManyMlOfMilkMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of milk the coffee machine has:");
        RequiredIngrediant.totalMlOfMilk += scanner.nextInt();
    }

    private static void askHowManyGmOfCoffeeMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        RequiredIngrediant.totalGmOfCoffee += scanner.nextInt();
    }

    private static void askHowMuchDisposableCupsYourWantToAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many disposable cups you want to add: ");
        RequiredIngrediant.totalCups += scanner.nextInt();
    }

    static void writeAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Write action (buy, fill, take): \n");
        action = scanner.next();
    }

    static void perfromAction() {
        if (action.equals("buy")) {
            performBuyAction();
        } else if (action.equals("fill")) {
            perfromFillAction();
        } else if (action.equals("take")) {
            perfromTakeAction();
        }
    }

    private static void perfromTakeAction() {
        System.out.printf("I gave you $%d", RequiredIngrediant.totalMoney);
        RequiredIngrediant.totalMoney = 0;
    }

    private static void perfromFillAction() {
        askHowManyMlOfWaterMachineHas();
        askHowManyMlOfMilkMachineHas();
        askHowManyGmOfCoffeeMachineHas();
        askHowMuchDisposableCupsYourWantToAdd();
    }

    private static void performBuyAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: \n");
        buy = scanner.nextInt();
        System.out.println();
        switch (buy) {
            case 1 :
                RequiredIngrediant.totalMlOfWater -= 250;
                RequiredIngrediant.totalGmOfCoffee -= 16;
                RequiredIngrediant.totalCups -= 1;
                RequiredIngrediant.totalMoney += 4;
                break;
            case 2 :
                RequiredIngrediant.totalMlOfWater -= 350;
                RequiredIngrediant.totalMlOfMilk -= 75;
                RequiredIngrediant.totalGmOfCoffee -= 20;
                RequiredIngrediant.totalCups -= 1;
                RequiredIngrediant.totalMoney += 7;
                break;
            case 3 :
                RequiredIngrediant.totalMlOfWater -= 200;
                RequiredIngrediant.totalMlOfMilk -= 100;
                RequiredIngrediant.totalGmOfCoffee -= 12;
                RequiredIngrediant.totalCups -= 1;
                RequiredIngrediant.totalMoney += 6;
        }
    }
}
