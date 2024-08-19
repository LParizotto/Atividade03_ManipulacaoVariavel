public class Main {
    public static void main(String[] args) {

        //Declaração de variáveis
        String produto = "Cerveja";
        int valor = 10;
        int quant = 12;
        double imposto = 0.2;
        double lucro = 0.2;

        //Operações
        int bruto = valor * quant;
        double impostototal = bruto * imposto;
        double valortotal = bruto + impostototal;
        double margemlucro = 1 - lucro;
        double precovenda = valortotal / margemlucro;
        double ganhos = precovenda - valortotal;

        //Exibição
        System.out.println("Nome do produto: " + produto);
        System.out.println("Quantidade: " + quant);
        System.out.println("Imposto: " + imposto);
        System.out.println("Lucro: " + lucro);

        System.out.println("Bruto: " + bruto);
        System.out.println("Valor com imposto: " + impostototal);
        System.out.println("Valor total do prduto: " + valortotal);
        System.out.println("Margem de lucro desejada: " + lucro);
        System.out.println("Preço da venda: " + precovenda);
        System.out.println("Ganhos da venda: " + ganhos);

    }
}