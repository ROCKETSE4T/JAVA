package modules.modules1.strings.format;

public class CupomItem {
    private int order;
    private int Sku;
    private String descricao;
    private double qtd;
    private String und;
    private double preco;


    public CupomItem(int order, int Sku, String descricao, double qtd, String und, double preco) {
        this.order = order;
        this.Sku = Sku;
        this.descricao = descricao;
        this.qtd = qtd;
        this.und = und;
        this.preco = preco;
    }



    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getSku() {
        return Sku;
    }

    public void setSku(int sku) {
        Sku = sku;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }
}
