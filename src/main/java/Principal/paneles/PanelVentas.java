/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Brahiam
 */
public class PanelVentas extends JPanel{
    private JPanel panelbotones;
    private JButton btnIndividual;
    private JButton btnFamiliar;
    public PanelVentas(){
        this.setLayout(new GridLayout(1,2,50,0));
        setBounds(50,250,800,250);
        
        // Botón de individual
        btnIndividual = new JButton("Individual");
        btnIndividual.setPreferredSize(new Dimension(200, 250));
        add(btnIndividual);
        
        // Botón de familiar
        btnFamiliar = new JButton("Familiar");
        btnFamiliar.setPreferredSize(new Dimension(200, 250));
        add(btnFamiliar);
        panelbotones = new JPanel();
        panelbotones.add(this);
        
        //Accion del boton Individual
        btnIndividual.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                panelbotones.setVisible(false);
                // Mostramos los botones anteriores
                PanelVentaEstudiante estudiante = new PanelVentaEstudiante();
                add(estudiante);
                estudiante.setVisible(true);
            }
        });
    }
}
