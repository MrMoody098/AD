
public class Ct {
	// add and mulptily method 
	public static int add(int num1, int num2) {
		
       result = num1 + num2;
       System.out.print(result);
	}
    public static int multiply(int num1, int num2) {
    	result = num1 * num2;
    	System.out.print(result);
    }
import java.util.Scanner;
    public static void main(String[] args){
        System.out.println("1. add two integers");
        System.out.println("2.mulitple two integers");
        System.out.println("3. exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("first number");
                int num1 = scanner.nextInt();
                System.out.println("+");
                int num2 = scanner.nextInt();
                System.out.println("=");
                System.out.println(add(num1,num2));
                break;

            case 2:
                System.out.print("first number");
                int num1 = scanner.nextInt();
                System.out.println("x");
                int num2 = scanner.nextInt();
                System.out.println("=");
                System.out.println(multiply(num1,num2));
                break;

            case 3:
                break;
        }
        scanner.close();
    }
}
