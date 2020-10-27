package br.com.gerenciamento;

public class TestaBuscaAlunoCurso {

    public static void main(String[] args) {
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

        System.out.println("Quem e o aluno com matriucla 56170");
        Aluno aluno = javaColecoes.buscaMatriculado(56170);
        System.out.println("Aluno : " + aluno);
    }
}
