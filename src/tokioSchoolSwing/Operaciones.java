package tokioSchoolSwing;

import javax.swing.*;

public class Operaciones {
    private JTextField numero1;
    private JTextField numero2;
    private double resultado;

    public Operaciones(JTextField numero1, JTextField numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    public JTextField getNumero1() {
        return numero1;
    }

    public JTextField getNumero2() {
        return numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public double suma(double numero1, double numero2){
        return numero1 + numero2;
    }
    public double resta(double numero1, double numero2){
        return numero1 - numero2;
    }
    public double multiplicacion(double numero1 , double numero2){
        return numero1* numero2;
    }
    public double division(double numero1, double numero2){
        return numero1 / numero2;
    }

    @Override
    public String toString() {
        return "Operaciones{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                ", resultado=" + resultado +
                '}';
    }
}
