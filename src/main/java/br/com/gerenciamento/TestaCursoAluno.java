package br.com.gerenciamento;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoAluno {

    public static void main(String[] args){

        Curso javaColecoes = new Curso("Dominando as coleções do java", "Carlos Oliveira");
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando um Aula", 32));
        javaColecoes.adiciona(new Aula("Modelando Coleções", 23));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 56170);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados");
        javaColecoes.getAlunos().forEach(aluno -> {System.out.println(aluno );});


        System.out.println("O aluno esta matriculado");
        System.out.println(javaColecoes.estaMatriulado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("aluno a1 é == ao turini?");
        System.out.println(a1.equals(turini));

        System.out.println(a1.hashCode() == turini.hashCode());

        System.out.println();
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo.getNome());
        }


    }
}
