/**
 * @ Prof1.java
 * @ This program lets a user provide via a file commands for BST and receive a file with results in return
 * @ author: Destiny
 * @ date: September 25, 2024
 */

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    static boolean listWasCalled = false; // tracks if list command was used

    // set method for List
    public static void setListWasCalled(boolean listWasCalled) {
        Main.listWasCalled = listWasCalled;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        // read the dataset
        FastFoodNutritionInfo.readFastFoodData("src/Edited(4)FFNData.csv");

        // short intro for user
        System.out.println("This program contains info on food from: \n \t McDonald's, Burger King, Taco Bell, Pizza Hut, Wendy’s, KFC \n ");
        Thread.sleep(4000);

        System.out.println("Here is a list of valid commands \n");
        Thread.sleep(2000);
        // explain commands
        System.out.println("List: list all items in database (only prints once)");
        System.out.println("Insert: provide food company & item (please separate with a comma)");
        System.out.println("Delete: provide food company & item (see above)");
        System.out.println("PrintBestOption: prints lowest calorie item from tree");
        System.out.println("RankOptions): List user given items in order from least to most caloric");
        Thread.sleep(4500);


        // file path
        String filePath = "src/input.txt";

        // Clears previous result files
        new PrintWriter("./result.txt").close();

        // Actually starts program with the hard-coded file path
        new Parser(filePath);
        // print database if list command used
        if(listWasCalled){
            System.out.println("__________________Full Database List Start______________________");
            Thread.sleep(3000);
            FastFoodNutritionInfo.printFFNData();
            System.out.println("__________________Database List Complete______________________");
            Thread.sleep(3000);

        }
    }
}
