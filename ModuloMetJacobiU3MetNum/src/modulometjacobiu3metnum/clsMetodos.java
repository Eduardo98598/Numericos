
package modulometjacobiu3metnum;

import java.lang.reflect.Array;

public class clsMetodos {
    
    double ArrayRes[][]= new double[JFPreDatoMetJacobiU3MetNum.numFilasMatriz][JFPreDatoMetJacobiU3MetNum.numColumnasMatriz];
    double ArrayFinal[]= new double[JFPreDatoMetJacobiU3MetNum.numFilasMatriz];
    double acum=0;
    double mult=0;
    public double[] multVect(double datos[][], double x[], double c[])
    {
   for (int fil = 0; fil < JFPreDatoMetJacobiU3MetNum.numFilasMatriz; fil++) {

            for (int col = 0; col < JFPreDatoMetJacobiU3MetNum.numColumnasMatriz; col++) {

               mult=(datos[fil][col]*x[col]);
               acum= acum+mult;
              // ArrayFinal[col]= ArrayFinal[col]+acum;
              // System.out.print(ArrayFinal[col]+" , ");
               //System.out.print(acum);
               
            }
            ArrayFinal[fil]=acum+ c[fil];
        //System.out.print( ArrayFinal[fil]);    
            
    acum=0;
   // System.out.println("");
    }
        return this.ArrayFinal;
    
    
    
    

    }
}
