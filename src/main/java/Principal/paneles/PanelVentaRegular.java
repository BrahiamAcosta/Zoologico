/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import Control.GestionVentas.Clientes;
import Principal.View.InitView;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brahiam
 */
public class PanelVentaRegular extends JPanel{
    private Clientes cliente;
    private InitView principal;
    private int id;
    private int puntos;
    private JTextField campoCantidad;
    private JCheckBox validarDescuento;
    private boolean descuento = false;
    
    public PanelVentaRegular(InitView principal, int id){
        this.principal = principal;
        this.id = id;
        this.cliente = new Clientes(id);
        this.puntos = cliente.getPuntos();
        
        this.setLayout(new GridLayout(6,1,0,10));
        setBounds(50,250,800,200);
        
        
        if(cliente.getPuntos()<200){
            //Jlabel auxiliar (para mantener la estructura)
            JLabel aux = new JLabel("");
            aux.setFont(new Font("Arial",Font.BOLD,15));
            aux.setHorizontalAlignment(JLabel.CENTER);
            aux.setBounds(50, 300, 600, 50);
            add(aux);
            }
        else{
            //Eleccion de descuento por puntos
            validarDescuento = new JCheckBox("Incluir descuento por puntos");
            validarDescuento.setFont(new Font("Arial",Font.BOLD,15));
            validarDescuento.setHorizontalAlignment(JLabel.CENTER);
            validarDescuento.setBounds(50, 300, 600, 50);
            add(validarDescuento);
            
            //validar si se quiere un descuento o no
            validarDescuento.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Obtener el estado actual del checkbox
                    boolean seleccionado = validarDescuento.isSelected();

                    // Actualizar el valor de verdad
                    descuento = seleccionado;
                    
                }
            });
        }
        
        JLabel ide = new JLabel("Cantidad de entradas");
        ide.setFont(new Font("Arial",Font.BOLD,15));
        ide.setHorizontalAlignment(JLabel.CENTER);
        ide.setBounds(50, 300, 600, 50);
        add(ide);
        
        this.campoCantidad = new JTextField(19);
        add(campoCantidad);
        
        
    }
}
