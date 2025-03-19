
package mensajeria;

class Mensaje{
    private String EsDe;
    private String Para; 
    private String Fecha;
    private int Codigo;
    private String Contenido;
    
    Mensaje(String EsDe , String Para , String Fecha , int Codigo , String Contenido){
        this.EsDe=EsDe;
        this.Para=Para; 
        this.Fecha=Fecha;
        this.Codigo=Codigo;
        this.Contenido=Contenido;
    }
    
    public String toString(){
        return "\n\tEs De: "+EsDe+"\n\tPara: "+Para+"\n\tFecha: "+Fecha+"\n\tCodigo: "+Codigo+"\n\tContenido: "+Contenido;
    }
    
}

public class Mensajeria {
    public static void main(String[] args) {
        Mensaje men1=new Mensaje("Raynner","Ing","14/03/2025",12364,"Eres un puta");
        System.out.println(men1);
    }
    
}
