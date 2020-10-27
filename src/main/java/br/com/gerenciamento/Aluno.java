package br.com.gerenciamento;


import lombok.Data;

@Data
public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula){

        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public boolean equals(Object obj){
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }
}
