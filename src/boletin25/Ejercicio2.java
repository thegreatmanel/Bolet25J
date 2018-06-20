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
   public class Ejercicio2 extends JFrame implements ActionListener{
    
    private JButton prog_btn,bases_btn;
    private JPanel panel;
    
    public Ejercicio2(){
        panel = new JPanel();
        this.setBounds(600, 400, 300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CURSO DAM");
        prog_btn=new JButton("Programacion");
        bases_btn=new JButton("Bases de datos");
        prog_btn.addActionListener(this);
        bases_btn.addActionListener(this);
        panel.add(prog_btn);
        panel.add(bases_btn);
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prog_btn){
            this.setTitle("Programacion");
        }else{
            this.setTitle("Bases de datos");
        }
    }
    
}
