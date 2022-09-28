public class Factorialmain {
    public static void main(String[] args) {

        Factorial f = new Factorial();
        Thread t1 = new Thread(f);
        t1.start();
    }



}
