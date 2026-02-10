package question7;

public enum orderStatus {
    PLACED("Order has been placed"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order has been delivered"),
    CANCELLED("Order has been cancelled");

    private String message;

    orderStatus(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

