public class Dinero {
    
    public static void RecibirDinero(Producto producto){
        
        int precioProducto = producto.getPrecio(), intentos = 0, dineroIngresado = 0;
        dineroIngresado = Lectura.leerEntero("Ingrese el dinero a pagar: \nDebe ingresar " + precioProducto + " o más");
        
        while( intentos < 3 ){
            if(dineroIngresado<precioProducto){
                dineroIngresado += Lectura.leerEntero("Dinero insuficiente, todavia falta ingresar " + (precioProducto - dineroIngresado) + " pesos");
                intentos++;
            }else{
                producto.PrepararProducto();
                producto.entregarProducto();
                entregarCambio(precioProducto, dineroIngresado);
                int numeroImprimirRecibo = Lectura.leerEntero("¿Desea imprimir un recibo? \nIngrese 1 en lugar de si o  0 para un no");
                if(numeroImprimirRecibo == 1){
                    Recibo.imprimirRecibo();
                }
                System.out.println("Gracias por su compra.");
                break;
            }
        }
        
        if(intentos > 3){
            System.out.println("No ingresaste el dinero suficiente, intentalo de nuevo");
            devolverDinero(dineroIngresado);
        }
        
    }
    
    public static void entregarCambio(int precioProducto, int dineroIngresado){
        if(dineroIngresado > precioProducto){
            System.out.println("Retire su dinero sobrante \nTotal de dinero devuelto: " + (dineroIngresado - precioProducto));
        }
    }
    
    public static void devolverDinero(int dineroIngresado){
        System.out.println("Retire el dinero total ingresado: " + dineroIngresado);
    }
    
}
