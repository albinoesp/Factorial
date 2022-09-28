
public class Factorialmain {
    public static void main(String[] args) {
        int[] a ;
        a = new int[args.length];

        for(int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }

        Thread t1 = new Thread(new Factorial(a));
        Thread t2 = new Thread(new Factorial(a));
        t1.setName("+Thread 1+");
        t2.setName("+Thread 2+");
        t1.start();
        t2.start();
    }
}
