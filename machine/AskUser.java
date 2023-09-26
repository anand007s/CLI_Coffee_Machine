package machine;

import java.util.Scanner;

public class AskUser {
    public static void askHowManyCupsOfCoffeeWillNeeded() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        RequiredIngrediant.totalCupOfCoffeeNeeded = scanner.nextInt();
    }
}
