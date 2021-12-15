package mx.com.gm.ventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private Double precio;
    static private int contadorProductos;

    private Producto() {
        this.idProducto=++Producto.contadorProductos;

    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getIdProducto() {
        return idProducto;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}





