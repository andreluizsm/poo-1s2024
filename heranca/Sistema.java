package heranca;

import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;
import heranca.empresa.Diretor;

public class Sistema {
    
    public static void main(String[] args) {
        
        Engenheiro eng1 = new Engenheiro("jaoo",123,12345,"crea 1","orientação a objetos",1000.00);

        System.out.println(eng1);

        Gerente ger1 = new Gerente("andre",12345,436565,1200.00,4);

        Diretor dir1 = new Diretor("MAURO", 123243, 12312,31343.00,13);

        System.out.println(ger1);
    }

}
