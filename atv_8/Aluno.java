package atv_8;

public class Aluno {
    private String nome;
    private int matricula;
    private Nota[] notas;

    public Aluno(String nome, int matricula, Nota[] notas) {
        if (nome.length() <= 50 && nome.contains(" ")) {
            this.nome = nome;
        }

        String matriculaStr = Integer.toString(matricula); //Transformando o input matricula
        char numArr[] = matriculaStr.toCharArray();        //em uma lista de Char's
        if (numArr[0] == '2' && numArr[1] == '0' && numArr[2] == '1' && numArr.length == 8) {
            this.matricula = matricula;
        }

        if (notas.length == 5) {
            this.notas = notas;
        }
    }

    public float notaSemestral() {
        float menor = this.notas[0].getNota();
        float resultado = 0;
        for (int i = 0; i < this.notas.length; i ++) {
            if (this.notas[i].getNota() < menor) {
                menor = this.notas[i].getNota();
            }
        }
        for (int i = 0; i < this.notas.length; i ++) {
            if (this.notas[i].getNota() != menor) {
                resultado += this.notas[i].getNota();
            }
        }
        return resultado;
    }

    public float tudoOuNada() {
        float nota = this.notaSemestral();
        if (nota < 6) {
            nota -= nota*0.25;
        } else if (nota >= 6 && nota < 7) {
            nota = 7;
        } else if (nota >= 7 && nota <+ 8) {
            nota += nota*0.15;
        } else {
            nota = 10;
        }
        return nota;
    }

    public void imprimirDados() {
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Notas Obtidas: ");
        for (int i = 0; i <= this.notas.length;  i++) {
            System.out.println("Nota: " + this.notas[i].getNota() + " Assunto: " + this.notas[i].getAssunto());
        }
        System.out.println("Nota Semestral: " + this.notaSemestral());
        System.out.println("Nota Final: " + this.tudoOuNada());
    }
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }
}
