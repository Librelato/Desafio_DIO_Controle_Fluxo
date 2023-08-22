import java.nio.charset.Charset;
import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in, Charset.defaultCharset());
        
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        Contar(parametroUm,parametroDois);

        terminal.close();
    
        System.out.println("FIM");

    }

    public static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException("Parâmetro 1 deve ser MENOR que parâmetro dois!");
        if (parametroUm == parametroDois) throw new ParametrosInvalidosException("Parâmetro 2 deve ser DIFERENTE do parâmetro dois!");

        System.out.println("-- iniciando contagem --");
        for (int contador = 1; contador <= (parametroDois-parametroUm); contador++){
            System.out.println(contador);
        }
    }
}
