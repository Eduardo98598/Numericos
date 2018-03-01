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
public class MetSecante {
    //Atributos de la clase para la resolución...
    private int numIteracion;
    private double valorXi;
    private double valorXi1;
    //Declaración de arreglos que contendrán los datos...
    private double fxi;
    private double fxi1;
    private double raiz;
    private double errorResult;
    
    public MetSecante(){
        //Método constructor vacío...
    }
    
    //Constructor implementado para la asignación de valores correspondientes a un problema de punto fijo...
    public MetSecante(double valorXi,double valorXi1){
        this.valorXi=valorXi;
        this.valorXi1=valorXi1;
        /*A partir de la especificación del número de iteraciones del proceso, 
          ahora podemos definir la magnitud de cada arreglo...*/
        this.numIteracion=0;
        this.fxi=0;
        this.fxi1=0;
        this.raiz=0;
        this.errorResult=0;
    }
    
    //Método para calcular el resultado F(xi)...
    public double calcularFxi(){
        fxi=(Math.exp(-1*(valorXi)))-valorXi;
        return fxi;
    }
    //Método para calcular el resultado F'(xi-1)...
    public double calcularFxi1(){
        fxi1=(-1*(Math.exp(-1*(valorXi1))))-valorXi1;
        return fxi1;
    }
    //Método para calcular el resultado de la raiz...
    public double calcularRaiz(){
        raiz=valorXi-((calcularFxi()*(valorXi1-valorXi))/(calcularFxi1()-calcularFxi()));
        return raiz;
    }
    //Método para calcular el resultado del margen de error...
    public double calcularError(){
        errorResult=((calcularRaiz()-valorXi)/(calcularRaiz()*100));
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

    public double getValorXi1() {
        return valorXi1;
    }

    public void setValorXi1(double valorXi1) {
        this.valorXi1 = valorXi1;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxi1() {
        return fxi1;
    }

    public void setFxi1(double fxi1) {
        this.fxi1 = fxi1;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getErrorResult() {
        return errorResult;
    }

    public void setErrorResult(double errorResult) {
        this.errorResult = errorResult;
    }
    
}
