package libreria;
public class Libreria {
      private String Titulo;
      private String Autor; 
      private int num_ejemplares;
      private int num_prestados;
   
      public Libreria() {
        this.Titulo = "Sin titulo";
        this.Autor = "Sin autor";
        this.num_ejemplares = 0;
        this.num_prestados = 0;
    }

    public Libreria(String Titulo, String Autor, int num_ejemplares, int num_prestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.num_ejemplares = num_ejemplares;
        this.num_prestados = num_prestados;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
         }
    public void setAutor(String Autor) {
        this.Autor = Autor;
        }
    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
        }
    public void setNum_prestados(int num_prestados) {
        this.num_prestados = num_prestados;
         }
       
    public String getTitulo() {
        return Titulo;
         }
    public String getAutor() {
        return Autor;
        }
    public int getNum_ejemplares() {
        return num_ejemplares;
         }
    public int getNum_prestados() {
        return num_prestados;
        }

    public void Prestamo(Libreria li){
        if(li.num_ejemplares > 0){
        li.num_prestados++;
        li.num_ejemplares--;
        }
        else
            System.out.println("No tenemos ejemplares en stock :( ");
    }
    
    public void Devolucion(Libreria li){
        if(li.num_prestados > 0){
        li.num_prestados--;
        li.num_ejemplares++;
        }
        else
            System.out.println("Este ejemplar no corresponde a la tienda >:v");
    }
    
    public String toString() {
        return "\n\tTitulo: " + Titulo + "\n\tAutor: " + Autor + "\n\tnum_ejemplares: " + num_ejemplares + "\n\tnum_prestados: " + num_prestados ;
    }

  
    public static void main(String[] args) {
        Libreria libro1 = new Libreria();
        System.out.println("\nLibro 1:" + libro1.toString());
        Libreria libro2 = new Libreria("1984", "George Orwell", 10, 2);
        Libreria libro3 = new Libreria("El principito", "Antoine de Saint-Exupéry", 7, 3);
        Libreria libro4 = new Libreria("Don Quijote de la Mancha", "Miguel de Cervantes", 4, 0);
        Libreria libro5 = new Libreria("Orgullo y prejuicio", "Jane Austen", 6, 2);
        System.out.println("\nLibro 2:" + libro2.toString());
        libro2.Prestamo(libro2);
        System.out.println("\nLibro 2: 'Despues del Prestamo'" + libro2.toString());
        System.out.println("\nLibro 3:" + libro3.toString());
        System.out.println("\nLibro 4:" + libro4.toString());
        System.out.println("\nLibro 5:" + libro5.toString());
        libro5.Devolucion(libro5);
        System.out.println("\nLibro 5: 'Despues de la devolucion'" + libro5.toString());
    }
}