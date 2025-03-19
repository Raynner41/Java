package panas;
class Amigos{
    private String Nombre;
    private String Direccion;
    private int Celular;
    Amigos(String Nombre, String Direccion , int Celular ){
        this.Nombre=Nombre;
        this.Direccion=Direccion;
        this.Celular=Celular;
    }
    public String toString(){
        return "\n\tNombre: "+Nombre+"\n\tDireccion: "+Direccion+"\n\tCel: "+Celular;
    }
}
public class Panas {
    public static void main(String[] args) {
        Amigos am1=new Amigos("Rafa","aurora",71728312);
        Amigos am2=new Amigos("Harold","Jardin",7713342);
        Amigos am3=new Amigos("Max","Cerro",71122342);
        System.out.println(am1);
        System.out.println(am2);
        System.out.println(am3);
        
        
        
    }
    
}
