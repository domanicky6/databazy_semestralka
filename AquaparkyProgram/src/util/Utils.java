 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Trieda v toréj sú metódy pre výpis, hash hesla, a uloženie
 * @author Igor
 */
public class Utils {
       
    /**
     * Metóda pre výpis
     * @param chyba 
     */
    public static void vypisChybu(String chyba) {
        JOptionPane.showMessageDialog(null,
                chyba,
                "Chyba",
                JOptionPane.ERROR_MESSAGE);
    }
/**
 * Metóda pre výpis
 * @param sprava 
 */
    public static void vypisOznam(String sprava) {
        JOptionPane.showMessageDialog(null,
                sprava,
                "Oznam",
                JOptionPane.INFORMATION_MESSAGE);
    }
/**
 * Metóda pre výpis
 * @param title
 * @param sprava 
 */
    public static void vypis(String title, String sprava) {
        JOptionPane.showMessageDialog(null,
                sprava,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }
/**
 * Metóda pre výpis
 * @param chyba 
 */
    public static void vypisChybuAUkonci(String chyba) {
        JOptionPane.showMessageDialog(null,
                chyba,
                "Chyba",
                JOptionPane.ERROR_MESSAGE);

        System.exit(0);
    }
/**
 * Metóda pre výpis do scrollBaru
 * @param nadpis
 * @param text
 * @param linkNaIkonu 
 */
    public static void vypisDoScroll(String nadpis, String text, String linkNaIkonu) {

        JScrollPane scrollPane = new JScrollPane(new JLabel(text));
        scrollPane.setPreferredSize(new Dimension(1000, 400));
        Object message = scrollPane;

        JTextArea textArea = new JTextArea(text);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("Serif", Font.PLAIN, 16));
        textArea.setWrapStyleWord(true);
        textArea.setMargin(new Insets(5, 5, 5, 5));
        scrollPane.getViewport().setView(textArea);
        message = scrollPane;

        JOptionPane.showMessageDialog(null,
                message,
                nadpis,
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon(linkNaIkonu));
    }
   
}
