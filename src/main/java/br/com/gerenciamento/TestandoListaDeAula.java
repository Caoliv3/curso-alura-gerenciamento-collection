package br.com.gerenciamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {

    public static void  main(String[] args){

        Aula a1 = new Aula("Revisando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objestos", 25);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 19);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println();
        System.out.println(aulas);

//        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
//        System.out.println();
//        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println();
        System.out.println(aulas);

    }

}
