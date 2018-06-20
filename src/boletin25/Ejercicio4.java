/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author propa
 */
public class Ejercicio4 extends JFrame implements ActionListener{
    
    private JButton boton;
    private JPanel panel;
    private JFrame venta;
    
    public Ejercicio4(String title){
        super(title);
        init();
    }
    
    private void init(){
        boton=new JButton("Abrir Venta");
        panel=new JPanel();
        venta=new JFrame();
        venta.setBounds(600,100,200,200);
        panel.add(boton);
        this.add(panel);
        boton.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 600, 200, 100);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       venta.setVisible(true);
    }  
}
