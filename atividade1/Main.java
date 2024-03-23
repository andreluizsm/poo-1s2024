package atividade1;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        calc.numA = 2.0;
        calc.numB = 3.0;
        
        System.out.println("Somar: " + calc.somar());
        System.out.println("Subtrair: " + calc.subtrair());
        System.out.println("multiplicar: " + calc.multiplicar());
        System.out.println("dividir: " + calc.dividir());
        System.out.println("Verifica numero primo 0 " + calc.verificarNumeroPrimo(0));
        System.out.println("Verifica numero primo 1 " + calc.verificarNumeroPrimo(1));
        System.out.println("Verifica numero primo 2 " + calc.verificarNumeroPrimo(2));
        System.out.println("Verifica numero primo 3 " + calc.verificarNumeroPrimo(3));
        System.out.println("Verifica numero primo 7 " + calc.verificarNumeroPrimo(7));
        System.out.println("Verifica numero primo 83 " + calc.verificarNumeroPrimo(83));
        System.out.println("Verifica numero primo 100 " + calc.verificarNumeroPrimo(100));
        System.out.println("Verifica numero primo 991 " + calc.verificarNumeroPrimo(991));
        System.out.println("Verifica numero primo 104729 " + calc.verificarNumeroPrimo(104729));
        System.out.println("Verifica numero primo 14348907 " + calc.verificarNumeroPrimo(14348907));
        
    }
}
