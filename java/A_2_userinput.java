import java.util.Scanner; // external code has imported

public class A_2_userinput {
    public static void main(String[] args) {
        try (// Scanner class
        Scanner sc = new Scanner(System.in)) {
            // SYSTEM.IN means the user wants keyboard input
            // Scanner class has lot of method
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum is : " + sum);

            System.out.println("Enter the decimal number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the decimal number: ");
            double num2 = sc.nextDouble();
            double sum2= num1+num2;
            System.out.println("The double difference is : "+ sum2);

            System.out.println("Enter the string : ");
            String str = sc.next();// It will read the whole word,after space it wont read
            System.out.println(str);
            System.out.println("Enter the string");
            String str2= sc.nextLine();// It will read the whole line
            System.out.println(str2);
        }
    }
}
