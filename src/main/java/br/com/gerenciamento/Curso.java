package br.com.gerenciamento;


import java.util.*;
import lombok.Data;

@Data
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaAluno = new HashMap<>();


    public Curso (String nome, String instrutor){

        if (nome == null){
            throw new NullPointerException("nome nao pode ser null");
        }
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }

    public int getTempoTotal(){
//        int tempoTotal = 0;
//        for (Aula aula: aulas) {
//            tempoTotal += aula.getTempo();
//        }

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno a1) {
        this.alunos.add(a1);
        this.matriculaAluno.put(a1.getNumeroMatricula(),a1);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriulado(Aluno a1) {
        return  this.alunos.contains(a1);
    }


    public Aluno buscaMatriculado(int i) {
        if(matriculaAluno.containsKey(i)){
            return matriculaAluno.get(i);
        }
        throw new NoSuchElementException("matriucula nao encontrada " + i);
    }
}
