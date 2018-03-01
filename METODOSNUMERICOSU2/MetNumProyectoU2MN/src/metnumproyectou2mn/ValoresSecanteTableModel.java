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
public class ValoresSecanteTableModel extends AbstractTableModel {
    public ArrayList<MetSecante> metSecantePojos;
    private String nombreColumnas[]={"Nº i","Xi","Xi-1","F(Xi)","F(Xi-1)","Raiz","Error"};
    
    public ValoresSecanteTableModel(ArrayList<MetSecante> metSecantePojos){
        this.metSecantePojos=metSecantePojos;
    }

    public ArrayList<MetSecante> getMetSecantePojos() {
        return metSecantePojos;
    }

    public void setMetSecantePojos(ArrayList<MetSecante> metSecantePojos) {
        this.metSecantePojos = metSecantePojos;
    }
    
    @Override
    public int getRowCount() {
        return metSecantePojos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MetSecante valorMetNum=metSecantePojos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return valorMetNum.getNumIteracion();
            case 1:
                return valorMetNum.getValorXi();
            case 2:
                return valorMetNum.getValorXi1();
            case 3:
                return valorMetNum.getFxi();
            case 4:
                return valorMetNum.getFxi1();
            case 5:
                return valorMetNum.getRaiz();
            case 6:
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
