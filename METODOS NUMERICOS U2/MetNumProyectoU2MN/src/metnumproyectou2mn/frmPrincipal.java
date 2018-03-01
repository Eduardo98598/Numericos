/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metnumproyectou2mn;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmPrincipal extends JFrame {

    //CARLOS EDUARDO CUPUL HAU 
    JLabel lblName, lblXI, lblXS, lblHasta;
    JTextField txtXI, txtXS,txtHasta;
    JButton btnOk, btnguardar;
   public static String tempxi;
   public static String tempxs;
   public static String Hasta;
  

    public frmPrincipal() {
        super("Metodo Bisección");

        lblName = new JLabel("Metodo de Biseccion : X^3+4X^2-10=0");

        JPanel Plname = new JPanel();

        FlowLayout n = new FlowLayout();
        Plname.setLayout(n);
        lblName = new JLabel("Metodo de Biseccion : X^3+4X^2-10=0");
        Plname.add(lblName);
        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout(3, 2);
        panelDatos.setLayout(gl);
        lblXI = new JLabel("Ingresa (Xi)");
        txtXI = new JTextField(5);
        lblXS = new JLabel("Ingresa (Xs)");
        txtXS = new JTextField(5);
        lblHasta= new JLabel("Numero de Iteraciones");
        txtHasta= new JTextField(5);
        panelDatos.add(lblXI);
        panelDatos.add(txtXI);
        panelDatos.add(lblXS);
        panelDatos.add(txtXS);
        panelDatos.add(lblHasta);
        panelDatos.add(txtHasta);

        JPanel Plbtn = new JPanel();
        FlowLayout btn = new FlowLayout();
        Plbtn.setLayout(btn);
        btnOk = new JButton("Mostrar Iteraciones");
        btnguardar= new JButton("Guardar Iteracion");
        Plbtn.add(btnOk, BorderLayout.EAST);
        Plbtn.add(btnguardar, BorderLayout.WEST);

        Container cp = getContentPane();
        cp.add(Plname, BorderLayout.NORTH);
        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(Plbtn, BorderLayout.SOUTH);
        btnguardar.addActionListener(new manejadorG());
        btnOk.addActionListener(new ManejadorOK());
        btnOk.setEnabled(false);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(320, 150);
        setVisible(true);
        setResizable(false);
      
    }

    private class manejadorG implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            
           tempxi=txtXI.getText();
          tempxs=txtXS.getText();
         Hasta= txtHasta.getText();
        
    /*
          fDatos impresion=new  fDatos();
         impresion.setVarI(1);
         impresion.setVarXI((Double.parseDouble(txtXI.getText())));
         impresion.setVarXS((Double.parseDouble(txtXS.getText())));
         
         
          fDatos dl=null;
          
        
         
         dl= new fDatos(1,(Double.parseDouble(txtXI.getText())),(Double.parseDouble(txtXS.getText())) , 1.5, 2.375, -5,-11.87, 0.5);
        
          tempxi=(Double.parseDouble(txtXI.getText()));
          tempxs=(Double.parseDouble(txtXS.getText()));
         /* datos.setVarXI(tempxi);
          datos.setVarXS(tempxs);*/
          //fDatos datos=new fDatos(1,tempxi,tempxs,5.0,6.0,8.0,2.0,0.1);*/
          btnOk.setEnabled(true);
        }
         
    
    }
    
   
    
    private class ManejadorOK implements ActionListener {
                        
        @Override
        public void actionPerformed(ActionEvent e) {
            
             
            if (e.getSource() == btnOk) {
                try {
                    if (txtXI.getText().equals("") && txtXS.getText().equals("") && txtHasta.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "LLENA TODOS LOS CAMPOS PARA GUARDAR");
                        txtXI.setText("");
                        txtXS.setText("");
                        txtHasta.setText("");
                    } else {
                       
                          MetodoBisec v1 = new MetodoBisec();
                v1.show();
                 System.out.println(tempxi);
                 System.out.println(tempxs);
                 //System.out.println(datos.getVarXI());
                 
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "LLena los campos correctamente, ocurrio un error de tipo "+ ex.toString());
                }
          
               
            }
        }
    }
  


}
