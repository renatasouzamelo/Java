
package classe;


public class ProdutoTeste {
    
    public static void main(String[] args) {
       Produto p1 = new Produto();
       Produto p2 = new Produto();
       
       p1.nome = "Notebook";
       p1.preco = 430.00;
       p1.desconto = 30.00;
       
       p2.nome = "caneta";
       p2.preco = 12.50;
       p2.desconto = 0.1;
       
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        
        Double precoFinal1 = p1.preco * (1- p1.desconto);
        Double precoFinal2 = p2.preco * (1- p2.desconto);
        Double media = (precoFinal1 + precoFinal2)/2;
        
        
        System.out.println(String.format("Média do carrinho =  R$%.2f",
                media));
    }
    
}
