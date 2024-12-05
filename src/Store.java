public class Store {
    private int id[] = new int[5];
    private int top;
    private String[] name = new String[5];
    private double[] price = new double[5];
    private int[] stock = new int[5];

  // Declaring a Default Constructor
    public Store() {
        for(int i=0; i<5; i++) {
            this.id[i] = 0;
            this.name[i] = "null";
            this.price[i] = 0.0D;
            this.stock[i] = 0;
        }
        top = -1;
    }

  // Setter Method for product name
    public void setName(String name, int top){
        this.name[top] = name;
    }

  // Setter Method for product name
    public void setPrice(double price, int top){
        this.price[top] = price;
    }

  // Setter Method for product name
    public void setStock(int stock, int top){
        this.stock[top] = stock;
    }

  // Method for checking if stock is Full
    public boolean isFull() {
        if(top == 4)
            return true;
        else
            return false;
    }

  // Method to Add Product in a store
    public void addProduct(String name, double price, int stock) {
        if(isFull())
            System.out.println(" Store is Full");
        else {
            top++;
            id[top] = top+1;
            setName(name, top);
            setPrice(price, top);
            setStock(stock, top);
        }
    }

  // Method to Update Product details
    public void updateProduct(int productId, String name, double price, int stock) {
        int idx = productId - 1;
        setName(name, idx);
        setPrice(price, idx);
        setStock(stock, idx);
    }

  // Method to view Available Products
    public void display() {
        for(int i=0; i<5; i++) {
            System.out.println( " Id :" + id[i] + " " + " Name :" + name[i] + " " + " Price :" + price[i] + " " + " Stock :" + stock[i]);
        }
    }

}
