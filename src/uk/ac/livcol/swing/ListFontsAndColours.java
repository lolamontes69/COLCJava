/**
 * Filename:    ListFontsAndColours.java
 * Author:      Andrew Laing
 * Email:       parisianconnections@gmail.com
 * Date:        08/02/2018
 * Description:
 */

package uk.ac.livcol.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;


public class ListFontsAndColours implements ActionListener
{
    JComboBox cboFonts;
    JComboBox cboColours;

    JLabel lab1 =  new JLabel("LONDON");
    JLabel lab2 =  new JLabel("BERLIN");
    JLabel lab3 =  new JLabel("MOSCOW");
    JLabel lab4 =  new JLabel("BEIJING");


    public ListFontsAndColours()
    {
        JFrame frm = new JFrame();
        frm.setSize(350, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gl = new GridLayout(0, 2);
        frm.setLayout(gl);

        String fontnames[] = {"Verdana","Calabri","Doktum","STENCIL","Century Gothic"};
        cboFonts = new JComboBox(fontnames);

        String colours[] = {"Red","Green","Blue"};
        cboColours = new JComboBox(colours);

        JButton btnChangeFonts = new JButton("Change Font");
        JButton btnChangeColour = new JButton("Change Colour");

        frm.add(lab1);
        frm.add(lab2);
        frm.add(lab3);
        frm.add(lab4);
        frm.add(cboFonts);
        frm.add(btnChangeFonts);
        frm.add(cboColours);
        frm.add(btnChangeColour);

        btnChangeFonts.addActionListener(this);
        btnChangeColour.addActionListener(this);

        frm.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String action = (String) ae.getActionCommand();

        switch(action) {
            case "Change Font":
                changeFont();
                break;
            case "Change Colour":
                changeColour();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");
        }
    }

    public void changeColour()
    {
        String newColour = (String) cboColours.getSelectedItem();

        switch (newColour)
        {
            case "Red":
                lab1.setForeground(Color.RED);
                lab2.setForeground(Color.RED);
                lab3.setForeground(Color.RED);
                lab4.setForeground(Color.RED);
                break;
            case "Blue":
                lab1.setForeground(Color.BLUE);
                lab2.setForeground(Color.BLUE);
                lab3.setForeground(Color.BLUE);
                lab4.setForeground(Color.BLUE);
                break;
            case "Green":
                lab1.setForeground(Color.GREEN);
                lab2.setForeground(Color.GREEN);
                lab3.setForeground(Color.GREEN);
                lab4.setForeground(Color.GREEN);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");
        }
    }

    public void changeFont()
    {
        String newFont = (String) cboFonts.getSelectedItem();

        lab1.setFont(new Font(newFont, Font.BOLD, 18));
        lab2.setFont(new Font(newFont, Font.BOLD, 18));
        lab3.setFont(new Font(newFont, Font.BOLD, 18));
        lab4.setFont(new Font(newFont, Font.BOLD, 18));
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListFontsAndColours lfac = new ListFontsAndColours();
            }
        });
    }

}
