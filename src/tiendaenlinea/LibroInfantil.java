/*
/***************************************************************************************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi *compañero, Profesor o con
el monitor asignado a este curso.
*
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* - Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o notas del curso
* debe ser claramente señalado con una cita apropiada en
* los comentarios de mi programa.
*
* <Sebastián Herrera Claro, Stephanie Acosta Sierra – 0221910043, 0221910006>
*
***********************************************************************/

package tiendaenlinea;

/**
 *
 * @author Steph
 */
//LibroInfantil hereda de Libro.
public class LibroInfantil extends Libro 
{
    private int edad;

    public LibroInfantil()
    {  //Llama al constructor predeterminado de Libro.
        super();
        edad = 5;
    }

    
     /*Constructor alternativo de LibroInfantil.
       Recibe como parámetros price, title, bookNumber, pubHouse, genre, year, age.
       Inicializa edad con el valor de age.
    */
    public LibroInfantil( double price, String title, String bookNumber, String pubHouse, String genre, int year, int age)
    {
         //Llama al constructor alternativo y le pasa de argumentos todos los parámetros excepto el último.
        super( price, title, bookNumber, pubHouse, genre, year );
        edad = age;
    }

    /*
      Método Modificador de edad.
      Recibe como parámetro edad.
      Asigna edad a edad.
    */
    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
    
    /*
       Método Analizador de edad.
       No recibe parámetros.
       Retorna edad.
    */
    public int getEdad()
    {
        return edad;
    }
    
    
    //Los libros infantiles tienen descuento de 10% así que se llama al atributo "precioRegular" de Producto y se le saca el descuento. 
     @Override
    public double calcularPrecioDescuento() 
    {
       double valordesc = super.precioRegular - (super.precioRegular * 0.10);
        return valordesc;
    }
    
    //Agrega al String la edad mínima para leer el libro, junto con lo que dice el toString() de Libro.
        @Override
    public String toString()
    {
        return super.toString() + "\nEdad recomendada: " + edad;
        
    }
    
}//Final de la clase LibroInfantil.
