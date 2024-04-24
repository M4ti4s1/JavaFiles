import java.util.ArrayList;
import java.util.Scanner;

class Costumer{
    private ArrayList<Account> accounts;
    private String name;
    private String address;

    public Costumer(String name, String address){
        this.accounts =  new ArrayList<>();
        this.name = name;
        this.address = address;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public ArrayList<Integer> getAccounts(){
        ArrayList<Integer> accountNumbers = new ArrayList<>();
        for (Account account: accounts){
            accountNumbers.add(account.getAccount());
        }
        return accountNumbers;
    }
    public void info(){
        System.out.println("Name: "+ this.name);
        System.out.println("Address: "+ this.address);

        ArrayList<Integer> accountNumbers = new ArrayList<>();
        for (Account account: accounts){
            accountNumbers.add(account.getAccount());
        }

        for (int i=0;i< accountNumbers.size(); i++){
            System.out.println("Account # "+i+1);
            System.out.println("    Number: " +accountNumbers.get(i));
            System.out.println("    Balance: " +accounts.get(i).getBalance()+"\n");

        }

    }
}


class Account{
    private int accNumber;
    private float balance;

    public Account(int accNumber, float balance){
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public int getAccount(){
        return this.accNumber;
    }

    public float getBalance(){
        return this.balance;
    }

    public void deposit(float amount){
        balance += amount;
    }

    public boolean withdrawal(float amount){
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
        
    }

}




public class BankingSystem{

    public static void main(String[] args){
        Costumer Rick = new Costumer("Rick","Miami");
        Account rickBancoEstado = new Account(987690360,120000);
        Account rickPayPal = new Account(897689, 100000);

        Rick.addAccount(rickBancoEstado);
        Rick.addAccount(rickPayPal);

        Costumer Tom = new Costumer("Tom", "New-York");
        Account tomBancoEstado = new Account(153726730,120000);
        Account tomPayPal = new Account(675632, 100000);
        
        Tom.addAccount(tomBancoEstado);
        Tom.addAccount(tomPayPal);

        rickPayPal.deposit(10000);
        rickBancoEstado.withdrawal(24000);

        tomBancoEstado.deposit(7000);
        tomPayPal.withdrawal(200000);

        Rick.getAccounts();
        Tom.getAccounts();


        Rick.info();
        Tom.info();

        
    }
}



