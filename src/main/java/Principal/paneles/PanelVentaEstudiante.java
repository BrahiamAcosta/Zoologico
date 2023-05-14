/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;
import Principal.InitView;
import java.awt.Dimension;
import java.awt.Font;
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
    private JLabel confirmacion;
    private JButton regreso;
    
    public PanelVentaEstudiante(){
        this.setLayout(null);
        setBounds(50,250,800,250);
        //Label de confirmacion
        confirmacion = new JLabel("La venta ha sido exitosa");
        confirmacion.setFont(new Font("Arial",Font.BOLD,44));
        confirmacion.setHorizontalAlignment(JLabel.CENTER);
        confirmacion.setVerticalAlignment(JLabel.CENTER);
        
        //Boton de regreso al inicio
        regreso = new JButton("regresar al inicio");
        regreso.setPreferredSize(new Dimension(100,100));
        
        add(regreso);
        add(confirmacion);
        
        //accion boton regreso
        regreso.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos el panel
                setVisible(false);
                // Mostramos los botones anteriores
                new InitView();
            }
        });
    }
}
