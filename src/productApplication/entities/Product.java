package productApplication.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    


    public Product(String name, double price, int quantity) {
        this.name = name; // this = referencia para o proprio objeto 
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) {  ///SobreCarga "Mesmo construtor com números diferentes de padroes"
        this.name = name; // this = referencia para o proprio objeto 
        this.price = price;
        // this.quantity = quantity; //Opcional porque por padrao o java ja inicia com zero
        // Palavra THIS também é opcional, pois nao temos mais o this no construtor.
    }

    public Product(){ //Se for criar um construtor personalizado mas ainda quiser manter o construtor padrão é só declarar ele assim

    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price)
                + ", " + quantity
                + " units "
                + "Total: "
                + String.format("%.2f", totalValueInStock());
    }
}
