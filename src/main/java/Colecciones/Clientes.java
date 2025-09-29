package Colecciones;

import java.util.Objects;

public class Clientes {
    public Clientes(String n,String numeroCuenta,double saldo){
        nombre=n;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clientes)) return false;
        Clientes clientes = (Clientes) o;
        return Objects.equals(getNumeroCuenta(), clientes.getNumeroCuenta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeroCuenta());
    }

    private String nombre;
    private String numeroCuenta;
    private double saldo;
}
