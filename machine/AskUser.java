package machine;

import java.util.Scanner;

public class AskUser {

    static String action;
    static String buy;
    private static void askHowManyCupsOfCoffeeWillNeeded() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        RequiredIngrediant.totalCupOfCoffeeNeeded = scanner.nextInt();
    }

    private static void askHowManyMlOfWaterMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        RequiredIngrediant.totalMlOfWater += scanner.nextInt();
    }

    private static void askHowManyMlOfMilkMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of milk you want to add: ");
        RequiredIngrediant.totalMlOfMilk += scanner.nextInt();
    }

    private static void askHowManyGmOfCoffeeMachineHas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many grams of coffee beans you want to add: ");
        RequiredIngrediant.totalGmOfCoffee += scanner.nextInt();
    }

    private static void askHowMuchDisposableCupsYourWantToAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many disposable cups you want to add: ");
        RequiredIngrediant.totalCups += scanner.nextInt();
    }

    static void writeAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Write action (buy, fill, take, remaining, exit): \n");
        action = scanner.nextLine();
    }

    static void perfromAction() {

        while (!action.equals("exit")) {
            if (action.equals("buy")) {
                performBuyAction();
                writeAction();
            } else if (action.equals("fill")) {
                perfromFillAction();
                writeAction();
            } else if (action.equals("take")) {
                perfromTakeAction();
                writeAction();
            } else if (action.equals("remaining")) {
                RequiredIngrediant.printIntialCapicityOfMachine();
                writeAction();
            }
        }
    }

    private static void perfromTakeAction() {
        System.out.printf("I gave you $%d\n", RequiredIngrediant.totalMoney);
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
        System.out.printf("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n");
        buy = scanner.next();
        System.out.println();
        switch (buy) {
            case "1" :
                if (RequiredIngrediant.totalMlOfWater >= 250 && RequiredIngrediant.totalGmOfCoffee >= 16 && RequiredIngrediant.totalCups >= 1) {
                    RequiredIngrediant.totalMlOfWater -= 250;
                    RequiredIngrediant.totalGmOfCoffee -= 16;
                    RequiredIngrediant.totalCups -= 1;
                    RequiredIngrediant.totalMoney += 4;
                    System.out.printf("I have enough resources, making you a coffee!\n");
                } else {
                    String shortResource = null;
                    if (RequiredIngrediant.totalMlOfWater < 250) {
                        shortResource = "water";
                    } else if (RequiredIngrediant.totalGmOfCoffee < 16) {
                        shortResource = "coffee";
                    } else if (RequiredIngrediant.totalCups < 1) {
                        shortResource = "cups";
                    }
                    System.out.printf("Sorry, not enough %s!", shortResource);
                }
                break;
            case "2" :
                if (RequiredIngrediant.totalMlOfWater >= 350 && RequiredIngrediant.totalMlOfMilk >= 75 && RequiredIngrediant.totalGmOfCoffee >= 20 && RequiredIngrediant.totalCups >= 1) {
                    RequiredIngrediant.totalMlOfWater -= 350;
                    RequiredIngrediant.totalMlOfMilk -= 75;
                    RequiredIngrediant.totalGmOfCoffee -= 20;
                    RequiredIngrediant.totalCups -= 1;
                    RequiredIngrediant.totalMoney += 7;
                    System.out.printf("I have enough resources, making you a coffee!\n");
                } else {
                    String shortResource = null;
                    if (RequiredIngrediant.totalMlOfWater < 350) {
                        shortResource = "water";
                    } else if (RequiredIngrediant.totalMlOfMilk < 75) {
                        shortResource = "milk";
                    } else if (RequiredIngrediant.totalGmOfCoffee < 20) {
                        shortResource = "coffee";
                    } else if (RequiredIngrediant.totalCups < 1) {
                        shortResource = "cups";
                    }
                    System.out.printf("Sorry, not enough %s!", shortResource);
                }
                break;
            case "3" :
                if (RequiredIngrediant.totalMlOfWater >= 200 && RequiredIngrediant.totalMlOfMilk >= 100 && RequiredIngrediant.totalGmOfCoffee >= 12 && RequiredIngrediant.totalCups >= 1) {
                    RequiredIngrediant.totalMlOfWater -= 200;
                    RequiredIngrediant.totalMlOfMilk -= 100;
                    RequiredIngrediant.totalGmOfCoffee -= 12;
                    RequiredIngrediant.totalCups -= 1;
                    RequiredIngrediant.totalMoney += 6;
                    System.out.printf("I have enough resources, making you a coffee!\n");
                } else {
                    String shortResource = null;
                    if (RequiredIngrediant.totalMlOfWater < 200) {
                        shortResource = "water";
                    } else if (RequiredIngrediant.totalMlOfMilk < 100) {
                        shortResource = "milk";
                    } else if (RequiredIngrediant.totalGmOfCoffee < 12) {
                        shortResource = "coffee";
                    } else if (RequiredIngrediant.totalCups < 1) {
                        shortResource = "cups";
                    }
                    System.out.printf("Sorry, not enough %s!", shortResource);
                }
                break;
            case "back" :
                break;
        }
    }
}
