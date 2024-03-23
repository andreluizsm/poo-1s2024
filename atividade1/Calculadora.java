package atividade1;

public class Calculadora {
    
    Double numA;
    Double numB;

    Double somar (){
      return numA + numB;
    }

    Double subtrair (){
        return numA - numB;
    }

    Double multiplicar (){
        return numA * numB;
    }

    Double dividir (){
        return numA / numB;
    }

    boolean verificarNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
    

    
}
