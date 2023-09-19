import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Contador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        boolean entradaErrada = false;


        while(!entradaErrada){
            Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
            try{

                            
                System.out.println("Digite o primeiro parâmetro:");
                int parametroUm = terminal.nextInt();
        
                System.out.println("Digite o segundo parâmetro:");
                int parametroDois = terminal.nextInt();
                
                

                
                //chamando o método contendo a lógica de contagem
                int contagem = contar(parametroUm, parametroDois);
                interar(contagem);
                entradaErrada= true;
            
            }catch (ParametrosInvalidosException e) {

                System.err.println("O Segundo valor deve ser maior que o primeiro!");

                terminal = new Scanner(System.in).useLocale(Locale.US);
                
                continue;
                

            }catch(InputMismatchException e){
                
                System.err.println("Devem ser números e do tipo inteiros!");

                terminal = new Scanner(System.in).useLocale(Locale.US);

                continue;
            }
            
        }
        
	}
	/**
	 * @param parametroUm
	 * @param parametroDois
	 * @return
	 * @throws ParametrosInvalidosException
	 */
	static int contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();

        }else{
            int contagem = parametroDois - parametroUm;


            return contagem;
        }

		//realizar o for para imprimir os números com base na variável contagem
	}
    static void interar(int contagem){
        

        for (int contador = 1; contador <= contagem; contador++)
            System.out.println(contador);

    }
}
