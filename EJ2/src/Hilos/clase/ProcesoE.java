package Hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable {
    private final String D;
    public ProcesoE(String D){
        this.D=D;
    }

    public void saludar (String D){
        JOptionPane.showMessageDialog(null, D);
    }

    @Override
    public void run() {
        saludar(D);
    }
}
