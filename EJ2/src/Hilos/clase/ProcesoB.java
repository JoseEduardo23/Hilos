package Hilos.clase;

public class ProcesoB extends Thread {

    private final int n;

    public ProcesoB(int n){
        this.n=n;
    }

    public void contar(int n){
        for (int i=0; i<n; i++){
        System.out.println("Iteracion n:"+i);
        try{
            sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        }
    }

    @Override
    public void run() {
        contar(n);
    }
}
