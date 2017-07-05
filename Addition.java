import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        System.out.printf("La suma es %d%n", num1 + num2);
    }
}
