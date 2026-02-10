package question7;

public class OrderTest{
    public static void main(String[] args) {
        orderStatus status = orderStatus.PLACED;

        System.out.println("Order Status: "+status);
        System.out.println("Message: "+status.getMessage());
    }
}
