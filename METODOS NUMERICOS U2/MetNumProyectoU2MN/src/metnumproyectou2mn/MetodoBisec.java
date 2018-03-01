/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metnumproyectou2mn;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MetodoBisec extends JFrame {
//CARLOS EDUARDO CUPUL HAU 
    //JTable tbDatos;
    JTextField txtcontador = new JTextField(5);
    JScrollPane brBarra;
    JButton btnSiguiente;
    fDatos cuenta=new fDatos();
    final absTable ds= new absTable();
     frmPrincipal inici=new frmPrincipal();
    int contador;
    public MetodoBisec()
    {
    super("Tabla de resultados");
    //tbDatos=new JTable(new absTable());
      final  JTable tbDatos=new  JTable(ds);
    brBarra=new JScrollPane(tbDatos);
    btnSiguiente=new JButton("Siguiente");
    this.add(brBarra, BorderLayout.CENTER);
    this.add(btnSiguiente,BorderLayout.SOUTH);
    btnSiguiente.setSize(50, 50);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setSize(600, 300);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    ManejadorSig drive= new ManejadorSig();
    btnSiguiente.addActionListener( drive);
    
     txtcontador.setText(String.valueOf(inici.Hasta));
  // txtcontador.setText(inici.Hasta);
  contador=Integer.parseInt(txtcontador.getText());
   
     //System.out.println(txtcontador.getText());
    }
    
    
    
    private class ManejadorSig implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          /*Object [] fila={2, 2.0, 3.0, 4.0, 5.0, 6.0,(7.0), 8.0};
          DefaultTableModel md=  (DefaultTableModel)tbDatos.getModel();
          md.addRow(fila);*/
           // almacenar aqui los datos y llevarlos al frame datos  aver si funcin
          //System.out.println(impresion.toString());
         // System.out.println(contador);
          //System.out.println(cuenta.vector[0]);
          
          if(cuenta.signo()<0)
          {
          double varXI=0;
           double varXs=0;
           double varXR=0;
           double varFXR=0;
           double varFXI=0;
           double signo=0;
           double error=0;
          btnSiguiente.setEnabled(false);
          fDatos dl=null;
          for(int c=cuenta.varI+1;c<=contador;c++)
          {
       
         System.out.println(cuenta.getVarSigno());
         
         if(cuenta.getVarSigno()<0)
         {
         varXI= cuenta.getVarXI(); 
         cuenta.setVarXI(varXI);
         varXs= cuenta.getVarXR();
         cuenta.setVarXS(varXs);
         varXR= (varXI+varXs)/2;
         cuenta.setVarXR(varXR);
         varFXR= ((Math.pow(varXR, 3))+(4*(Math.pow(varXR, 2)))-10);
         cuenta.setVarFXR(varFXR);
         varFXI=((Math.pow(varXI, 3))+(4*(Math.pow(varXI, 2)))-10);
         cuenta.setVarFXI(varFXI);
         signo= varFXR*varFXI;
         cuenta.setVarSigno(signo);
         error= Math.abs(((varXs-varXI)/varXs));
         cuenta.setVarError(error);
          dl= new fDatos(c,varXI,varXs,varXR,varFXR,varFXI,cuenta.getVarSigno(), error);
        ds.Siguiente(dl);
         }
         
         else
         {
         varXI= cuenta.getVarXR(); 
         cuenta.setVarXI(varXI);
         varXs= cuenta.getVarXS();
         cuenta.setVarXS(varXs);
         varXR= (varXI+varXs)/2;
         cuenta.setVarXR(varXR);
         varFXR= ((Math.pow(varXR, 3))+(4*(Math.pow(varXR, 2)))-10);
         cuenta.setVarFXR(varFXR);
         varFXI=((Math.pow(varXI, 3))+(4*(Math.pow(varXI, 2)))-10);
         cuenta.setVarFXI(varFXI);
         signo= varFXR*varFXI;
         cuenta.setVarSigno(signo);
         error= Math.abs(((varXs-varXI)/varXs));
         cuenta.setVarError(error);
          dl= new fDatos(c,varXI,varXs,varXR,varFXR,varFXI,cuenta.getVarSigno(), error);
        ds.Siguiente(dl);
         }
          }
        
         
         /*if(cuenta.getVarSigno() >0)
         {
         varXs= varXs;    
         varXI=varXR;
         }*/
          
         
          
         
       
          }
          else{
          JOptionPane.showMessageDialog(null, "No hay raiz en la region indicada");
          }
         
        }
    
    }
    
  // fDatos cont=new fDatos();
}
