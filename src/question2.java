import java.util.*;

class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String str){
        super(str);
    }
}

public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");

        try{
            int age = sc.nextInt();
            if(age<18){
                throw new InvalidAgeException("Invalid age");
            }
        }
        catch(InvalidAgeException e){
            System.out.println("Invalid Age: "+e.getMessage());
        }
        finally {
            System.out.println("Program Executed");
        }
    }
}

