/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Aron
 */
public class Labosi9 
{
    boolean prviBroj = true;
    boolean calculate = true;
    int operacija = -1; // -1 nije odabrana, 0 je puta, 1 je podjeljeno, 2 plus, 3 minus
    JFrame prozor = new JFrame("Kalkulator");

    final JLabel lbl = new JLabel("");
    final JLabel lblZnak = new JLabel("");
    final JLabel lbl2 = new JLabel("");
    final JLabel lblRezultat = new JLabel("");

    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");

    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");

    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");

    JButton btnDel = new JButton("C");
    JButton btn0 = new JButton("0");
    JButton btnEquals = new JButton("=");

    JButton btnPuta = new JButton("*");
    JButton btnPodjeljeno = new JButton("/");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");

    public Labosi9()
    {
        
        prozor.getContentPane().add(lbl);
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prozor.pack();
        prozor.setVisible(true);
        
        prozor.setSize(500, 600);

        
        prozor.getContentPane().setLayout(new GridLayout(0, 4));
        prozor.getContentPane().add(lbl);
        prozor.getContentPane().add(lblZnak);
        prozor.getContentPane().add(lbl2);
        prozor.getContentPane().add(lblRezultat);
        
        prozor.getContentPane().add(btn9);
        prozor.getContentPane().add(btn8);
        prozor.getContentPane().add(btn7);
        prozor.getContentPane().add(btnPuta);
        
        prozor.getContentPane().add(btn6);
        prozor.getContentPane().add(btn5);
        prozor.getContentPane().add(btn4);
        prozor.getContentPane().add(btnPodjeljeno);
        
        prozor.getContentPane().add(btn3);
        prozor.getContentPane().add(btn2);
        prozor.getContentPane().add(btn1);
        prozor.getContentPane().add(btnPlus);
        
        prozor.getContentPane().add(btnDel);
        prozor.getContentPane().add(btn0);
        prozor.getContentPane().add(btnEquals);
        prozor.getContentPane().add(btnMinus);
        
        
        // ------------------ brojevi -----------------
        
        btn0.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "0");
            else
                lbl2.setText(lbl2.getText() + "0");
        });
        btn1.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "1");
            else
                lbl2.setText(lbl2.getText() + "1");
        });
        btn2.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "2");
            else
                lbl2.setText(lbl2.getText() + "2");
        });
        btn3.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "3");
            else
                lbl2.setText(lbl2.getText() + "3");
        });
        btn4.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "4");
            else
                lbl2.setText(lbl2.getText() + "4");
        });
        btn5.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "5");
            else
                lbl2.setText(lbl2.getText() + "5");
        });
        btn6.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "6");
            else
                lbl2.setText(lbl2.getText() + "6");
        });
        btn7.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "7");
            else
                lbl2.setText(lbl2.getText() + "7");
        });
        btn8.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "8");
            else
                lbl2.setText(lbl2.getText() + "8");
        });
        btn9.addActionListener((ActionEvent e) -> {
            if(calculate)
                Reset();
            if(prviBroj)
                lbl.setText(lbl.getText() + "9");
            else
                lbl2.setText(lbl2.getText() + "9");
        });
        
        // ------------------ operacija -----------------
        
        btnPuta.addActionListener((ActionEvent e) -> {
            lblZnak.setText("*");
            prviBroj = false;
            operacija = 0;
        });
        btnPodjeljeno.addActionListener((ActionEvent e) -> {
            lblZnak.setText("/");
            prviBroj = false;
            operacija = 1;
        });
        btnPlus.addActionListener((ActionEvent e) -> {
            lblZnak.setText("+");
            prviBroj = false;
            operacija = 2;
        });
        btnMinus.addActionListener((ActionEvent e) -> {
            lblZnak.setText("-");
            prviBroj = false;
            operacija = 3;
        });
        
        // ------------------ reset i racun -----------------
        btnDel.addActionListener((ActionEvent e) -> {
            Reset();
        });      
        
        btnEquals.addActionListener((ActionEvent e) -> {
            if(lbl.getText().isEmpty() || lbl2.getText().isEmpty() || operacija < 0)
                return;
            Calculate();
        });      
        
    }
    
    public void Calculate()
    {
        double rez = 0;
        double a = Double.parseDouble(lbl.getText());
        double b = Double.parseDouble(lbl2.getText());
        switch(operacija)
        {
            case 0:
                rez = a * b;
                break;
            case 1:
                rez = a / b;
                break;
            case 2:
                rez = a + b;
                break;
            case 3:
                rez = a - b;
                break;
            default:
                lblRezultat.setText("Err");
                calculate = true;
                return;
        }
        
        
        lblRezultat.setText(String.valueOf(rez));
        calculate = true;
    }
    
    public void Reset()
    {
        lbl.setText("");
        lblZnak.setText("");
        lbl2.setText("");
        lblRezultat.setText("");
        prviBroj = true;
        operacija = -1;
        calculate = false;
    }

    public static void main(String[] args) 
    {
        Labosi9 x = new Labosi9();
    }
    
    
    
}
