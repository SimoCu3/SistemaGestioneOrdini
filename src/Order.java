public class Order {

    private String cliente;
    private String prodotto;
    private int quantità;
    private double prezzoProdotto;

    public Order(String cliente, String prodotto, int quantità, double prezzoProdotto) {
        this.cliente = cliente;
        this.prodotto = prodotto;
        this.quantità = quantità;
        this.prezzoProdotto = prezzoProdotto;
    }

    //Getter / Setter
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProdotto() {
        return prodotto;
    }

    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }

    public double getPrezzoProdotto() {
        return prezzoProdotto;
    }

    public void setPrezzoProdotto(double prezzoProdotto) {
        this.prezzoProdotto = prezzoProdotto;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "cliente='" + cliente + '\'' +
                ", prodotto='" + prodotto + '\'' +
                ", quantità=" + quantità +
                ", prezzoProdotto=" + prezzoProdotto +
                '}' + "\n";
    }
}
