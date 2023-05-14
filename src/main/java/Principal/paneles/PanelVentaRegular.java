/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Principal.View.InitView;
import javax.swing.JPanel;

/**
 *
 * @author Brahiam
 */
public class PanelVentaRegular extends JPanel{
    private boolean tieneGuia = false;
    private InitView principal;
    private int identificacion;
    private int cantPuntos;
    
    public PanelVentaRegular(InitView principal){
        this.principal = principal;
        
    }
}
