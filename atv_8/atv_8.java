package atv_8;

public class atv_8 {
    public static void main(String[] args) {
        Nota notas1[] = new Nota[5];
        Nota notas2[] = new Nota[5];
        Nota notas3[] = new Nota[5];
        Nota notas4[] = new Nota[5];
        Nota notas5[] = new Nota[5];

        Aluno al1 = new Aluno("Rodrigo Lopes", 20112349, notas1);
        Aluno al2 = new Aluno("Rafael Brandão", 20112350, notas2);
        Aluno al3 = new Aluno("Emmanoel Matheus", 20112351, notas3);
        Aluno al4 = new Aluno("Josefina Lopes", 20112352, notas4);
        Aluno al5 = new Aluno("Rafaely Sampaio", 20112353, notas5);

        notas1[0].setAssunto("Calculo 2");
        notas1[0].setNota(7);
        notas1[1].setAssunto("MD");
        notas1[1].setNota(6);
        notas1[2].setAssunto("POO");
        notas1[2].setNota(8);
        notas1[3].setAssunto("AL");
        notas1[3].setNota(5);
        notas1[4].setAssunto("GA");
        notas1[4].setNota(10);

        notas2[0].setAssunto("Calculo 2");
        notas2[0].setNota(7);
        notas2[1].setAssunto("MD");
        notas2[1].setNota(6);
        notas2[2].setAssunto("POO");
        notas2[2].setNota(8);
        notas2[3].setAssunto("AL");
        notas2[3].setNota(5);
        notas2[4].setAssunto("GA");
        notas2[4].setNota(10);

        notas3[0].setAssunto("Calculo 2");
        notas3[0].setNota(7);
        notas3[1].setAssunto("MD");
        notas3[1].setNota(6);
        notas3[2].setAssunto("POO");
        notas3[2].setNota(8);
        notas3[3].setAssunto("AL");
        notas3[3].setNota(5);
        notas3[4].setAssunto("GA");
        notas3[4].setNota(10);

        notas4[0].setAssunto("Calculo 2");
        notas4[0].setNota(7);
        notas4[1].setAssunto("MD");
        notas4[1].setNota(6);
        notas4[2].setAssunto("POO");
        notas4[2].setNota(8);
        notas4[3].setAssunto("AL");
        notas4[3].setNota(5);
        notas4[4].setAssunto("GA");
        notas4[4].setNota(10);

        notas5[0].setAssunto("Calculo 2");
        notas5[0].setNota(7);
        notas5[1].setAssunto("MD");
        notas5[1].setNota(6);
        notas5[2].setAssunto("POO");
        notas5[2].setNota(8);
        notas5[3].setAssunto("AL");
        notas5[3].setNota(5);
        notas5[4].setAssunto("GA");
        notas5[4].setNota(10);

        al1.imprimirDados();
        al2.imprimirDados();
        al3.imprimirDados();
        al4.imprimirDados();
        al5.imprimirDados();
    }
}
