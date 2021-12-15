package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {

        Producto producto = new Producto( "Jabon", 30.0);

        System.out.println("producto 0 = " + producto);

        Producto producto1 = new Producto("Leche", 50.0);

        System.out.println("producto 1 = " + producto1);

        Producto producto2 = new Producto("Pepas", 40.0);

        System.out.println("producto 2 = " + producto2);

        Producto producto3 = new Producto("Te", 20.0);

        System.out.println("producto 3 = " + producto3);



        Orden orden1 = new Orden();
        orden1.agregarProducto(producto);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);

        //orden1.agregarProducto(producto);
        //orden1.agregarProducto(producto1);
        //orden1.agregarProducto(producto2);
        //orden1.agregarProducto(producto3);


        orden1.mostrarOrden();
        orden1.calcularTotal();



    }
}
