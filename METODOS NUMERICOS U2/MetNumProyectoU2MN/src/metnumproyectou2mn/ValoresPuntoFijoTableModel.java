/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metnumproyectou2mn;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Adrian
 */
public class ValoresPuntoFijoTableModel extends AbstractTableModel {
    public ArrayList<MetPuntoFijo> metPuntoFijoPojos;
    private String nombreColumnas[]={"Nº i","Xi","F(x)","F'(x)","Xi+i","Error"};
    
    public ValoresPuntoFijoTableModel(ArrayList<MetPuntoFijo> metPuntoFijoPojos){
        this.metPuntoFijoPojos=metPuntoFijoPojos;
    }

    public ArrayList<MetPuntoFijo> getMetPuntoFijoPojos() {
        return metPuntoFijoPojos;
    }

    public void setMetPuntoFijoPojos(ArrayList<MetPuntoFijo> metPuntoFijoPojos) {
        this.metPuntoFijoPojos = metPuntoFijoPojos;
    }
    
    @Override
    public int getRowCount() {
        return metPuntoFijoPojos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MetPuntoFijo valorMetNum=metPuntoFijoPojos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return valorMetNum.getNumIteracion();
            case 1:
                return valorMetNum.getValorXi();
            case 2:
                return valorMetNum.getFx();
            case 3:
                return valorMetNum.getfDerX();
            case 4:
                return valorMetNum.getXii();
            case 5:
                return valorMetNum.getErrorResult();
            default:
                return null;
        }
        
    }
      
    @Override
    public String getColumnName(int column){
        return nombreColumnas[column];
    }
    
}
