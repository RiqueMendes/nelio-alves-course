package product;

public class Product {
   public String name;
   public double price; 
   public int quantity; //Atributo da classe 

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;  // Ao usar o THIS estamos dizendo qeu estamos usando o atributo da classe e nao o parametro da funcao
        //Estamos somando ao QUANTITY da classe ao quantity do atributo
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    
    public String toString(){
        return name +  ", $ " + String.format("%.2f", price) + ", " + quantity + " units " + "Total: "+ String.format("%.2f", totalValueInStock());
    }

}
