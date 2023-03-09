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
//La clase Comic hereda de Libro.
public class Comic extends Libro
{
    private int numero;

    public Comic() 
    {  //Llama al constructor predeterminado de Libro.
        super();
        numero = 365;
    }
    
    
    /*Constructor alternativo de Comic.
      Recibe como parámetros price, title, bookNumber, pubHouse, genre, year, n. 
      Inicializa numero con el valor de n.
    */

    public Comic( double price, String title, String bookNumber, String pubHouse, String genre, int year, int n ) 
    {
        //Llama al constructor alternativo y le pasa de argumentos todos los parámetros excepto el último.
        super( price, title, bookNumber, pubHouse, genre, year );
        numero = n;
    }

    /*Método Modificador de la variable numero.
      Recibe como parámetro numero.
      Inicializa numero con numero.*/
    public void setNumero( int numero ) 
    {
        this.numero = numero;
    }
 
    /*Método Analizador de numero.
      No recibe parámetros.
      Retorna numero.
    */
    public int getNumero() 
    {
        return numero;
    }
    
    //Los cómics tienen descuento de 5% así que se llama al atributo "precioRegular" de Producto y se le saca el descuento.
   @Override
    public double calcularPrecioDescuento() 
    {
       double valordesc = super.precioRegular - (super.precioRegular * 0.05);
        return valordesc;//retorna el valor con descuento.
    }

    //Agrega el número del cómic al String junto con lo que dice el toString() de Libro.
    @Override
    public String toString()
    {
        return super.toString() + "\nNúmero: " + numero;
        
    }
    
     
    
}//Fin de la clase Comic.
