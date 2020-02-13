//import java.sql.SQLOutput;
import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

//import java.util.Scanner;
public class StringUtil {
    public static void main(String[] args) {

    }


    private static boolean isNumeric() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter only a number: ");
        int userInput = scanner.nextInt();
        System.out.println("Great you entered: " +userInput);
        return org.apache.commons.lang3.StringUtils.isNumeric("");
    }



//    public static void userInput(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        String userInput = scanner.nextLine();
//        int i = 0;
//        if(i != 0)
    }





