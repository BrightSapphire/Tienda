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

/*Libro hereda de Producto.
   La clase Libro también es abstracta ya que no
   sobrescribe el método abstracto de Producto.
*/
public abstract class Libro extends Producto 
{
    private String titulo;
    private String isbn;
    private String editorial;
    private String genero;
    private int añoPublicación;
    
    public Libro()
    {
        //Llama al constructor predeterminado de Producto.
        super();
        titulo = "Cien años de Soledad";
        isbn = "9780847989867";
        editorial = "Editorial Planeta";
        genero = "Novela";
        añoPublicación = 1967;
        
    }


    /*Constructor alternativo de Libro.
      Recibe como parámetros price, title, bookNumber, pubHouse, genre, year.
      Inicializa titulo con el String de title.
      Inicializa isbn con el String de bookNumber.
      Inicializa editorial con el String de pubHouse.
      Inicializa genero con el String de genre.
      Inicializa añoPublicación con el valor de year.
    */
    public Libro(double price, String title, String bookNumber, String pubHouse, String genre, int year) 
    {
        //Se llama al constructor alternativo de Producto con el argumento price.
        super( price );
        titulo = title;
        isbn = bookNumber;
        editorial = pubHouse;
        genero = genre;
        añoPublicación = year;
    }

    /*Método Modificador de titulo.
      Recibe de parámetro title.
      Asigna a titulo el String de title.*/
    public void setTitulo( String title ) 
    {
        titulo = title;
    }
    
    /*Método Analizador de titulo.
      No recibe parámetros.
      Retorna titulo.
    */
    public String getTitulo()
    {
        return titulo;
    }
    
    /*Método Modificador de isbn.
      Recibe como parámetro bookNumber.
      Asigna el String de bookNumber a isbn.
    */
    public void setIsbn( String bookNumber )
    {
        isbn = bookNumber;
    }
    
     /* Método Analizador de isbn.
        No recibe parámetros.
        Retorna isbn.
    */
    public String getIsbn() 
    {
        return isbn;
    }

    
    /*Método Modificador de editorial.
      Recibe como parámetro pubHouse.
      Asigna a editorial el String de pubHouse.
    */
    public void setEditorial( String pubHouse )
    {
        editorial = pubHouse;
    }

    /*
       Método Analizador de editorial.
       No recibe parámetros.
       Retorna editorial.
    */
    public String getEditorial() {
        return editorial;
    }
    
    /*
       Método Modificador de genero.
       Recibe de parámetro genre.
       Asigna el String de genre a genero.
    */
    public void setGenero( String genre )
    {
        genero = genre;
    }

    /*
       Método Analizador de genero.
       No recibe parámetros.
       Retorna genero.
    */
    public String getGenero() 
    {
        return genero;
    }

    /*
       Método Modificador de añoPublicación.
       Recibe de parámetros year.
       Asigna el valor de year a añoPublicación.
    */
    public void setAñoPublicación( int year ) 
    {
        añoPublicación = year;
    }

    /*
        Método Analizador de añoPublicación.
        No recibe parámetros.
        Retorna añoPublicación.
    */
    public int getAñoPublicación() 
    {
        return añoPublicación;
    }

    @Override
    public String toString()
    {   //Llama al toString() de Producto y pasa los atributos de Libro a String.
        return super.toString() + "\nEl título es: " + titulo + "\nISBN: " + isbn + "\nEditorial: " + editorial
                   + "\nGénero: " + genero + "\nAño de publicación: " + añoPublicación;
        
    }
    
    
     
}// Final de la clase Libro.
