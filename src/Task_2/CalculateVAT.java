package Task_2;

public class CalculateVAT {


    public CalculateVAT(){

    }
    public static double doVAT(double number){
        double VAT = number / 100 * ComputeVAT.PRCVAT;
        return VAT;
    }
}
