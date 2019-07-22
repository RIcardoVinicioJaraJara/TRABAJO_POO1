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

        int opc = 0;
        do {
            System.out.println("Eliga opcion \n 1 >> Comprar manzanas \n 2 >> Vender manzanas \n 3 >> Comprar peraz  \n 4 >> Veneder peraz \n 5 >>  Total Ventas \n 6 >> Salir");
            opc = e.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese cantidad a comprar");
                    manzanas.comprar(e.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese cantidad a vender");
                    manzanas.vender(e.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese cantidad a comprar");
                    peraz.comprar(e.nextInt());
                    break;
                case 4:
                    System.out.println("Ingrese cantidad a vender");
                    peraz.vender(e.nextInt());
                    break;
                case 5:
                    System.out.println("El valor entre compra y vente de manzanas y peraz es: " + manzanas.getTotalVentas());
                    break;
                case 6:
                    opc = 6;
                    break;
                default:
                    System.out.println("El numero es icorrecto");
                    break;
            }

        } while (opc != 6);

    }

}
