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

    
    
    //Metodo Buscar Cuenta
    public  Ccuenta buscarCuenta(
    ) {

        Scanner tcl = new Scanner(System.in);
        int res;
         String nombre, cuenta;
         Ccuenta cuentaEncontrada = null;

        do {

            System.out.println("====== BUSCAR CUENTA ======");
            System.out.println("1.Buscar por nombre");
            System.out.println("2.Buscar por cuenta");
            System.out.println("0.Salir");
            res = tcl.nextInt();
            tcl.nextLine();

            switch (res) {
                case 1:
                    System.out.println("Introduce tu nombre:");
                    nombre = tcl.nextLine();
                    cuentaEncontrada = poscuentanombre(nombre);
                    
                    break;
                case 2:

                    System.out.println("Introduce tu cuenta:");
                    cuenta = tcl.nextLine();
                    cuentaEncontrada = poscuenta(cuenta);
                    break;
            }
            
            return cuentaEncontrada;
        } while (res != 0);
        
        

    }
    
    //Metodo buscar por nombre
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

    //Metodo buscar por cuenta
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
    
    //Metodo para crear una cuenta nueva
 
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
    //Metodo ConsultarCuenta
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
            System.out.println("1. Modidicar nombre");
            System.out.println("2. Modificar cuenta");
            System.out.println("3. Modificar saldo");
            System.out.println("4. Modificar tipo de interes");
            System.out.println("0. Salir ");
            num = tcl.nextInt();
            tcl.nextLine();

            switch (num) {

                case 1:
                    do {
                        erroneo = true;

                        try {
                            System.out.println("Introduce tu numero de cuenta:");
                            String cuenta = tcl.nextLine();

                            for (int i = 0; i < cuentas.size(); i++) {
                                if (cuentas.get(i).getCuenta().equals(cuenta)) {
                                    System.out.println("Introduce el nombre nuevo:");
                                    nomNuevo = tcl.nextLine();
                                    cuentas.get(i).setNombre(nomNuevo);
                                    System.out.println("Nombre modificado con exito");

                                }
                                erroneo = false;
                            }

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } while (erroneo);
                    break;

                case 2:
                    do {
                        erroneo = true;

                        try {
                            System.out.println("Introduce tu numero de cuenta:");
                            String cuenta = tcl.nextLine();

                            for (int i = 0; i < cuentas.size(); i++) {
                                if (cuentas.get(i).getCuenta().equals(cuenta)) {
                                    System.out.println("Introduce tu cuenta nueva:");
                                    cuentaNueva = tcl.nextLine();
                                    cuentas.get(i).setCuenta(cuentaNueva);
                                    System.out.println("Cuenta modificada con exito");

                                }
                                erroneo = false;
                            }

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } while (erroneo);

                    break;

                case 3:
                    do {
                        erroneo = true;

                        try {
                            System.out.println("Introduce tu numero de cuenta:");
                            String cuenta = tcl.nextLine();

                            for (int i = 0; i < cuentas.size(); i++) {
                                if (cuentas.get(i).getCuenta().equals(cuenta)) {
                                    System.out.println("Introduce tu saldo nuevo:");
                                    saldoNuevo = tcl.nextInt();
                                    cuentas.get(i).setSaldo(saldoNuevo);
                                    System.out.println("Saldo modificado con exito");

                                }
                                erroneo = false;
                            }

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } while (erroneo);
                    break;

                case 4:
                    do {
                        erroneo = true;

                        try {
                            System.out.println("Introduce tu numero de cuenta:");
                            String cuenta = tcl.nextLine();

                            for (int i = 0; i < cuentas.size(); i++) {
                                if (cuentas.get(i).getCuenta().equals(cuenta)) {
                                    System.out.println("Introduce tu tipo de interes nuevo:");
                                    tipoNuevo = tcl.nextInt();
                                    cuentas.get(i).setTipoDeInteres(tipoNuevo);
                                    System.out.println("Tipo de interes modificado con exito");

                                }
                                erroneo = false;
                            }

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    } while (erroneo);

            }

        } while (num != 0);
    }
 
    //Metodo Anular Cuenta
    public void AnularCuenta() {

        Scanner tcl = new Scanner(System.in);
        String cuenta;
        Boolean erroneo;

        do {
            erroneo = true;
            try {

                System.out.println("====== ANULAR CUENTA ======");
                System.out.println("Introduce tu numero de cuenta:");
                cuenta = tcl.nextLine();

                for (int i = 0; i < cuentas.size(); i++) {
                    if (cuentas.get(i).getCuenta().equals(cuenta)) {
                        //Una vez encuentra la cuenta, comrpueba que el saldo es igual a 0
                        if (cuentas.get(i).getSaldo() == 0) {
                            cuentas.remove(i);
                            System.out.println("Cuenta anulada con exito");
                        } else {
                            System.out.println("Error, saldo mayor a 0");
                        }

                    }
                    erroneo = false;

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        } while (erroneo);

    }

    //Metodo Visualizar Cuentas
    public void VisualizarCuentas() {
        

        System.out.println("Listado de cuentas:");
        for (int i = 0; i < cuentas.size(); i++) {

            System.out.println("" + cuentas.get(i).toString());
        }

    }

}
