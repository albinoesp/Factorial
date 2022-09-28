import java.util.ArrayList;

public class Factorialmain {
    public int[] list;
    public Factorialmain(int[] list) {
        this.list = list;
    }
    public static void main(String[] args) {
        int[] a ;
        a = new int[args.length];
        for(int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }
        Factorialmain array = new Factorialmain(a);

        Factorial f = new Factorial();
        Thread t1 = new Thread();
        Thread t2 = new Thread(f);
        t1.setName("+Thread 1+");
        t2.setName("+Thread 2+");
        t1.start();
        t2.start();
    }



}
