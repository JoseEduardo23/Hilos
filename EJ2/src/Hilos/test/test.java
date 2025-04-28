package Hilos.test;

import Hilos.clase.*;

public class test {


    public static void main(String[] args){

        persona p = new persona();
        p.setNombre("Jose Lincango");
        p.setFech_Nacimiento("32 de marzo del 2004");
        p.setDireccion("AV-COCOGOT Y PSJE-10");

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Nacimiento: " + p.getFech_Nacimiento());
        System.out.println("Direccion: " + p.getDireccion());

        Thread f = new Thread(new ProcesoF());
        f.start();


        ProcesoA a = new ProcesoA("Eduardo");
        ProcesoB b = new ProcesoB(15);
        ProcesoC c = new ProcesoC(5);
        Runnable x = new ProcesoD(100);
        Thread d = new Thread(x);

        Runnable y = new ProcesoE("Hola como estas");
        Thread e = new Thread(y);

        e.start();
        c.start();
        a.start();
        b.start();
        d.start();
    }
}
