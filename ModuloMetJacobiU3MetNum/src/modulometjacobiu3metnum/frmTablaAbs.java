/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulometjacobiu3metnum;

import javax.swing.table.DefaultTableModel;

public class frmTablaAbs extends DefaultTableModel{
 
    
    
    frmTablaAbs(Double [][] data, String [] columnNames)
    {
    
    super(data, columnNames);
    }
    
    Class[] types= new Class[]
    {
    java.lang.Double.class, java.lang.Double.class
    };
  
}
