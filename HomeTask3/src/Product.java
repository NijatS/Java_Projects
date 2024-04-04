public class Product {
    public String name;
    public double price;
    public Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
        else{
            System.out.println("Invalid Price Value");
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    public Product(){
    }
    public Product(String name,double price,Category category){
        this.name = name;
        if(price > 0 ){
            this.price = price;
        }
        else{
            System.out.println(price + " is invalid price vale");
        }
        this.category = category;
    }
    public void updatePrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", category=" + category.getName() + '}';
    }
   
}
