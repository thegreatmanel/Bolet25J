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
public class Ejercicio3 extends JFrame implements ActionListener{
    
    private JButton saudo,despedida;
    private JPanel panel;
    private JLabel mensaxe;

    public Ejercicio3(String title){
        super(title);
        init();
    }
    private void init(){
        saudo=new JButton("saudo");
        despedida=new JButton("despedida");
        mensaxe=new JLabel();
        panel=new JPanel();
        panel.add(saudo);
        panel.add(despedida);
        panel.add(mensaxe);
        this.add(panel);
        saudo.addActionListener(this);
        despedida.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 300, 300, 100);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(saudo)){
            mensaxe.setText("Un saudo a DAM");
        }else{
            mensaxe.setText("fin do programa");
        }
    }
    
}
