import java.util.Scanner;

public class SwitchSettings {
    public static void main(String[] args) {
        int iterCounter = 1;
        int[] binaryRet = new int[100];
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input the third octet of the IP Address [0-1]: ");
        int thirdOct = userInput.nextInt();
        System.out.print("Input the fourth octet of the IP Address [0-254]: ");
        int decNum = userInput.nextInt();
        int quotVal = decNum;

        while (quotVal != 0) {
            binaryRet[iterCounter++] = quotVal % 2;
            quotVal /= 2;
        }

        if (thirdOct == 0) {
            System.out.println("Settings1/Switch8 = 0\n");
        } else if (thirdOct == 1) {
            System.out.println("Settings1/Switch8 = 1\n");
        } else {
            System.out.println("Settings1/Switch8 = Invalid Input! Third octet must be 0 or 1.\n");
        }

        if (decNum >= 128) {
            System.out.println("Settings2/Switch8 = 1");
        } else {
            System.out.println("Settings2/Swtich8 = 0");
        }

        for (int j = iterCounter - 1, i = iterCounter; j > 0; i--, j--) {
            System.out.printf("Settings2/Switch%d = %d%n", j, binaryRet[j]);

        }
        System.out.println("Press any key to exit.");
        String breakPoint = userInput.next();

    }
}
