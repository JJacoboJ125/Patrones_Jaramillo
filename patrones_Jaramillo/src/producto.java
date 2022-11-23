/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class producto implements IProducto {

    private String nombre;
    private Abs_Categorias categoria;
    private int codigo;
    private String descripcion;
    private double Costo;
    private int cantidad;

    public producto(String nombre, Abs_Categorias categoria, int codigo, String descripcion, double Costo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.Costo = Costo;
    }

    public int verCantidad() {
        return cantidad;
    }

    public void modificarCantidad() {

    }

    public void crearActualizar(Actualizar act) {

    }

    public void notificarCambio() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Abs_Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Abs_Categorias categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    @Override
    public String toString() {
        return "nombre  " + nombre + "\ncategoria  " + categoria +
               "\ncodigo  " + codigo + "\ndescripcion  " + descripcion + 
               "\nCosto  " + Costo + "\ncantidad  " + cantidad;
    }

    
        
}
