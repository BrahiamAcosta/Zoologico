/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Principal.View.InitView;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Brahiam
 */
public class PanelVentaRegular extends JPanel{
    private InitView principal;
    private int id;
    private String nombre;
    
    public PanelVentaRegular(InitView principal, int id){
        this.principal = principal;
        this.id = id;
        
        this.setLayout(new GridLayout(2,2,50,0));
        setBounds(50,250,800,200);
        
        JLabel ide = new JLabel("ID (sin puntos y solo numeros):");
        ide.setFont(new Font("Arial",Font.BOLD,15));
        ide.setHorizontalAlignment(JLabel.CENTER);
        ide.setBounds(50, 300, 600, 50);
        add(ide);
    }
}
