package List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
                default:
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 to print choice options");
        System.out.println("\t 1 to print list of grocery items");
        System.out.println("\t 2 to add items to the list");
        System.out.println("\t 3 to modify items in the list");
        System.out.println("\t 4 to remove an item from the list");
        System.out.println("\t 5 to search for an   item in the list");
        System.out.println("\t 6 to quit the application");

    }

    public static void addItem() {
        System.out.print("Please Enter the grocery Item:");
        groceryList.addGroceryItem(input.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name");
        String item = input.nextLine();
       
        System.out.print("Enter replacement item");
        String newItem = input.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name");
        String item = input.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchItem() {
        System.out.println("Item to search for:");
        String searchItem = input.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " item is not on the list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
    
}
