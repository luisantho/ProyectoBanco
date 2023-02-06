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
    
    public void NuevaCuenta(){
        
        Scanner tcl = new Scanner (System.in);
        Ccuenta nuevaCuenta = new Ccuenta ();
        String nombre,cuenta;
        double saldo,tipoDeInteres;
        boolean erroneo;
        System.out.println("====== ALTAS DE CUENTAS ======");
        
        do{
            erroneo = true;
            try{
                System.out.println("Introduce tu nombre:");
                nombre = tcl.nextLine();
                nuevaCuenta.setNombre(nombre);
                erroneo = false;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(erroneo);
        
        System.out.println("Introduce tu cuenta");
        cuenta = tcl.nextLine();
        
        //Comprueba que el número de cuenta no esté duplicado
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getCuenta().equals(cuenta)) {
                System.out.println("Cuenta no valida");
            }           
        }
        System.out.println("Introduce tu saldo");
        saldo = tcl.nextDouble();
        System.out.println("Introduce tu tipo de interes:");
        tipoDeInteres = tcl.nextDouble();
        
        NuevaCuenta
    }
    
}
