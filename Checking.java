public class Checking extends Account{
    //list properties speific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to intialize checking account properites
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
        
    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }


    //list any method specific to checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account features" +
        "\n  Debit Card Number: " + debitCardNumber +
        "\n  Debit Card Pin: " + debitCardPin);

    }

}