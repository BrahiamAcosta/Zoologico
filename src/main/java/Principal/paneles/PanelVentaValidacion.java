/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Principal.View.InitView;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brahiam
 */
public class PanelVentaValidacion extends JPanel{
    private InitView principal;
    private JTextField campoId;
    
    public PanelVentaValidacion(InitView principal){
        this.principal = principal;
        this.setLayout(new GridLayout(1,3,100,0));
        setBounds(50,250,800,200);
        
        campoId = new JTextField(19);
    }
    
}
