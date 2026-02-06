public class question4 {
    private static int balance = 1000;

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        question4.balance += balance;
    }

    class Transaction{
        void deposit(int amount){
            setBalance(amount);
            System.out.println(getBalance());
        }

        void withdraw(int amount){
            balance -= amount;
            System.out.println(getBalance());
        }
    }
}

class mainClass{
    public static void main(String[] args){
        question4 outer = new question4();
        question4.Transaction inner = outer.new Transaction();

        inner.deposit(200);
        inner.withdraw(300);
        question4.getBalance();

    }
}
