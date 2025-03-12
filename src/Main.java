import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc  = new Calculadora();

        System.out.print("1-Soma;\n2-Subtração;\n3-Multiplicação;\n4-Divisão;\n5-Potência;\n6-Raiz Quadrada;\nEscolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao >= 1 && opcao <= 5) {
            System.out.print("Digite o primeiro valor: ");
            double primeiroValor = scanner.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double segundoValor = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println(calc.somar(primeiroValor, segundoValor));
                    break;
                case 2:
                    System.out.println(calc.subtrair(primeiroValor, segundoValor));
                    break;
                case 3:
                    System.out.println(calc.multiplicar(primeiroValor, segundoValor));
                    break;
                case 4:
                    System.out.println(calc.dividir(primeiroValor, segundoValor));
                    break;
                case 5:
                    System.out.println(calc.potencia(primeiroValor, segundoValor));
                    break;
                default:
                    System.out.println("Algo deu errado :(, tente novamente");
            }
        } else if (opcao == 6) {
            System.out.print("Digite o valor da raiz quadrada: ");
            double raizQuadrada = scanner.nextDouble();
            System.out.println(calc.raizQuadrada(raizQuadrada));
        } else {
            System.out.println("Algo deu errado :(, tente novamente");
        }
    }
}
