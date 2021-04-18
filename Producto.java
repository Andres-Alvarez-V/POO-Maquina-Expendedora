
import java.util.Timer;
import java.util.TimerTask;

public class Producto {
    
    private final String tipo, descripcion;
    private final int precio;
    
    
    public Producto(String tipo, String descripcion, int precio){
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void PrepararProducto() throws InterruptedException{
        
        Timer myTimer = new Timer();
        TimerTask task =  new TimerTask(){
            public void run(){
                System.out.println("Producto listo\n\n\n"); 
            }
        };
        System.out.println("Preparando " + this.tipo + "... \nMezclando...");
        myTimer.schedule(task, 3000);
        Thread.sleep(5000);
        
    }
    
    public void entregarProducto(){
        System.out.println("Retire su "+ this.tipo + " de la bandeja");
    }
    
    public static Producto EscogerProducto(Producto[] productos){
        
        int i = 1;
        System.out.println("Productos disponible: ");  
        
        for( Producto producto : productos ){
            System.out.println(i + ".\n     NOMBRE: " + producto.tipo + ".\n     Descripcion: " + producto.descripcion + ".\n     Precio: " + producto.precio);
            i++;
        }
        
        Lectura.leerEntero("Del 1 al 10 que cantidad de azucar desea: ");
        return (productos[Lectura.leerEntero("Ingrese el numero del producto que desea llevar: ") - 1]);
    }
}
