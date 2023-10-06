import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        final int numPerguntas = 5;
        int pontoQuestao = 2;

        char [] gabarito = {'a', 'c', 'b', 'a', 'c'};
        String [] perguntas = {
                "Qual animal é considerado o melhor amigo do homem?",
                "Qual a primeira letra do alfabeto?",
                "2 X 10 é igual a ... ?",
                "Com quantos anos se atinge a maioridade, no Brasil?",
                "Qual o valor de PI?"
        };
        String [] alternativas = {
          "a) Cachorro   b) Pássaro   c) Coelho",
          "a) X   b) Z   c) A",
          "a) 2,0   b) 20   c) 1010",
          "a) 18   b) 16   c) 21",
          "a) 2,42   b) 6,3   c) 3,14"
        };
        char [] respostas = new char [numPerguntas];
        char resp;
        int nota = 0;
        String aluno;

        System.out.printf ("Digite seu nome: ");
        aluno = ler.nextLine();

        for (int i = 0; i < numPerguntas; i++) {
            System.out.println("___________________________________");
            System.out.println("Pergunta %d".formatted(i + 1));
            System.out.println("%s".formatted(perguntas[i]));
            System.out.println("%s".formatted(alternativas[i]));
            resp = ler.nextLine().charAt(0);
            System.out.println("___________________________________");
            respostas [i] = resp;
        }

        for (int i = 0; i < numPerguntas; i++) {
            if (gabarito[i] == respostas[i]){
                nota += pontoQuestao;
            }
        }

        System.out.println("Fim da prova. Sua nota foi %d".formatted(nota));

    }
}