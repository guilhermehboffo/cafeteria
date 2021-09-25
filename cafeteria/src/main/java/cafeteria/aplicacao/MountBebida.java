package cafeteria.aplicacao;

import cafeteria.adicional.Cookie;
import cafeteria.adicional.LeiteNinho;
import cafeteria.adicional.GeloDeCremeDeLeite;
import cafeteria.adicional.CanelaEmPo;
import cafeteria.adicional.ChocolateEmPo;
import cafeteria.adicional.RaspasDeLimao;
import cafeteria.adicional.LeiteCondensado;
import cafeteria.bebida.Cafe;
import cafeteria.bebida.CafeComLeite;
import cafeteria.bebida.EspressoPanna;
import cafeteria.bebida.LeiteComChocolate;
import cafeteria.bebida.Mocha;
import java.util.Scanner;
import java.util.ArrayList;

public class MountBebida {

    private int op;
    private double totalValue;
    private double valueBebida;
    private int validator = 1;
    private final ArrayList<String> adicional = new ArrayList();
    private final ArrayList<String> bebida = new ArrayList();

    public void selectBebida(int op) {
        switch (op) {
            case 0:
                break;
            case 1:
                Cafe cafe = new Cafe();
                cafe.mountCafe();
                valueBebida = cafe.getValue();
                bebida.add("Café");
                break;
            case 2:
                CafeComLeite cafeComLeite = new CafeComLeite();
                cafeComLeite.mountCafeComLeite();
                valueBebida = cafeComLeite.getValue();
                bebida.add("Café Com Leite");
                break;
            case 3:
                LeiteComChocolate leiteComChocolate = new LeiteComChocolate();
                leiteComChocolate.mountLeiteComChocolate();
                valueBebida = leiteComChocolate.getValue();
                bebida.add("Leite Com Chocolate");
                break;
            case 4:
                Mocha mocha = new Mocha();
                mocha.mountMocha();
                valueBebida = mocha.getValue();
                bebida.add("Mocha");
                break;
            case 5:
                EspressoPanna espressoPanna = new EspressoPanna();
                espressoPanna.mountEspressoPanna();
                valueBebida = espressoPanna.getValue();
                bebida.add("Espresso Panna");
                break;
        }
    }

    public void selectTamanho(int op) {
        switch (op) {
            case 1:
                totalValue = valueBebida;
                break;
            case 2:
                totalValue = (valueBebida * 0.2) + valueBebida;
                break;
            case 3:
                totalValue = (valueBebida * 0.35) + valueBebida;
                break;
        }
    }

    public void selectAdicional() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione Uma Opção De Adicional:");
        System.out.println("0 - Sem Adicional");
        System.out.println("1 - Raspas De Limão");
        System.out.println("2 - Canela Em Pó");
        System.out.println("3 - Leite Ninho (Colher)");
        System.out.println("4 - Gelo De Creme De Leite (Cubo)");
        System.out.println("5 - Leite Condensado (Colher)");
        System.out.println("6 - Chocolate Em Pó(Colher)");
        System.out.println("7 - Cookie (Unidade)");
        System.out.println("Digite Sua Opção De Adicional: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                RaspasDeLimao raspasDeLimao = new RaspasDeLimao();
                raspasDeLimao.mountRaspasDeLimao();
                totalValue += raspasDeLimao.getValue();
                adicional.add("Raspas De Limão");
                break;
            case 2:
                CanelaEmPo canelaEmPo = new CanelaEmPo();
                canelaEmPo.mountCanelaEmPo();
                totalValue += canelaEmPo.getValue();
                adicional.add("Canela Em Pó");
                break;
            case 3:
                LeiteNinho leiteNinho = new LeiteNinho();
                leiteNinho.mountLeiteNinho();
                totalValue += leiteNinho.getValue();
                adicional.add("Leite Ninho (Colher)");
                break;
            case 4:
                GeloDeCremeDeLeite geloDeCremeDeLeite = new GeloDeCremeDeLeite();
                geloDeCremeDeLeite.mountGeloDeCremeDeLeite();
                totalValue += geloDeCremeDeLeite.getValue();
                adicional.add("Gelo De Creme De Leite (Cubo)");
                break;
            case 5:
                LeiteCondensado leiteCondensado = new LeiteCondensado();
                leiteCondensado.mountLeiteCondensado();
                totalValue += leiteCondensado.getValue();
                adicional.add("Leite Condensado (Colher)");
                break;
            case 6:
                ChocolateEmPo chocolateEmPo = new ChocolateEmPo();
                chocolateEmPo.mountChocolateEmPo();
                totalValue += chocolateEmPo.getValue();
                adicional.add("Chocolate Em Pó(Colher)");
                break;
            case 7:
                Cookie cookie = new Cookie();
                cookie.mountCookie();
                totalValue += cookie.getValue();
                adicional.add("Cookie (Unidade)");
                break;
        }
    }

    public void moreAdicional() {
        Scanner sc = new Scanner(System.in);
        while (validator == 1) {
            System.out.println("Gostaria De Adicionar Um Adicional ?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            validator(sc.nextInt());
        }

    }

    private void validator(int op) {
        switch (op) {
            case 1:
                selectAdicional();
                break;
            case 2:
                validator -= 1;
                break;
        }

    }

    public double getTotalValue() {
        return totalValue;
    }

    public ArrayList<String> getAdicional() {
        return adicional;
    }

    public ArrayList<String> getBebida() {
        return bebida;
    }

}
