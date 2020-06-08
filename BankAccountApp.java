import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
       

       List<Account> accounts = new LinkedList<Account>(); 
       
       String file = "original.csv";

        List<String[]> newAccountHolders = CSV.read(file);

        for(String[] accountHolder : newAccountHolders){
            // System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
           
            if(accountType.equalsIgnoreCase("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }else if(accountType.equalsIgnoreCase("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
                // System.out.println("Open a CHECKING ACCOUNT");
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
            
        }
        for(Account acc : accounts){
                System.out.println("\n******************");
                acc.showInfo();
            }
    }
}