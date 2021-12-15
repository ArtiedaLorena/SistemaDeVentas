package mx.com.gm.ventas;

import java.util.Arrays;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS= 10;



    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public  void agregarProducto(Producto producto){

        if (contadorProductos<Orden.MAX_PRODUCTOS){
            this.productos [contadorProductos++]= producto;
        }
        else{
            System.out.println("Usted ha superado el maximo de productos: "+ MAX_PRODUCTOS);
        }

    }
    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
                Producto producto = this.productos[i];
                //total += producto.getPrecio();
                total += this.productos[i].getPrecio();

        }
        return total;

    }
    public void mostrarOrden(){
        System.out.println("this.idOrden = " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("total de la Orden: $ " + totalOrden);
        System.out.println("Productos de la orden: ");

        for( int i = 0; i< this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orden{");
        sb.append("idOrden=").append(idOrden);
        sb.append(", producto=").append(Arrays.toString(productos));
        sb.append(", contadorProductos=").append(contadorProductos);
        sb.append('}');
        return sb.toString();
    }
}
