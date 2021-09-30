package ru.mirea.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Lake extends JFrame {
    public void paint(Graphics g)
    {
        super.paint(g);
        try {
            Image img = ImageIO.read(new File(getArgs()[0]));
            g.drawImage(img, 0, 0, null);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void createAndShowGUI() {
        Lake lake = new Lake();
    }

    private static final int WIDTH = 750;
    private static final int HEIGHT = 498;
    public Lake()
    {
        super("Lake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setVisible(true);
    }

    private static String[] savedArgs;
    public static String[] getArgs() { return savedArgs; }
    public static void main(String[] args) {
        savedArgs = args;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI(); }
        });
    }
}
