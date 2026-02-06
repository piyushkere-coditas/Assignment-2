import java.util.*;

public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");

        try{
            int age = sc.nextInt();
            if(age<18){
                throw new InputMismatchException("InvalidAgeException");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Age: "+e.getMessage());
        }
    }
}