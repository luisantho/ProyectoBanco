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
 
    public int NuevaCuenta() {

        Scanner tcl = new Scanner(System.in);
        Ccuenta nuevaCuenta = new Ccuenta();
        String nombre, cuenta;
        double saldo, tipoDeInteres;
        boolean erroneo;
        System.out.println("====== ALTAS DE CUENTAS ======");

        do {
            erroneo = true;
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
        int pos = cuentas.lastIndexOf(nuevaCuenta);
        return pos;

    }

    public void ConsultarCuenta() {
        
        Scanner tcl = new Scanner(System.in);
        String cuenta;
        System.out.println("====== CONSULTA DE CUENTA ======");
        System.out.println("Introduce tu cuenta:");
        cuenta = tcl.nextLine();

        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCuenta().equals(cuenta)) {
                System.out.println(cuenta.toString());

            }
        }

    }

}
