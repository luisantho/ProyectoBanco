/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondecuentasbancarias;

import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Menu {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;

        do {

            System.out.println("====== BANCO UNIVERSAL ======");
            System.out.println("1. Alta de cuentas");
            System.out.println("2. Consulta de una cuenta");
            System.out.println("3. Modificar cuentas");
            System.out.println("4. Anular cuentas");
            System.out.println("5. Listado de cuentas");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Selecciona una opcion:");
            num = tcl.nextInt();

            switch (num) {
                case 1:
                    //metodo 1
                    break;
                case 2:
                    //metodo 2
                    break;
                case 3:
                    //metodo 3
                    break;
                case 4:
                    //metodo 4
                    break;
                case 5:
                    //metodo 5
                    break;
            }

        } while (num != 0);
    }
}
