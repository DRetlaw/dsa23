public class AscendingNaturals {
    public static void main(String s[]){
        int n =10;
        countNaturals(n);
    }

    public static void countNaturals(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        countNaturals(n-1);
        System.out.println(n);
    }
}
