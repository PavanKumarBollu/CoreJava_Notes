package Basic;
public class CoumpoundIntrest {
    public static void main(String[] args) {
        
        double p = 12000d;
        double total = 0d;
        double grandTotal = 0d;

        for(int i = 1; i <=30; i++)
        {
            total = p * 1.08d;
            p = total;
            grandTotal += total;
            System.out.println(p);
        }
        System.out.println(grandTotal);
        System.out.println(12_00_0*30);


    }
}
