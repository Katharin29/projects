class BankAccount{
    private int accountNumber;
    private double balance;
    public BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}
    public class Main{
        public static void main(String[]args){
            BankAccount b=new BankAccount(23456,400.0);
            System.out.println(b.getAccountNumber()+" "+b.getBalance());
            b.setAccountNumber(5637);
            b.setBalance(700.0);
            System.out.println((int)b.getAccountNumber()+" "+(int)b.getBalance());
        }
    }
