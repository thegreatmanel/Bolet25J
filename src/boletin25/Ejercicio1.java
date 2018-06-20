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
public class Ejercicio1 extends JFrame implements ActionListener{
    
    private JButton premer_btn;
    private JLabel etiqueta_lbl;
    private JPanel panel = new JPanel();
    
    public Ejercicio1(){
        etiqueta_lbl=new JLabel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100, 200,100);
        premer_btn=new JButton("Premer");
        panel.add(premer_btn);
        panel.add(etiqueta_lbl);
        this.add(panel);
        premer_btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta_lbl.setText("Premeches o boton");
    }
}
