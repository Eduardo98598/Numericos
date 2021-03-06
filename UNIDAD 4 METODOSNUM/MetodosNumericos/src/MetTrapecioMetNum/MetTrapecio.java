package MetTrapecioMetNum;

public class MetTrapecio {
    //Constructor por default para la manipulación de valores...
    public MetTrapecio(){
        //Constructor vacío...
    }
    
    //En este método se calcula Ax con respecto al valor de N...
    public double h2(int b, int a, int n){  
        return (double) (b-a)/n;  
    }
    
    //Función evaluada para el funcionamiento del proceso que ofrece el método (función de ejemplo)...
   /* public double[] funcion1(double Xi[], int a, int n){
        double f[];
        f=new double[n+1];
        for(int i=0;i<=n;i++){          
                f[i]=Math.pow((1 + Math.pow(Xi[i], 2)), 0.5);     
        }
        return f;
    }
    */
    
     public double[] faih(int b, int a, int n){
        double auxaih[];
        double faux[];
        
        auxaih=new double[n+1];
        faux= new double [n+1];
        auxaih= this.AIH(b, a, n);
        for(int i=0;i<=n;i++){          
                faux[i]=Math.sqrt((1 + Math.pow(auxaih[i], 2)));     
        }
        return faux;
    }
    
     public double suma(int b, int a, int n){
        double suma[], fin=0;
        suma= new double [n+1];
        suma= this.faih(b, a, n);
        
       
        for(int i=0;i<=n;i++){          
            if(i>0 && i<n)
            {
                fin+=suma[i]; 
            }
            else{
        fin+=0;
        }
            
            
        }
        return fin;
    }
    
     
     public double[] AIH(int b, double a, int n){
        double ati[];
        double suma[];
        
       ati= new double [n+1];
       suma= new double [n+1];
        
        ati=this.h(b, a, n);
        for(int i=0; i<=n; i++)
        {
            suma[i]= a +(i*ati[i]);
        
        }
        return suma; 
    }
    
    
    public double[] h(int b, double a, int n){
        double h[];
        
        h= new double [n+1];
        for(int i=0; i<=n; i++)
        {
        h[i]=(b-a)/n;
        }
        return h; 
    }
    
    //Método que devuelve el valor resultante de todo el proceso con el método de MetSimpsonTercio 1/3...
    public double resultado(int b, int a, int n){
        return  (double) (this.h2(b, a, n)/2.0)  * ((Math.sqrt((1 + Math.pow(a, 2)))) + (2*this.suma(b, a, n)) +(Math.sqrt((1 + Math.pow(b, 2)))));  
    }
    
    public double resultado2(int b, int a, int n){
        return  (double) (this.h2(b, a, n))  * ((Math.sqrt((1 + Math.pow(a, 2)))) +(Math.sqrt((1 + Math.pow(b, 2)))));  
    }
    
    /// final metodos funcionando
    
    //Valor conjuntando la iteración para el funcionamiento del método...
    public double[] Xi(int a, double Ax, int n){
        double acum[];
        double sum=0;
        acum=new double[n+1];
        for(int i=0;i<=n;i++){
            if(i==0){
                sum+=a;
                acum[i]=sum;
            }
            else{
                sum+=Ax;
                acum[i]=sum;
            }               
        }
        return  acum;     
    }
    
    //Método que calcula el valor de K...
    public int[] K( int n){
        int Ki[];
        Ki=new int[n+1];
        for(int i=0;i<=n;i++){ 
            if(i==0)
                Ki[i]=1;
            else if(i==n)
                Ki[i]=1;
            else
                Ki[i]=2;            
        }
        return Ki;
    }
    
    //Método que calcula el valor de K con respecto a la función...
    public double[] K_funcion(int Ki[],double f[], int n){
        double K_f[];
        K_f=new double[n+1];
        for(int i=0;i<=n;i++){
            K_f[i]=f[i]* Ki[i];
        }
        return K_f;
    }
    
    //Calculando la sumatoria de los valores obtenidos...
    public double suma(double K_f[], int n){
        double sum=0;
        for(int i=0;i <=n;i++){
            sum+=K_f[i];
        }
        return sum;
    }
    
    
}
