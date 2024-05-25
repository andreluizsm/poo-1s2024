package collections;

import java.util.ArrayList;

public class ExemploArrayList {
    
    public static void main(String[] args) {
        
        ArrayList <String> nomes = new ArrayList<>();

        nomes.add("tico");
        nomes.add("bob");
        nomes.add("teco");


        //System.out.println(nomes.get(1));

        for (String nome : nomes) {
            System.out.println(nome);
        }

        if (nomes.contains("carol")) {
            System.out.println("carol está aqui");
        }

        nomes.remove("carol");

        if (!nomes.contains("carol")) {
            System.out.println("carol NAO está aqui");
        }

        nomes.clear();
        if (nomes.isEmpty()) {
            
        }

    }
}
