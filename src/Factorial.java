public class Factorial implements Runnable {

    int[] list;

    public Factorial(int[] a){
        this.list = a;
    }
    public void run(){
        int resultado = 0;
        for (int i = 0; i < list.length; i++){
            if (list[i] != 0){
                for (int j = 1; j < i; j++){
                    resultado = resultado * i;
                }
                System.out.println(Thread.currentThread().getName() + ". El resultado para este Thread con factor de " + i + " es: " + resultado);
            }
        }

    }
}
