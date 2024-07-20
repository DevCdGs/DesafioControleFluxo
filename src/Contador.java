import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int parametroUm;
        int parametroDois;

        System.out.println("Digite um número: ");
        parametroUm = sc.nextInt();
        System.out.println("Digite outro número: ");
        parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {


        int contagem = parametroDois - parametroUm;

        System.out.println(contagem);


    }

}
