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

//this is an runtime exception because the exception is thrown after compiling the code,when
//the user enter age less than 18 then the exception is thrown manually,
//that's why this is runtime exception