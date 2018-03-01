/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metnumproyectou2mn;
/**
 *
 * @author Adrian
 */
public class MetPuntoFijo {
    //Atributos de la clase para la resolución...
    private int numIteracion;
    private double valorXi;
    //Declaración de arreglos que contendrán los datos...
    private double fx;
    private double fDerX;
    private double xii;
    private double errorResult;
    
    public MetPuntoFijo(){
        //Método constructor vacío...
    }
    
    //Constructor implementado para la asignación de valores correspondientes a un problema de punto fijo...
    public MetPuntoFijo(double valorXi){
        this.valorXi=valorXi;
        /*A partir de la especificación del número de iteraciones del proceso, 
          ahora podemos definir la magnitud de cada arreglo...*/
        this.numIteracion=0;
        this.fx=0;
        this.fDerX=0;
        this.xii=0;
        this.errorResult=0;
    }
    
    //Método para calcular el resultado F(x)...
    public double calcularFx(){
        fx=(Math.exp(-1*(valorXi)))-valorXi;
        return fx;
    }
    //Método para calcular el resultado F'(x)...
    public double calcularFxDerivada(){
        fDerX=(-1*(Math.exp(-1*(valorXi))))-1;
        return fDerX;
    }
    //Método para calcular el resultado Xi+1...
    public double calcularXi1(){
        xii=valorXi-(calcularFx()/calcularFxDerivada());
        return xii;
    }
    //Método para calcular el resultado del margen de error...
    public double calcularError(){
        errorResult=((calcularXi1()-valorXi)/(calcularXi1()));
        return errorResult;
    }

    //Getter's y Setter's...
    public int getNumIteracion() {
        return numIteracion;
    }

    public void setNumIteracion(int numIteracion) {
        this.numIteracion = numIteracion;
    }

    public double getValorXi() {
        return valorXi;
    }

    public void setValorXi(double valorXi) {
        this.valorXi = valorXi;
    }

    public double getFx() {
        return fx;
    }

    public void setFx(double fx) {
        this.fx = fx;
    }

    public double getfDerX() {
        return fDerX;
    }

    public void setfDerX(double fDerX) {
        this.fDerX = fDerX;
    }

    public double getXii() {
        return xii;
    }

    public void setXii(double xii) {
        this.xii = xii;
    }

    public double getErrorResult() {
        return errorResult;
    }

    public void setErrorResult(double errorResult) {
        this.errorResult = errorResult;
    }
    
}
