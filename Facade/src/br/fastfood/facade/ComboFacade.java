package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                combo = new Combo(
                        new Burger("Burger Clássico", 18.99),
                        new Bebida("Refrigerante", 8.0),
                        new Sobremesa("Sorvete", 6.50));
                break;
            case 2:
                combo = new Combo(
                        new Burger("Burger Duplo", 22.00),
                        new Bebida("Suco Natural", 10.00),
                        new Sobremesa("Brownie", 8.50));
                break;
            default:
                System.out.println("Combo desconhecido!");
        }
    }

    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo foi criado.");
            return;
        }

        System.out.println("Itens do Combo:");
        for (ItemCombo item : combo.getItens()) {
            System.out.println("- " + item);
        }
    }

    public double getPrecoTotal() {
        if (combo == null) {
            return 0;
        }
        return combo.getPrecoTotal();
    }
}
