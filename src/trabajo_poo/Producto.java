/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_poo;

/**
 *
 * @author vinic
 */
public class Producto {

    private int cantidad;
    private int precio;
    private static int totalVentas;

       //Este constructor pedira que indique el precio y cantidad, como se esta iniciando el 
    public Producto(int cantidad, int precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        totalVentas = 0;
    }
    
    public void vender(int cant){
        if(cantidad > cant){
            totalVentas = totalVentas + cant;
            cantidad = cantidad - cant;
            System.out.println("Venta realizada");
        }else{
            System.out.println("Erro: No cuenta con los productos necesarios para vender");
        }
    }
    
    public void comprar(int cant){
       totalVentas = totalVentas - (cant * precio);
       cantidad = cantidad + cant;
        System.out.println("Compra realizada");
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static int getTotalVentas() {
        return totalVentas;
    }

    public static void setTotalVentas(int totalVentas) {
        Producto.totalVentas = totalVentas;
    }
     
}
