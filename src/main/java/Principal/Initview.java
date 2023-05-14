/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import Principal.paneles.PanelVentaEstudiante;
import Principal.paneles.PanelVentas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Brahiam
 */
public class InitView extends JFrame{
    private JPanel panelPrincipal, panelBotones;
    private PanelVentas panelVentas = new PanelVentas(this);
    private JLabel labelTitulo;
    private JButton btnGestion, btnVentas, btnReporte;

    public InitView(){
        // Configuración del JFrame
        setTitle("Zoologico");
        setSize(900, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal y su layout
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        
        // JLabel con el título del zoologico
        labelTitulo = new JLabel("Zoologico Universidad de Antioquia");
        labelTitulo.setFont(new Font("Arial",Font.BOLD,44));
        labelTitulo.setHorizontalAlignment(JLabel.CENTER);
        labelTitulo.setBounds(50, 50, 800, 50);
        panelPrincipal.add(labelTitulo, BorderLayout.NORTH);
        
        // Panel de botones y su layout
        panelBotones = new JPanel(new GridLayout(1, 3, 50, 0));
        panelBotones.setBounds(50, 350, 800, 250);

        // Botón de gestión
        btnGestion = new JButton("Gestion");
        btnGestion.setPreferredSize(new Dimension(200, 250));
        panelBotones.add(btnGestion);

        // Botón de ventas
        btnVentas = new JButton("Ventas");
        btnVentas.setPreferredSize(new Dimension(200, 250));
        panelBotones.add(btnVentas);

        // Botón de reporte
        btnReporte = new JButton("Reporte");
        btnReporte.setPreferredSize(new Dimension(200, 250));
        panelBotones.add(btnReporte);

        // Agregamos el panel de botones al panel principal
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        
        btnVentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones anteriores
                panelBotones.setVisible(false);

                // Creamos el panel para los nuevos botones
                showPanelVenta();
            }
        });
        
        
        // Agregamos el panel principal al JFrame
        add(panelPrincipal);

        // Hacemos el JFrame visible
        setVisible(true);
        
        
    }

    public void showPanelVentaEstudiante(){
        PanelVentaEstudiante venta =new PanelVentaEstudiante(this); 
        panelPrincipal.add(venta,BorderLayout.CENTER);
        setVisible(true);  
    }
    public void showPanelVenta(){
        panelPrincipal.add(panelVentas);
    }
    public void showPrincipal(){
        panelBotones.setVisible(true);
    }
    
    public static void main(String[] args) {
        new InitView();
    }
    
}