package com.partials;

import java.awt.Color;

import javax.swing.JButton;

public class cButton extends JButton {

    public cButton(String text,int x,int y,int width,int height) {
        super();
        setText(text);
        setBounds(x, y, width, height);
        setBackground(Color.WHITE);
    }

}
