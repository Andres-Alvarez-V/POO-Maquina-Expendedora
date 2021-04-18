
import java.util.Scanner;


public class Cliente {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //Creamos un array para los productos
        Producto[] productos = new Producto[5];
        
        //Creamos objetos en cada posicion
        productos[0] = new Producto("Expresso", "Uno de los tipos de café más básicos y sencillos, únicamente consta de un infusión de café la cual se realiza hirviendo agua en contacto con el grano.", 3500);
        productos[1] = new Producto("Americano", "En este caso se realizaría primero un espresso y a este se le añadiría externamente agua hirviendo.", 3000);
        productos[2] = new Producto("Carajillo", "El carajillo es un café preparado como un espresso al cual se le añade además de la infusión una cierta cantidad de alguna bebida espirituosa, siendo lo más general el brandy, el orujo o el whisky.", 5500);
        productos[3] = new Producto("Café con leche", "Semejante al cortado, el café con leche supone la incorporación de leche al café, solo que en esta ocasión se utiliza una proporción igual o semejante del lácteo y el café.", 4000);
        productos[4] = new Producto("Mocca", "Se trata de una variante del café con leche en el que además de leche y café se emplea obligatoriamente chocolate o cacao en forma de sirope o polvo.", 4500);
        
        //Llamamos el metodo escoger producto para obtener el indice del producto a llevar
        Producto productoEscogido = Producto.EscogerProducto(productos);
        
        
        //Llamamos el metodo recibir dinero el cual invocara el resto de procesos y finalizara
        Dinero.RecibirDinero(productoEscogido);
        
    }
}
