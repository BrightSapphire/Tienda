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
//Interfaz para ser usada en Producto.
public interface ProductoInterfaz
{
    //Método para calcular el precio con descuento que será sobrescrita en las clases hijas.
    public double calcularPrecioDescuento();
    //Método Modificador de PrecioRegular.
    public void setPrecioRegular( double regularPrice );
    //Método Analizador de PrecioRegular.
    public double getPrecioRegular();

    
}
