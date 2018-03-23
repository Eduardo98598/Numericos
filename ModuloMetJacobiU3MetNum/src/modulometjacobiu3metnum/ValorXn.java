/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulometjacobiu3metnum;

import java.util.ArrayList;

/**
 *
 * @author computo1
 */
public class ValorXn {
    //Atributos de la clase para resolución...
    private double valA;
    private double valX;
    private double valC;
    private double resValorXn;
    
    public ValorXn(){
        //Constructor vacío con valores por default...
        this.valA=0;
        this.valX=0;
        this.valC=0;
        this.resValorXn=0;
    }

    //Método para ir calculando la suma de resultados entre las matrices A y X...
    public double calcularSumaValorIndividual(double valA,double valX){
        return this.resValorXn+=(valA*valX);
    }
    //Método para calcular el valor de Xn correspondientes...
    public double calcularValorXn(double valC){
        return this.resValorXn+valC;
    }
    
    //Getter's y Setter's...
    public double getValA() {
        return valA;
    }

    public void setValA(double valA) {
        this.valA = valA;
    }

    public double getValX() {
        return valX;
    }

    public void setValX(double valX) {
        this.valX = valX;
    }

    public double getValC() {
        return valC;
    }

    public void setValC(double valC) {
        this.valC = valC;
    }

    public double getResValorXn() {
        return resValorXn;
    }

    public void setResValorXn(double resValorXn) {
        this.resValorXn = resValorXn;
    }
 
    
    public static ArrayList<ValorXn>getValorXn()
    {
    ArrayList<ValorXn> datos=new   ArrayList<ValorXn>();
    ValorXn c1= new ValorXn();
    datos.add(c1);
    return datos;
    }
}
