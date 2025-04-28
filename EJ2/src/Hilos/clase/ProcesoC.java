package Hilos.clase;

public class ProcesoC extends Thread {

    private final int n;

    //constructor
    public ProcesoC(int n) {
        this.n = n;
    }

    public void dividir (int n){
        for (int i=10; i>-2; i--){
            System.out.println(n/i);
        }
    }
    
    @Override
    public void run() {
        dividir(n);
    }
}
