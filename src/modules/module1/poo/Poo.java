package modules.module1.poo;

// ===============================
// Programação orientada a objetos
// É um paradigma da programação baseado no conceito de objetos, que são estruturas capazes de armazenar estados e comportamentos.
// ===============================
public class Poo {
    public static void main(String[] args) {

        //Objeto
        //Instância da classe Student;
        Student estudante1 = new Student("Enzo", 21);
        estudante1.estudar();
        System.out.println(Student.qtdAlunos);
        estudante1.qtdAlunos = 10;
        System.out.println(estudante1.qtdAlunos);
        System.out.println(Student.qtdAlunos);


    }
}


// Classe Student
// Identidade: Representar estudantes na nossa aplicação
// Atributos: Nome, idade;
// Métodos: estudar()
class Student{
    private String nome;
    private int idade;
    protected static int qtdAlunos;

     Student(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        qtdAlunos++;
    }

    public void estudar(){
         System.out.println(this.nome + " começou a estudar");
    }
    public String getNome() {
         return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
