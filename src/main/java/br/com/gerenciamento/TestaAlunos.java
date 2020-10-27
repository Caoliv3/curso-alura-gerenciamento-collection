package br.com.gerenciamento;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args){

        Set<String> alunos = new HashSet<>();
        alunos.add("Carlos Oliveira");
        alunos.add("Aberto Loreni");
        alunos.add("Vanessa Soares");
        alunos.add("Renan Saggio");
        alunos.add("Sergio Lopes");

        for (String aluno: alunos ) {
            System.out.println(aluno);
        }
        System.out.println();
        alunos.forEach(aluno -> {System.out.println(aluno);});

        System.out.println(alunos);

        boolean carlosMatriculado = alunos.contains("Carlos Oliveira");
        System.out.println(carlosMatriculado);
    }
}
