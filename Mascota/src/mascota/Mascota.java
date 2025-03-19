package mascota;
class mascotita{
    private String Nombre;
    private String Raza;
    private int Peso;
    
    mascotita(String nombre, String Raza , int Peso){
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Peso=Peso;
    }
    public void comer(){Peso++;}
    
    public String toString()
    {return "\n\tNombre: "+ Nombre + "\n\tRAza: "+ Raza + "\n\tPeso: "+ Peso; }
    }
    
public class Mascota {
    public static void main(String[] args) {
        mascotita OBJ1 = new mascotita("MAcho" , "chiwawa" , 123);
        System.out.println("Objeto 1: "+OBJ1);
        OBJ1.comer();
        System.out.println("Comio :v :"+OBJ1);
    }
}
