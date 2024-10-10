import com.accesories.*;
import com.flowers.*;
import com.Bouquet.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bouquet bouquet = new Bouquet();
        boolean running = true;

        while (running) {
            System.out.println("1. View bouquet");
            System.out.println("2. Add to bouquet");
            System.out.println("3. Remove i-th element from bouquet");
            System.out.println("4. Sort flowers by freshness");
            System.out.println("5. Run Unit Tests");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bouquet.check();
                    break;
                case 2:
                    System.out.println("1. Flower or 2. Accessory?");
                    int addChoice = scanner.nextInt();
                    if (addChoice == 1) {
                        System.out.println("1. Rose, 2. Lily, 3. Tulip?");
                        int flowerChoice = scanner.nextInt();
                        switch (flowerChoice) {
                            case 1 -> bouquet.addFlower(new Rose());
                            case 2 -> bouquet.addFlower(new Lily());
                            case 3 -> bouquet.addFlower(new Tulip());
                        }
                    } else if (addChoice == 2) {
                        System.out.println("1. Brooch, 2. Ribbon, 3. Wrapping?");
                        int accessoryChoice = scanner.nextInt();
                        switch (accessoryChoice) {
                            case 1 -> bouquet.addAccessory(new Brooch());
                            case 2 -> bouquet.addAccessory(new Ribbon());
                            case 3 -> bouquet.addAccessory(new Wrapping());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Remove 1. Flower or 2. Accessory?");
                    int removeChoice = scanner.nextInt();
                    System.out.println("Enter index to remove:");
                    int index = scanner.nextInt();
                    if (removeChoice == 1) {
                        bouquet.deleteFlower(index);
                    } else if (removeChoice == 2) {
                        bouquet.deleteAccessory(index);
                    }
                    break;
                case 4:
                    bouquet.sortFreshness();
                    break;
                case 5:
                    System.out.println("Running Unit Tests...");

                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
