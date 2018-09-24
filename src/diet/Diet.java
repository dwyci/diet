
package diet;

import java.util.Scanner;

/**
 *
 * @author dallas
 */
public class Diet {

    public static void main(String[] args) {
        
        System.out.print("Hello, what did you eat today? ");
        Scanner sc = new Scanner(System.in);
        String food = sc.nextLine();
        
        System.out.print("How much protein did it have? ");
        int protein = Integer.parseInt(sc.nextLine());
        
        System.out.print("How much fat did it have? ");
        int fat = Integer.parseInt(sc.nextLine());
        
        System.out.print("How much carbohydrates did it have? ");
        int carb = Integer.parseInt(sc.nextLine());
        
        System.out.println("Here are your daily totals:  protien " + protein +", fats "+ fat +", carbohydrates " + carb);
    }
    
}
