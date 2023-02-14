/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondecuentasbancarias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Cuentas {

    //Atributos
    private ArrayList<Ccuenta> cuentas = new ArrayList();
    private int total;

    //Metodos
    public Ccuenta poscuentanombre(String nombre)  {

        Ccuenta cuenta = new Ccuenta();
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNombre().equals(nombre)) {
                cuenta = cuentas.get(i);
            } else {
                cuenta = null;
            }
        }
        return cuenta;
    }

    public Ccuenta poscuenta(String cuenta) {
        Ccuenta cuenta2 = new Ccuenta();
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCuenta().equals(cuenta)) {
                cuenta2 = cuentas.get(i);
            } else {
                cuenta = null;
            }

        }
        return cuenta2;
    }
 
    public void NuevaCuenta() {

        Scanner tcl = new Scanner(System.in);
        Ccuenta nuevaCuenta = new Ccuenta();
        String nombre, cuenta;
        double saldo, tipoDeInteres;
        boolean erroneo;
        System.out.println("====== ALTAS DE CUENTAS ======");

        do {
            erroneo = true;
            //Si el nombre esta vacio se captura una excepcion
            try {
                System.out.println("Introduce tu nombre:");
                nombre = tcl.nextLine();
                nuevaCuenta.setNombre(nombre);
                erroneo = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (erroneo);

        do {
            erroneo = true;
            //Si la cuenta esta vacia se capturar una excepcion
            try {
                System.out.println("Introduce tu cuenta");
                cuenta = tcl.nextLine();
                //Comprueba que el número de cuenta no esté duplicado
                for (int i = 0; i < cuentas.size(); i++) {
                    if (cuentas.get(i).getCuenta().equals(cuenta)) {
                        System.out.println("Cuenta no valida");
                    }
                }
                nuevaCuenta.setCuenta(cuenta);
                erroneo = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (erroneo);
        
        do {
            erroneo = true;
            
            try {
                
                System.out.println("Introduce tu saldo");
                saldo = tcl.nextDouble();
                nuevaCuenta.setSaldo(saldo);
                erroneo = false;
                
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        } while (erroneo);

        do {
            erroneo = true;
            try {
                System.out.println("Introduce tu tipo de interes:");
                tipoDeInteres = tcl.nextDouble();
                nuevaCuenta.setTipoDeInteres(tipoDeInteres);
                erroneo = false;

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        } while (erroneo);

        //Añade la cuenta creada a la lista de cuentas
        cuentas.add(nuevaCuenta);

        //Devuelve la posicion
        int pos = cuentas.size() -1;
        System.out.println("");
        System.out.println("Cuenta creada con exito");
        System.out.println("Posicion cuenta:"+pos);

    }

    public void ConsultarCuenta() {
        
        Scanner tcl = new Scanner(System.in);
        String cuenta;
        System.out.println("====== CONSULTA DE CUENTA ======");
        System.out.println("Introduce tu cuenta:");
        cuenta = tcl.nextLine();

        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCuenta().equals(cuenta)) {
                System.out.println(cuentas.get(i).toString());

            }
        }

    }
    //Metodo Modificar Cuenta
    public void modificarCuenta() {
        Scanner tcl = new Scanner(System.in);
        int num;
        String nomNuevo, cuentaNueva;
        double saldoNuevo, tipoNuevo;
        boolean erroneo;

        do {
            System.out.println("====== MODIFICAR CUENTA ======");
            System.out.println("Introduce tu cuenta:");
            String cuenta = tcl.nextLine();

            System.out.println("1. Modidicar nombre");
            System.out.println("2. Modificar cuenta");
            System.out.println("3. Modificar saldo");
            System.out.println("4. Modificar tipo de interes");
            System.out.println("0. Salir ");
            num = tcl.nextInt();

            switch (num) {

                case 1:
                    do {
                        erroneo = true;

                        try {
                            System.out.println("Introduce el nombre nuevo:");
                            nomNuevo = tcl.nextLine();

                            for (int i = 0; i < cuentas.size(); i++) {
                                if (cuentas.get(i).getCuenta().equals(cuenta)) {
                                    cuentas.get(i).setNombre(nomNuevo);

                                }
                                erroneo = false;
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        
                    } while (erroneo);
            }
            break;

        } while (num != 0);
    }

}
