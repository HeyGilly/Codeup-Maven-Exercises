import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking in input: ");
        String userInput = sc.nextLine();
        System.out.print("input: "+userInput+ '\n');

        // Check to see if you enter a anything then a number.
        if(StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number \n");
        }else if (StringUtils.isAlpha(userInput)){
            System.out.println(userInput + " is a string \n");
            System.out.println(StringUtils.swapCase(userInput) + " in swap case\n");
            System.out.println(StringUtils.reverse(userInput) + " in reverse\n");
        };
    }


}
