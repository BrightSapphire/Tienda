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

/*La clase ProductoElectrónico hereda de Producto.
  La clase ProductoEléctronico también es abstracta ya que no
  sobrescribe el método abstracto de Producto.
*/
public abstract class ProductoElectrónico extends Producto implements ElectronicoInterfaz
{   
    private String fabricante;
    
    public ProductoElectrónico()        
    { 
       //Llama al construtor predeterminado de Producto. 
       super();
       fabricante = "Samsung";     
    }

    /*Constructor alternativo de ProductoElectrónico.
      Recibe como parámetros price y brand.
      Inicializa fabricante con brand.
    */
    public ProductoElectrónico( double price, String brand ) 
    {  //Llama al constructor alternativo y le pasa de argumento el primer parámetro.
        super( price );
       fabricante = brand;
    }
    
    /*Método Modificador de fabricante.
      Recibe como parámetro brand.
      Inicializa fabricante con el String de brand.
    */
    public void setFabricante( String brand )
    {
        fabricante = brand;
    }
    
    /*Método Analizador de fabricante.
      No recibe parámetros.
      Retorna fabricante.  
    */
    @Override
    public String getFabricante() 
    {
        return fabricante;
    }

    //Llama al toString() de Producto y pasa los atributos de ProductoElectrónico a String.
    @Override
    public String toString()
    {
        return super.toString() + "\nFabricante: " + fabricante;
    }
    
    
}//Final de la clase ProductoElectrónico.
