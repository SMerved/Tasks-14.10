package Task_2;

public class Controller {
    public Controller(){
        runController();
    }
    public static void runController() {
        double userIn =Dialog.doDiag();
        double moms = CalculateVAT.doVAT(userIn);
        View.doView(moms,ComputeVAT.MSG);
    }
}
