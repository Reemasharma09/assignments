public class Account {
    String accountHolder;
    int balance;
    public Account(){}
    public Account(String accountHolder,int balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public static void main(String[] args) {
        Account holder1=new Account();
        Account holder2=new Account();
        System.out.println(holder1.accountHolder+holder1.balance);
         System.out.println(holder2.accountHolder+holder2.balance);
    }
}
