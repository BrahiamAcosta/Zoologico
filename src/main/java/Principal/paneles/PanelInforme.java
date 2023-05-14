/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal.paneles;

/**
 *
 * @author Brahiam
 */
import Principal.InitView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelInforme extends JPanel {
    private InitView prinipal;
    private JLabel informeLabel;
    private JButton regresarButton;

    public PanelInforme(InitView principal) {
        this.prinipal = principal;
        setLayout(new GridLayout(1,1));

        // Creamos el JLabel y lo añadimos al panel
        informeLabel = new JLabel("Informe generado exitosamente");
        informeLabel.setHorizontalAlignment(JLabel.CENTER);
        informeLabel.setBounds(50, 300, 800, 50);
        principal.add(informeLabel, BorderLayout.NORTH);;

        // Creamos el JButton y lo añadimos al panel
        regresarButton = new JButton("Regresar");
        principal.add(regresarButton, BorderLayout.SOUTH);
        
        regresarButton.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                // Eliminamos los botones de ventas
                setVisible(false);
                principal.remove(informeLabel);
                principal.remove(regresarButton);
                // Mostramos los botones anteriores
                principal.showPrincipal();
            }
        });
    }
}
