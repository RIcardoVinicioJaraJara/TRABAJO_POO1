/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_poo;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class TRABAJO_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese la cantidad manzanas");
        int cant = e.nextInt();
        System.out.println("Ingrese el precio de las manzanas");
        int pre = e.nextInt();
        //Instanciamos las clases de producto y mansanas
        System.out.println("Creamos producto manzanas");
        Producto manzanas = new Producto(cant, pre);
        
        System.out.println("Ingrese la cantidad manzanas");
        cant = e.nextInt();
        System.out.println("Ingrese el precio de las manzanas");
        pre = e.nextInt();
        System.out.println("Cremos producto peraz");
        Producto peraz = new Producto(cant, pre);

        //Obtenenmos nuestro valores de compra >> Como no se  a vendido ni comprado daria igual a cero
        System.out.println("El valor entre compra y vente de manzanas y peraz es: "+ manzanas.getTotalVentas());
        
        System.out.println("");
        //Vendemos unos productos
        
        manzanas.vender(40);
        peraz.vender(25);
        
        //Obtenemos nuestro valor en ventas
        System.out.println("El valor entre compra y vente de manzanas y peraz es: "+ peraz.getTotalVentas());
        
        System.out.println("");
        //Comproamos algunos productos
        manzanas.comprar(10);
        peraz.comprar(10);
        
        //Obteneos nuestro valor en compras y ventas;
        System.out.println("El valor entre compra y vente de manzanas y peraz es: "+ manzanas.getTotalVentas());
        
        System.out.println("");
        //Intentamos vender un valor que no existe
        manzanas.vender(200);
        peraz.vender(150);
        System.out.println("");
        //Compramos un valor existente
        manzanas.vender(20);
        peraz.vender(15);
        
        //Obteneos nuestro valor entre compras y ventas;
        System.out.println("El valor vendio de manzanas y parez es: "+peraz.getTotalVentas());
        
       
    }
    
}
