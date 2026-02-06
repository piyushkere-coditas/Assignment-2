import java.util.InputMismatchException;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Error caught: "+e);
        }
        catch (InputMismatchException e){
            System.out.println("Error: " +e);
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
        finally{
            System.out.println("Done!");
        }
    }
}

