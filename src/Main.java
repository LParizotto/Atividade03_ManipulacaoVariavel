public class Main {
    public static void main(String[] args) {

        //Declaração de variáveis
        int valor = 10;
        double imposto = 0.2;
        double lucro = 0.2;

        //Operações
        double margemlucro = 1 - lucro;
        double precovenda = valortotal / margemlucro;
        double ganhos = precovenda - valortotal;

        //Exibição
        System.out.println("Nome do produto: " + produto);
        System.out.println("Quantidade: " + quant);
        System.out.println("Imposto: " + imposto);
        System.out.println("Lucro: " + lucro);

        System.out.println("Margem de lucro desejada: " + lucro);
        System.out.println("Preço da venda: " + precovenda);
        System.out.println("Ganhos da venda: " + ganhos);

    }
}