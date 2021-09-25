package cafeteria.aplicacao;

import cafeteria.bebida.Bebida;
import cafeteria.bebida.Cafe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Bebida bebida;
            bebida = new Bebida();
            Cafe cafe;
            cafe = new Cafe();
            MountBebida mountBebida = new MountBebida();
            
            System.out.println("Escolha Uma Bebida: ");
            System.out.println("1 - Café");
            System.out.println("2 - Café Com Leite");
            System.out.println("3 - Leite Com Chocolate");
            System.out.println("4 - Mocha");
            System.out.println("5 - Espresso Panna");
            System.out.println("Digite Sua Opção De Bebida: ");
            mountBebida.selectBebida(sc.nextInt());
            
            System.out.println("Escolha Um Tamanho: ");
            System.out.println("1 - Pequeno");
            System.out.println("2 - Médio");
            System.out.println("3 - Grande");
            System.out.println("Digite Sua Opção De Tamanho: ");
            mountBebida.selectTamanho(sc.nextInt());
            
            mountBebida.moreAdicional();
            
            System.out.println("O Valor Do Seu Pedido Foi De: " + mountBebida.getTotalValue());
            System.out.println("A bebida pedida Foi: " + mountBebida.getBebida());
            System.out.println("O(s) Adicional(is) Pedidos Foram:" + mountBebida.getAdicional());
        }
    }

}
