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
/*Clase abstracta Producto con método abstracto calcularPrecioDescuento().
  Se escogió calcularPrecioDescuento() como método abstracto porque es el método 
  que se sobrescribe en las subclases TV, EquipoSonido, Comic y LibroInfantil.
*/
public abstract class Producto implements ProductoInterfaz
{
    protected double precioRegular; 
    
    /* 
       Constructor predeterminado de Producto.
       Inicializa el precio en 36000.
    */
    public Producto()
    {
        precioRegular = 36000;
        
    }
    
    /*
        Constructor alternativo de Producto.
        Asigna el valor de price a precioRegular.
    */
    public Producto ( double price )
    {
        precioRegular = price;
    }
    
    /*
        Método Modificador de precioRegular.
        Recibe de parámetro price.
        Asigna el valor de price a precioRegular.
    */
    @Override
    public void setPrecioRegular ( double price )
    {
        precioRegular = price;
    }
    
    /*
         Método Analizador de precioRegular.
         No recibe parámetros.
         Retorna precioRegular.
    */
    @Override
    public double getPrecioRegular()
    {
        return precioRegular;
    }
    

 

    @Override
    public String toString()
    {  //toString() de Producto para que siempre se pase el precio.
        return "Vale $" + precioRegular;
    }
    
    
}//Final de la clase Producto.
