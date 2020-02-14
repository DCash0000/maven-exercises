//import java.sql.SQLOutput;
import jdk.jfr.StackTrace;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import javax.print.MultiDocPrintService;
import java.sql.SQLOutput;
import java.util.Scanner;

//import java.util.Scanner;
public class StringUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a only a number: ");
        String userInput = scanner.nextLine();
        System.out.println(StringUtils.isNumeric(userInput));


        System.out.println("\n" + "Enter a string to flip: ");
        String userInput2 = scanner.nextLine();
        System.out.println(StringUtils.swapCase(userInput2));


        System.out.println("\n" + "Enter a string to be reversed: ");
        String userInput3 = scanner.nextLine();
        System.out.println(StringUtils.reverse(userInput3));
    }



    }




