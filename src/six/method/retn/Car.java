package retn;

public class Car {

    // Field
    int gas;


    // Constr



    // Method (void, this. = )
    void setGas(int gas) {
        this.gas = gas;
    }


    // Method (boolean)
    boolean isLeftGas() {
        if(gas==0) {
            System.out.println("no Gas");
            return false;
        }

        System.out.println("Gas");
        return true;
    }


    // Method (void, return)
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("Running (Remaining Amount of Gas :" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("Running (Remaining Amount of Gas :" + gas + ")");
                return;
            }
        }
    }


}
