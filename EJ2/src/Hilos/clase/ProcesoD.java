package Hilos.clase;

public class ProcesoD implements Runnable {

    private final int n;

    public ProcesoD(int n){
        this.n=n;
    }

    public void asteriscos (int n){
        for (int i=1; i<=n; i++){
            System.out.println(i+": "+"*" + " :");
        }
    }


    @Override
    public void run() {
        asteriscos(n);
    }
}
