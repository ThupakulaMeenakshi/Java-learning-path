public class BankConstructor {
    private long accountNo;
    private double balance;
    public BankConstructor(long AccountNo , double Balance)
    {
        this.accountNo = AccountNo;
        this.balance = Balance;
    }

    public static void main(String args[]) {
        BankConstructor obj = new BankConstructor(2291290, 51000);
        BankConstructor obj1 = new BankConstructor();
        System.out.println("This account has " + obj.balance);
        System.out.println("This account has " + obj.balance);
        
    }
}