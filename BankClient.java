/**
 * Created by sq on 2017-06-15.
 */
public class BankClient {

   public String firstName;
   public String lastName;
   public double balance;
   public int pin;

   public static String depositRecord = "The user deposited: ";
   public static String withdrawRecord = "The user withdrew: ";

    public BankClient(){

        firstName = "";
        lastName = "";
        balance = 0.0;
        pin = 0;

    }

    public BankClient(String firstName, String lastName, double balance, int pin){

        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.pin = pin;

    }


}
