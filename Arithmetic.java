import java.util.Scanner;

class Arithmetic{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number");
        float Num1 = in.nextFloat();
        System.out.println("Enter Second Number");
        float Num2 = in.nextFloat();
        System.out.println("\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
        System.out.println("Enter your choice: ");
        int choice = in.nextInt();
        

        switch (choice) {
            case 1:
                 float sum = Num1+Num2;
                 System.out.println("\n"+"sum is"+sum);
                break;
            case 2:
                 float sub = Num1-Num2;
                 System.out.println("\n"+"substraction is"+sub);
                break;
            case 3:
                 float mul = Num1*Num2;
                 System.out.println("\n"+"multiplication is"+mul);
                 
                break;
            case 4:
		 if(Num2==0)
		 {
			System.out.println("Invalid Division");
		 }
		 else{
                 float div = Num1/Num2;
                 System.out.println("\n"+"Division is"+div);
		}
                break;
        }
    }
}