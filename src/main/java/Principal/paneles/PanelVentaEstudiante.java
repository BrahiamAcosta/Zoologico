/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;
import Principal.InitView;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Brahiam
 */
public class PanelVentaEstudiante extends JPanel{
    private InitView principal;
    private JPanel panelbotones;
    private JButton btnIndividual;
    private JButton btnFamiliar;
    private JButton btnregresar;
    
    public PanelVentaEstudiante(InitView principal){
        this.principal = principal;
        this.setLayout(new GridLayout(1,3,50,0));
        setBounds(50,250,800,250);
        
        // Botón de individual
        btnIndividual = new JButton("Estudiante");
        btnIndividual.setPreferredSize(new Dimension(200, 250));
        add(btnIndividual);
        
        //regresar
        btnregresar = new JButton("Regresar");
        btnIndividual.setPreferredSize(new Dimension(200, 250));
        add(btnIndividual);
        
        // Botón de familiar
        btnFamiliar = new JButton("Regular");
        btnFamiliar.setPreferredSize(new Dimension(200, 250));
        add(btnFamiliar);
        panelbotones = new JPanel();
        panelbotones.add(this);
        
        btnIndividual.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                // Mostramos los botones anteriores
                principal.showPrincipal();
            }
        });
}
}
