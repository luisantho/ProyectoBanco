/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondecuentasbancarias;

/**
 *
 * @author luibol
 */
public class Ccuenta {

    //Atributos
    private String nombre;
    private String cuenta;
    private Double saldo;
    private Double tipoDeInteres;

    //Constructor con parámetros
    public Ccuenta(String nombre, String cuenta, Double saldo, Double tipoDeInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }
    //Constructor sin parámetros

    public Ccuenta() {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;

    }

    //Setters
    public void setNombre(String nombre) throws Exception {
        if (nombre.equals("")) {
            throw new Exception("Nombre vacio");
        }
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) throws Exception {
        if (cuenta.equals("")) {
            throw new Exception("Cuenta vacia");
        }
        this.cuenta = cuenta;

    }

    public void setSaldo(Double saldo) throws Exception {
        if (saldo < 0) {
            throw new Exception("Cantidad negativa");
        }
        this.saldo = saldo;
    }

    public void setTipoDeInteres(Double tipoDeInteres) throws Exception {
        if (tipoDeInteres < 0) {
            throw new Exception("Interes menor que cero");
        }

        this.tipoDeInteres = tipoDeInteres;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getTipoDeInteres() {
        return tipoDeInteres;
    }
    
    //Metodos 
     public void reintegro(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception("Reintegro superior al saldo ");
        }
        saldo -= cantidad;

    }

}
