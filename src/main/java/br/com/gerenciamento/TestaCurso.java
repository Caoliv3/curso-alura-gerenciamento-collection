package br.com.gerenciamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args){

        Curso javaColecoes = new Curso("Dominando as coleções do java", "Carlos Oliveira");


//        System.out.println(aulas);

//        aulas.add(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando um Aula", 32));
        javaColecoes.adiciona(new Aula("Modelando Coleções", 23));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);




    }
}
