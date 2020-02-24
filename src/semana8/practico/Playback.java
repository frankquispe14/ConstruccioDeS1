/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practico;

/**
 *
 * @author FRANKLIN
 */
 import javax.swing.*;
 import java.awt.*;

 public class Playback extends JFrame {
 public Playback() {
 super("Playback");
 setSize(225, 80);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 FlowLayout dis = new FlowLayout();
 setLayout(dis);
 JButton play = new JButton("Play");
 JButton stop = new JButton("Stop");
 JButton pausa = new JButton("Pausa");
 add(play);
 add(stop);
 add(pausa);
 setVisible(true);
 }
 public static void main(String[] arguments) {
 Playback pb = new Playback();
 }
 }
