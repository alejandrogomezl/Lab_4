package PackCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Event handling in Java

public class Calculadora implements ActionListener {

    private final JTextField t=new JTextField();
    private final JButton[] buttons ={new JButton("1"),new JButton("2"),new JButton("3"),new JButton("4"),
                       new JButton("5"),new JButton("6"),new JButton("7"),new JButton("8"),
                       new JButton("9"),new JButton("0"),new JButton("."),new JButton("+"),
                       new JButton("-"),new JButton("*"),new JButton("/"),new JButton("=")
                       };
    private final JButton bdel=new JButton("Delete");
    private final JButton bclr=new JButton("Clear");
    private double a;
    private double b;
    private double result;
    private int operator;


    public Calculadora() {

        a=b= result = operator =0;

        JFrame f = new JFrame("Calculadora");
        t.setBounds(30, 40, 280, 30);
        f.add(t);
        int indice=0;
        for (int x = 40; x <= 250; x = x + 70) {
            for (int y = 100; y <= 310; y = y + 70) {
                buttons[indice].setBounds(x, y, 50, 40);
                f.add(buttons[indice]);
                indice++;
            }
        }

        bdel.setBounds(60, 380, 100, 40);
        bclr.setBounds(180, 380, 100, 40);
        f.add(bdel);
        f.add(bclr);



        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Is used HIDE_ON_CLOSE by default and a program stays active in the memory        f.setResizable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        f.setIconImage(icon);
        f.setLocationRelativeTo(null); //is placed in the center

        // add the listeners

    }
// SECTION 1. MAKE THE PROGRAM RESPOND TO ALL POSSIBLE EVENTS CAUSED BY
// THE MOUSE IN THE CALCULATOR'S HANDLING

// NAME OF APPROPRIATE METHOD TO PROCESS EVENTS {

/*

COMPOSE THE NUMBER SO THAT IT APPEARS IN THE TEXT BOX

IF THE + BUTTON IS PRESSED, CONVERT THE TEXT IN THE BOX TO A DOUBLE AND MAKE IT EMPTY.
SET THE VALUE OF THE VARIABLE OPERATOR

DO SOMETHING SIMILAR WITH THE REST OF THE OPERATORS

IF THE = BUTTON IS PRESSED, CALL THE Operate METHOD

IF THE Clear BUTTON IS PRESSED, CLEAR THE TEXT BOX

IF THE Delete BUTTON IS PRESSED, USE A StringBuilder TO DELETE A CHARACTER FROM THE SEQUENCE*/

      t.requestFocus(); // PlACE A focal point in the field again.


    }

    private void Operar() {
        b = Double.parseDouble(t.getText());
// PERFORM THE APPROPRIATE OPERATION BASED ON THE VALUE OF THE OPERATOR VARIABLE
// AND DISPLAY THE VALUE OF THE VARIABLE IN THE TEXT BOX

        Copy code
    }
}

// SECTION 2. MAKE THE CALCULATION WHEN THE ENTER KEY IS PRESSED USING THE KeyListener INTERFACE

// SECTION 3. MAKE THE PROGRAM PROMPT US WHETHER WE ARE SURE TO EXIT THE APPLICATION OR NOT WHEN WE PRESS THE "X" BUTTON LOCATED IN THE UPPER RIGHT CORNER OF THE WINDOW.