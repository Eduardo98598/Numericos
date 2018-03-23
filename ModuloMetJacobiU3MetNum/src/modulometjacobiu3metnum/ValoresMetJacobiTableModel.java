/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulometjacobiu3metnum;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author computo1
 */
public class ValoresMetJacobiTableModel extends AbstractTableModel implements TableModelListener {
    //Declaración de variables que almacenarán los valores de la tabla...
    private Object valoresTabla[][];
    private String nombreColumnas[];
    private int numFilasMatriz;
    
    public ValoresMetJacobiTableModel(char tipoVector,int numFilasMatriz,int numColumnasMatriz){
        this.numFilasMatriz=numFilasMatriz;
        valoresTabla=new Object[numFilasMatriz][numColumnasMatriz];
        nombreColumnas=new String[numColumnasMatriz];
        //Según el char indicado (que señala el tipo de vector que es), se nombra a cada columna de ese mismo...
        switch (tipoVector) {     
           case 'R':
                /*Se establece un for para determinar el nombre de cada columna en caso de 
                  ser el vector 'A' (según dimensión indicada por usuario)...*/
                for (int contador = 0; contador < numColumnasMatriz; contador++) {
                    nombreColumnas[contador]= "-"+(contador+1)+"-";
                }
                break;
        }
        this.addTableModelListener(this);
    }
    
    public String[] generador(char tipoVector, int numFilasMatriz,int numColumnasMatriz)
    {
    switch (tipoVector) {     
           case 'R':
                /*Se establece un for para determinar el nombre de cada columna en caso de 
                  ser el vector 'A' (según dimensión indicada por usuario)...*/
                for (int contador = 0; contador < numColumnasMatriz; contador++) {
                    nombreColumnas[contador]= "-"+(contador+1)+"-";
                }
                break;
        }
    return   nombreColumnas;
    }
    
    @Override
    public int getRowCount() {
        return numFilasMatriz;
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public boolean isCellEditable(int fila,int columna){
        //Mediante este método, habilitamos la edición en la tabla...
        return true;
    }
    
    @Override
    public String getColumnName(int column){
        return nombreColumnas[column];
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        for(int contador=0;contador<numFilasMatriz;contador++){
            for(int contador1=0;contador1<nombreColumnas.length;contador1++){
                valoresTabla[contador][contador1]=getValueAt(contador,contador1);
            }
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
