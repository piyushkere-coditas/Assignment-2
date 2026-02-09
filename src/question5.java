class HarryPotter{
    String name = "Harry";
}

public class question5 {

    public static void add_ten(int a){
        int c =  a+10;
        System.out.println("Method Executed, C: "+c);
    }

    public static String changeName(HarryPotter objName){
        objName.name = "Ron";
        return objName.name;
    }

    public static void main(String[] args){
        int num = 20;
        System.out.println("Before method is called: "+num);
        add_ten(num);
        System.out.println("After method is called: "+num);

        System.out.println();

        HarryPotter harry = new HarryPotter();
        HarryPotter harry1 = new HarryPotter();
        System.out.println("Before method is called: "+harry.name);
        String objCalled = changeName(harry);
        System.out.println("Returned by method: "+objCalled);
        System.out.println("After object is passed to method: "+harry.name);
        System.out.println("After calling method for different object: "+harry1.name);
    }
}
