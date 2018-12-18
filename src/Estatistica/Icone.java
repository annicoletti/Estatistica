/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estatistica;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;

/**
 *
 * @author administrador
 */
public class Icone extends JFrame{
    
    URL caminhoImagem;
    Image iconeTitulo;
    
    public Icone(){
        caminhoImagem = this.getClass().getClassLoader().getResource("ico.png");
        iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
