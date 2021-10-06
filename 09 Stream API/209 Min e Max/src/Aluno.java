public class Aluno {

    final String nome;
    final double nota;
    final boolean bomComportamento = true;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString(){
        return "Aluno: " + this.nome + " | Nota: " + this.nota;
    }
}