package geometria;
import java.util.Scanner;
class FiguraGeometrica{
    protected float Area; 
    protected float Perimetro; 

    public FiguraGeometrica(float Area, float Perimetro) {
        this.Area = Area;
        this.Perimetro = Perimetro;
    }
    
    public float getArea() {
        return Area;
    }
    public void setArea(float Area) {
        this.Area = Area;
    }
    public float getPerimetro() {
        return Perimetro;
    }
    public void setPerimetro(float Perimetro) {
        this.Perimetro = Perimetro;
    }
    
    public String Mostrar() {
        return "FiguraGeometrica{" + "Area=" + Area + ", Perimetro=" + Perimetro + '}';
    }
}

class Circulo extends FiguraGeometrica{
    private int Radio; 
    private int Diametro;

    public Circulo(int Radio, int Diametro, float Area, float Perimetro) {
        super(Area, Perimetro);
        this.Radio = Radio;
        this.Diametro = Diametro;
    }

    public int getRadio() {
        return Radio;
    }
    public void setRadio(int Radio) {
        this.Radio = Radio;
    }
    public float getDiametro() {
        return Diametro;
    }
    public void setDiametro(int Diametro) {
        this.Diametro = Diametro;
    }
    
    public String Mostrar() {
        return "Circulo: " + "\nRadio= " + Radio + "\nDiametro= " + Diametro + " \nArea= " + Area + "\nPerimetro= " + Perimetro;
    }
    
    public void ActualizaArea(int Valor ){
       this.Area = Valor * Valor *3.1416f;
    }
    public void ActualizaPerimetro(int Valor){
        this.Perimetro = 2 * 3.1416f * Valor;
    } 
    public void leer(){
        System.out.println("\nIndrotuce el nuevo valor del Radio");
        Scanner sc = new Scanner(System.in);
        int NewRadio = sc.nextInt();
        this.Radio = NewRadio;
        this.Diametro = NewRadio * 2 ; 
        ActualizaArea(NewRadio);
        ActualizaPerimetro(NewRadio);
        System.out.println("\nValores del circulo actualizado");
    }
}

class Rectangulo extends FiguraGeometrica{
    private int  LadoA;
    private int LadoB; 

    public Rectangulo(int LadoA, int LadoB, float Area, float Perimetro) {
        super(Area, Perimetro);
        this.LadoA = LadoA;
        this.LadoB = LadoB;
    }
    
    public int getLadoA() {
        return LadoA;
    }
    public void setLadoA(int LadoA) {
        this.LadoA = LadoA;
    }
    public int getLadoB() {
        return LadoB;
    }
    public void setLadoB(int LadoB) {
        this.LadoB = LadoB;
    }
    
    public String Mostrar() {
        return "Rectangulo: " + "\nLado A= " + LadoA + "\nLado B= " + LadoB + " \nArea= " + Area + "\nPerimetro= " + Perimetro;
    }
    
    public void ActualizaArea(int NewLadoA , int NewLadoB ){
       this.Area = NewLadoA * NewLadoB;
    }
    public void ActualizaPerimetro(int NewLadoA , int NewLadoB){
        this.Perimetro = 2 * (NewLadoA + NewLadoB);
    } 
    
    public void EsCuadrado(){
        if(this.LadoA == this.LadoB) System.out.println("Es un cuadrado");
        else System.out.println("Si es un rectangulo");
    }
    
    public void leer(){
        System.out.println("\nIndrotuce los nuevos lados en orden (Lado A , Lado B)");
        Scanner sc = new Scanner(System.in);
        int NewLadoA = sc.nextInt();
        int NewLadoB = sc.nextInt();
        this.LadoA = NewLadoA;
        this.LadoB = NewLadoB; 
        ActualizaArea(NewLadoA , NewLadoB);
        ActualizaPerimetro(NewLadoA , NewLadoB);
        System.out.println("\nValores del rectangulo actualizados");
    }    
}

class Triangulo extends FiguraGeometrica{
     private int  LadoA;
     private int LadoB; 
     private int LadoC; 

    public Triangulo(int LadoA, int LadoB, int LadoC, float Area, float Perimetro) {
        super(Area, Perimetro);
        this.LadoA = LadoA;//Base
        this.LadoB = LadoB;//Altura
        this.LadoC = LadoC;//hipotenusa
    }

    public int getLadoA() {
        return LadoA;
    }
    public void setLadoA(int LadoA) {
        this.LadoA = LadoA;
    }
    public int getLadoB() {
        return LadoB;
    }
    public void setLadoB(int LadoB) {
        this.LadoB = LadoB;
    }
    public int getLadoC() {
        return LadoC;
    }
    public void setLadoC(int LadoC) {
        this.LadoC = LadoC;
    }
    
     public String Mostrar() {
        return "Triangulo: " + "\nLado A= " + LadoA + "\nLado B= " + LadoB +"\nLado C= " + LadoC + " \nArea= " + Area + "\nPerimetro= " + Perimetro;
    }
     
     public boolean EsValido(int LadoA , int LadoB , int LadoC){
         if(LadoA + LadoB > LadoC && LadoA + LadoC > LadoB && LadoB + LadoC > LadoA)
             return true; 
         else 
             return false;
     }
     
     public String TipoDeTriangulo() {
        if (this.LadoA == this.LadoB && this.LadoB == this.LadoC) 
                return "Equilatero";
       else if (this.LadoA == this.LadoB || this.LadoA == this.LadoC || this.LadoB == this.LadoC) 
                return "Isoceles";
        else 
                return "Escaleno";
    }
     
    public void ActualizaArea(int NewLadoA , int NewLadoB , int NewLadoC){
            this.Area = (NewLadoA * NewLadoB ) / 2;
    }
    public void ActualizaPerimetro(int NewLadoA , int NewLadoB , int NewLadoC){
           this.Perimetro =  NewLadoA + NewLadoB + NewLadoC;
    } 
     
      public void leer(){
        System.out.println("\nIndrotuce los nuevos lados en orden (Lado A , Lado B , Lado C)");
        Scanner sc = new Scanner(System.in);
        int NewLadoA = sc.nextInt();
        int NewLadoB = sc.nextInt();
        int NewLadoC = sc.nextInt();
        if(!EsValido(NewLadoA ,NewLadoB ,NewLadoC))
              System.out.println("Los datos no son validos \nVALORES NO CAMBIADOS");
        else{
            this.LadoA = NewLadoA;
            this.LadoB = NewLadoB;
            this.LadoC = NewLadoC;
            ActualizaArea(NewLadoA , NewLadoB , NewLadoC);
            ActualizaPerimetro(NewLadoA , NewLadoB , NewLadoC);
            System.out.println("\nValores del rectangulo actualizados");
        }
    } 
}

public class Geometria {  
    public static void main(String[] args) {
        Circulo cir = new Circulo( 3 , 6 , 28.27f , 18.85f );
        System.out.println(cir.Mostrar());
        cir.leer();
        System.out.println("Circulo actualizado: \n" + cir.Mostrar());
        Rectangulo rec = new Rectangulo( 3 , 6 , 18 , 18 );
        System.out.println(rec.Mostrar());
        rec.leer();
        System.out.println("Rectangulo actualizado: \n" + rec.Mostrar());
        Triangulo tri = new Triangulo( 5 , 8 , 4 , 6 ,12);
        System.out.println(tri.Mostrar());
        tri.leer();
        System.out.println("Triangulo actualizado" +tri.Mostrar());   
    }
}
