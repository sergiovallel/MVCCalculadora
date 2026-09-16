package modelo;

public class Modelo {

    public double suma(double a, double b){
        return a + b;
    }

    public double resta(double a, double b){
        return a - b;
    }

    public double multiplicacion(double a, double b){
        return a * b;
    }

    public double division(double a, double b){
        //Fue agregado un if para evitar la division entre cero.
        if (b == 0){
            throw new ArithmeticException("Imposible dividir entre cero"); //Excepcion de dividir entre cero.
        }
        return a / b;
    }

}
