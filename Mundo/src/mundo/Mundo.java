
package mundo;
class Persona{
    private String Nombre;
    private int Ci;
    private String Direccion; 
    
    Persona(String Nombre , int Ci ,String Direccion){
        this.Nombre = Nombre; 
        this.Ci = Ci;
        this.Direccion = Direccion;
    }
    
    public String toString(){
        return "\n\tNombre: "+Nombre+"\n\tCi: "+Ci+"\n\tDireccion: "+Direccion;
    }
    
}
public class Mundo {

    public static void main(String[] args) {
        Persona pe1=new Persona("RAynner",7424504,"Mi calle");
        System.out.println("pe1:"+pe1);
    }
    
}
