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
//La clase TV hereda de ProductoElectrónico.
public class TV extends ProductoElectrónico 
{
    private double pulgadas;
    private boolean smart;

    public TV() 
    {   //Llama al construtor predeterminado de ProductoElectrónico.
        super();
        pulgadas = 0;
        smart = false;
    }

    
     /*Constructor alternativo de TV. 
      Recibe como parámetros price, brand, size, SMART.
      Inicializa pulgadas con size y smart con SMART.*/
    public TV( double price, String brand, double size, boolean SMART) 
    {  //Llama al constructor alternativo y le pasa de argumentos los dos primeros parámetros.
        super(price, brand);
        pulgadas = size;
        smart = SMART;
    }
    
    /* Método Modificador de pulgadas.
      Recibe como parámetro pulgadas.
      Inicializa pulgadas con el valor de pulgadas.
    */
    public void setPulgadas( double pulgadas )
    {
        this.pulgadas = pulgadas;
    }
    
    /*Método Analizador de pulgadas.
      No recibe parámetros.
      Retorna pulgadas.
    */
    public double getPulgadas()
    {
        return pulgadas;
    }
    /*Método Modificador de smart.
      Recibe como parámetro smart.
      Inicializa smart con el valor de smart.
    */
    public void setSmart( boolean smart ) 
    {
        this.smart = smart;
    }

    /*Método Analizador de smart.
      No recibe parámetros.
      Retorna el valor de smart.
    */
    public boolean getSmart() 
    {
        return smart;
    }
    
    //Los TV tienen un descuento de 20%, así que se llama al atributo "precioRegular" de Producto y se usa para calcular el descuento.
     @Override
    public double calcularPrecioDescuento() {
       double valordesc = super.precioRegular - (super.precioRegular * 0.20);
        return valordesc;//Retorna el valor con descuento.
    }

    //Llama al toString() de ProductoElectrónico y lo concatena con un String determinado dependiendo de si es SmartTV o no.
    @Override
    public String toString() 
    {
        if ( smart )
          return super.toString() + "\nMide " + pulgadas + "' pulgadas\nEs smart TV";
        else
            return super.toString() + "\nMide " + pulgadas + "' pulgadas\nNo es smart TV";
    }
    
    
}//Final de la clase TV.
