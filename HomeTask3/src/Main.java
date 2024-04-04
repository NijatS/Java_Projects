
public class Main {

    public static void main(String[] args) {
        
        Category category = new Category();
        category.setName("Phone");
        
        Product product = new Product();
        
        product.name = "Iphone 15";
        product.category = category;
        product.setPrice(-5);
        
        System.out.println(product.toString());
        
        Product product2 = new Product("Galaxy S22",-6,category);
        System.out.println(product2.toString());
        product2.updatePrice(100);
        System.out.println(product2.toString());
    }
    
}
