public class Calculadora {
    double n1;
    double n2;
    double resultado;

    public Calculadora() {
    }

    public double somar(double n1, double n2) {
        resultado = n1 + n2;
        return resultado;
    }

    public double subtrair(double n1, double n2) {
        resultado = n1 - n2;
        return resultado;
    }

    public double multiplicar(double n1, double n2) {
        resultado = n1 * n2;
        return resultado;
    }

    public double dividir(double n1, double n2) {
        resultado = n1 / n2;
        return resultado;
    }

    public double potencia(double n1, double n2) {
        resultado = Math.pow(n1, n2);
        return resultado;
    }

    public double raizQuadrada(double n1) {
        resultado = Math.sqrt(n1);
        return resultado;
    }
}
