package Hilos.clase;

import Hilos.clase.Auto;

import javax.swing.*;
import java.awt.event.*;

public class ProcesoF implements Runnable {

    @Override
    public void run() {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Ingreso de Datos del Auto");
            ventana.setSize(350, 250);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLayout(null);

            JLabel Marca = new JLabel("Marca:");
            Marca.setBounds(30, 20, 100, 25);
            ventana.add(Marca);

            JTextField campoMarca = new JTextField();
            campoMarca.setBounds(120, 20, 180, 25);
            ventana.add(campoMarca);

            JLabel Modelo = new JLabel("Modelo:");
            Modelo.setBounds(30, 60, 100, 25);
            ventana.add(Modelo);

            JTextField campoModelo = new JTextField();
            campoModelo.setBounds(120, 60, 180, 25);
            ventana.add(campoModelo);

            JLabel Precio = new JLabel("Precio:");
            Precio.setBounds(30, 100, 100, 25);
            ventana.add(Precio);

            JTextField campoPrecio = new JTextField();
            campoPrecio.setBounds(120, 100, 180, 25);
            ventana.add(campoPrecio);

            JButton boton = new JButton("Procesar");
            boton.setBounds(100, 150, 120, 30);
            ventana.add(boton);

            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Auto auto = new Auto();
                    auto.setMarca(campoMarca.getText());
                    auto.setModelo(campoModelo.getText());

                    try {
                        auto.setPrecio(Integer.parseInt(campoPrecio.getText()));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(ventana, "El precio debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    String mensaje = "Marca: " + auto.getMarca() +
                            "\nModelo: " + auto.getModelo() +
                            "\nPrecio: $" + auto.getPrecio();

                    JOptionPane.showMessageDialog(ventana, mensaje, "Datos del Auto", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            ventana.setVisible(true);
        });
    }
}