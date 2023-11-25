import java.util.HashMap;
import java.util.Map;

public class Implementation implements Operation{

    Atm atm = new Atm();
    Map<Double,String> statement = new HashMap<>();

    @Override
    public void check() {
        System.out.println("Available Balance Is: "+atm.getBalance());
    }

    @Override
    public void deposit(double depositAmount) {
        atm.setBalance(atm.getBalance()+depositAmount);
        statement.put(depositAmount," Amount Deposited");
        check();
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount<atm.getBalance()){
            statement.put(withdrawAmount," Amount Withdrawn");
            System.out.println("Collect The Cash "+withdrawAmount) ;
            atm.setBalance(atm.getBalance()-withdrawAmount);
            check();
        }
        else {
            System.out.println("Insufficient Funds!");
        }

    }

    @Override
    public void statement() {
        for(Map.Entry<Double,String> m:statement.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());

        }
        check();
    }

}
