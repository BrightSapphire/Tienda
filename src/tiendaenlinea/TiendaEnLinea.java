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

//Implementa el paquete javax para usar JOptionPane para pedirle y mostrarle datos al usuario usando dialogs.
import javax.swing.JOptionPane;

/**
 *
 * @author Steph
 */

public class TiendaEnLinea 
{

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) 
    {
        // Se declara un arreglo de Producto para llenarlo de cualquiera de las subclases (tamaño: 10).
        Producto a[] = new Producto[10];
        // Booleano para validar varios ciclos dentro del menú.
        boolean  error = false;
        //Variable reusable precio.
        long precio;
        //Iterador.
        int i = 0;
        //Centinela salir para llenar más el carrito o salir de él.
        int salir = 1;
        JOptionPane.showMessageDialog( null, "BIENVENIDO A LA TIENDA ONLINE");
       
        //Ciclo que se repite para mostrar el menú (de preferencia do while para que se repita al menos una vez).
       do
       {
          //Muestra la cantidad de espacios restantes en el arreglo.
           JOptionPane.showMessageDialog ( null, "TIENE ESPACIO DE " + ( 10 - i ) +  " PRODUCTOS EN SU CARRITO ONLINE." );
          
          //Comienza primer do while interno general para validar que los tipos sean correctos.
          do
          {
               // El usuario selecciona alguno de los tipos de productos y se asigna a la variable auxiliar op.
               int op =
                  Integer.parseInt( 
                      JOptionPane.showInputDialog ( "¿Qué desea llevar?\n1. Libros\n2. Productos Eléctronicos" ) );
               
               //Inicializa error en false para que cuando se repita no se mantenga en true y vuelva a validar.
               error = false;
               
               //Switch para escoger llenar el tipo respectivo de producto con sus opciones. 
              switch (op)
               {
                  //Primer caso es tipos de libros.
                   case 1:   
                       
                       //  Do while interno de Libro, para validar que la opción escogida sea válida.
                        do
                        {  
                            //Variable auxiliar op2 para escoger entre cómics o libros infantiles.
                            int op2 = 
                                Integer.parseInt( 
                                    JOptionPane.showInputDialog( "Escoja el tipo de libro:\n1. Cómics\n2. Libro infantil" ) );
                            
                            error = false;
                            switch (op2)
                            {
                                 //Primer caso del switch de Libro: Comic.
                                 case 1:
                                     
                                     //Se almacenan cada uno de los atributos de Comic en variables temporales.
                                     precio =
                                             Long.parseLong(
                                                   JOptionPane.showInputDialog ( "Ingrese el precio del producto" ) ); 
                                             
                                     String titulo =
                                             JOptionPane.showInputDialog ( "Ingrese el título de la obra" );
                                     String isbn =
                                             JOptionPane.showInputDialog ( "Ingrese el ISBN" );
                                     String editorial =
                                             JOptionPane.showInputDialog ( "Ingrese la editorial" );
                                     String genero =
                                             JOptionPane.showInputDialog ( "Ingrese el género de la obra" );
                                     int year =
                                             Integer.parseInt (
                                                     JOptionPane.showInputDialog ( "Ingrese el año de publicación" ) );
                                     int num = 
                                             Integer.parseInt (
                                                      JOptionPane.showInputDialog ( "Ingrese el número del cómic" ) );
                                     
                                     // Se llama al constructor alternativo de Cómic y se inicializan sus atributos con las variables temporales como argumentos.
                                     a[i] = new Comic ( precio, titulo, isbn, editorial, genero, year, num );
                                     
                                     
                                     break; // Break obligatorio.
                                     
                                   //Segundo caso de Libro: Libro infantil.
                                 case 2:
                                      //Se almacenan cada uno de los atributos de LibroInfantil en variables temporales.
                                     precio =
                                             Long.parseLong(
                                                   JOptionPane.showInputDialog ( "Ingrese el precio del producto" ) ); 
                                    
                                     titulo =
                                             JOptionPane.showInputDialog ( "Ingrese el título de la obra" );
                                     isbn =
                                             JOptionPane.showInputDialog ( "Ingrese el ISBN" );
                                     editorial =
                                             JOptionPane.showInputDialog ( "Ingrese la editorial" );
                                     genero =
                                             JOptionPane.showInputDialog ( "Ingrese el género de la obra" );
                                     year =
                                             Integer.parseInt (
                                                     JOptionPane.showInputDialog ( "Ingrese el año de publicación" ) );
                                     num = 
                                             Integer.parseInt (
                                                      JOptionPane.showInputDialog ( "Ingrese la edad mínima recomendada para este libro" ) );
                                     
                                     // Se llama al constructor alternativo de LibroInfantil.
                                     a[i] = new LibroInfantil ( precio, titulo, isbn, editorial, genero, year, num );
                                     
                                     
                                     break;
                                  
                                     //Se tiene el caso por defecto por si no se ingresa ninguna de las opciones válidas muestre un diálogo de error y el booleano se le asigna verdadero.
                                 default:
                                      JOptionPane.showMessageDialog ( null, "INGRESE UNA OPCIÓN VÁLIDA" );
                                      error = true;
                                     
                            }// Fin del switch de Libro.
                            
                        } while ( error ); // Final del do while Libro. Si error es true, se repite el ciclo.
                       break; // break del caso de Libro.
                       
                   //Segundo caso: Productos electrónicos.
                   case 2:
                      
                       //Do while interno del ProductoElectrónico para validar.
                       do
                       {
                          //Se usa una tercer variable auxiliar para guardar la opción que se escoja en el case de ProductoElectrónico.
                          int op3 = 
                              Integer.parseInt( 
                                    JOptionPane.showInputDialog( "Escoja el tipo de eléctronico:\n1. TV\n2. Equipo de sonido" ) );
                       
                          boolean validar = false;
                          error = false;
                          int tipo;
                          
                          switch(op3)
                          {
                              
                              //Primer caso del switch de producto electrónico: TV.
                              case 1:
                                   //Se almacenan cada uno de los atributos de TV en variables temporales.
                                  precio =
                                             Long.parseLong(
                                                   JOptionPane.showInputDialog ( "Ingrese el precio del producto" ) ); 
                                  
                                  String fabricante =
                                          JOptionPane.showInputDialog ( "Ingrese el fabricante del producto" );
                                  double inches = 
                                          Double.parseDouble (
                                                  JOptionPane.showInputDialog ( "Ingrese el número de pulgadas" ) );
                                  
                                  //Do while de TV para validar que el tipo sea 1 o 2.
                                  do{
                                        tipo =
                                             Integer.parseInt(
                                                    JOptionPane.showInputDialog ( "SMART TV\n1. Si\n2. No" ) );
                                        if ( tipo == 1 )
                                            validar = true;
                                        if ( tipo == 2 )
                                            validar = false;
                                        else if ( tipo < 1 || tipo > 2 )
                                           JOptionPane.showMessageDialog ( null, "INGRESE UNA OPCIÓN VÁLIDA" );
                                  
                                       } while ( tipo < 1 || tipo > 2 );
                                   
                                      //Se llama al constructor alternativo de TV.
                                       a[i] = new TV( precio, fabricante, inches, validar );
                                      
                                  break;
                              
                              case 2: //Segundo caso de ProductoElectrónico: EquipoSonido.
                                   //Se almacenan cada uno de los atributos de EquipoSonido en variables temporales.
                                  precio =
                                             Long.parseLong(
                                                   JOptionPane.showInputDialog ( "Ingrese el precio del producto" ) ); 
                                  
                                  fabricante =
                                          JOptionPane.showInputDialog ( "Ingrese el fabricante del producto" );
                                  double potencia = 
                                          Double.parseDouble (
                                                  JOptionPane.showInputDialog ( "Ingrese el número de Watts" ) );
                                  
                                  //Do while interno de EquipoSonido: validar si se escoge la opción correcta.
                                  do{
                                        tipo =
                                             Integer.parseInt(
                                                    JOptionPane.showInputDialog ( "Bluetooth\n1. Si\n2. No" ) );
                                        if ( tipo == 1 )
                                            validar = true;
                                        if ( tipo == 2 )
                                            validar = false;
                                        if ( tipo < 1 || tipo > 2 )
                                           JOptionPane.showMessageDialog ( null, "INGRESE UNA OPCIÓN VÁLIDA" );
                                  
                                       } while ( tipo < 1 || tipo > 2 );
                                   
                                      // Se llama al constructor alternativo de EquipoSonido y se le asignan los valores ingresados.
                                       a[i] = new EquipoSonido( precio, fabricante, potencia, validar );
                                  break;
                              default: // Caso por defecto: validar si la opción fue incorrecta.
                                  JOptionPane.showMessageDialog ( null, "INGRESE UNA OPCIÓN VÁLIDA" );
                                  error = true;
                                  
                                
                          }
                      } while ( error ); // Final del do while de ProductoElectrónico.
                     
                       
                       break;
                   default: // Caso por defecto general, el cual está por si se selecciona una opción diferente a 1 o 2. Asigna a error true.
                       JOptionPane.showMessageDialog ( null, "INGRESE UNA OPCIÓN VÁLIDA" );
                       error = true;
              
                }
          
             } while ( error ); // Final primer do while interno general.
            
           if(i < 10)
           {
            // Segundo do while interno general para validar si se quiere ingresar otro producto.
            do
            {
                
                error = false;
                salir =
                    Integer.parseInt( 
                          JOptionPane.showInputDialog ( "¿Desea agregar otro producto?\n1. Si\n2. No" ) );
                
                if ( salir < 1 || salir > 2 )
                {
                    error = true;
                    JOptionPane.showMessageDialog( null, "Ingrese una opción válida" );
                }
                  
                
            } while ( error ); //Final segundo do while interno.
           }
           
            i++; // Aumenta el iterador.
            
        }while ( salir == 1 && i < 10 ); // Final do while si la cantidad de productos llega a diez o se pide salir.
       
       mostrarCarrito( a , i ); // Se llama a la función mostrarCarrito con el arreglo y el iterador como argumentos.
       
      //Se le asigna el valor que calcule la función de precio regular a precioNormal.
       double precioNormal = calcularPrecioRegular ( a, i );
       //Se le asigna el valor que calcule la función de precio con descuento a precioDescuento.
       double precioDescuento = calcularPrecioDescuento ( a, i );
       
       //Se muestran los precios totales con y sin descuento por último.
       JOptionPane.showMessageDialog ( null, "Su total es: " + precioNormal );
       JOptionPane.showMessageDialog ( null, "Su total con descuento es: " + precioDescuento );
      
    
    } // Fin del main.
    
    //Función para mostrar los objetos dentro del arreglo.
    public static void mostrarCarrito ( Producto a[], int limite )
    {
        
        // Repite ciclo hasta la cantidad máxima de objetos dentro del arreglo.
        for ( int i = 0;  i < limite; i++)
        {
            
            //Se usa el operador instanceof para identificar qué tipo de subclase es y mostrar qué tipo de objeto es y sus instancias llamando al toString() respectivo.
            if ( a[i] instanceof Comic )
                JOptionPane.showMessageDialog( null,  "Producto #" + ( i + 1 ) + "\nCómic:\n" + a[i].toString() + "\nEl precio con descuento es: " + a[i].calcularPrecioDescuento() );
            
            if ( a[i] instanceof LibroInfantil )
                JOptionPane.showMessageDialog ( null, "Producto #" + ( i + 1 ) + "\nLibro infantil:\n" + a[i].toString() +  "\nEl precio con descuento es: " + a[i].calcularPrecioDescuento()  );
            
            if ( a[i] instanceof TV )
                JOptionPane.showMessageDialog ( null, "Producto #" + ( i + 1 ) + "\nTV:\n" + a[i].toString()+ "\nEl precio con descuento es: " + a[i].calcularPrecioDescuento()  );
            
            if ( a[i] instanceof EquipoSonido )
                JOptionPane.showMessageDialog ( null, "Producto #" + ( i + 1 ) +  "\nEquipo de sonido:\n" + a[i].toString() + "\nEl precio con descuento es: " + a[i].calcularPrecioDescuento() );
            
            
            
        }
        
    }//Fin de la función MostrarCarrito().
    
    // Método para calcular el total de los productos.
    public static double calcularPrecioRegular ( Producto lista[], int limite )
    {
        double total = 0;
        
        // Suma en una variable el precio de cada producto dentro del arreglo llamando a la función getPrecioRegular().
        for ( int i = 0; i < limite; i++ )
            total += lista[i].getPrecioRegular();
                
        return total; //Retorna la suma.
    } // Fin de la función calcularPrecioRegular().
    
    //Función para calcular el total con descuento de todos los productos.
    public static double calcularPrecioDescuento ( Producto lista[], int limite )
    {
        double total = 0;
        
        //Va sumando en la variable total los precios con descuento llamando a la función calcularPrecioDescuento().
        for ( int i = 0; i < limite; i++ )
             total += lista[i].calcularPrecioDescuento();
        
        return total;
    }//Fin de la función calcularPrecioDescuento().
    
    
    
}// Fin de la clase TiendaEnLinea.
