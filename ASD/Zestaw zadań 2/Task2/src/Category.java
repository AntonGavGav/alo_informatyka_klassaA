import java.util.*;

public class Category {
    private String name;
    private Set<Product> products = new HashSet<Product>();

    public Category(){
        this.name = "Main"; //nie podając żadnych danych (pierwsza główna kategoria)
    }
    public Category(String name){
        this.name = name;
    }

    public Category(String name, Product[] products){
        this.name = name;
        this.products.addAll(Arrays.asList(products));
    }


    //Klasa powinna umożliwiać ustawianie nowej kategorii - what???
    public void resetCategory(String name){
        this.name = name;
        products.clear();
    }
    public void resetCategory(String name, Product[] new_prod){
        this.name = name;
        products.clear();
        products.addAll(Arrays.asList(new_prod));
    }

    public Set<Product> getProducts(){
        return products;
    }

    public String[] getProductNames(){
        Product[] products1 = products.toArray(new Product[0]);
        String[] names = new String[products1.length];
        for(int i = 0; i < products1.length; i++){
            names[i] = products1[i].GetName();
        }
        return names;
    }

    public void addProducts(Product[] to_add){
        Collections.addAll(products, to_add);
    }
    public void removeProducts(Product[] to_remove){
        for(Product pr: to_remove){
            products.remove(pr);
        }
    }
}
