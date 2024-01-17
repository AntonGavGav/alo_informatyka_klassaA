import java.util.HashMap;
import java.util.Map;

public class Basket {
    HashMap<Product, Integer> product_list = new HashMap<>();
    private User user = null;

    public Basket(){
        //simulation of a basket
    }
    public Basket(User user){
        this.user = user;
    }
    public Basket(User user, Product[] picked_products){
        this.user = user;
        AddProducts(picked_products);
    }
    public void PrintProducts(){
        for (Product mapKey : product_list.keySet()) {
            int mapValue = product_list.get(mapKey);
            System.out.println(mapKey.GetName() + " maps to " + mapValue);
        }
    }

    public int Pay(){
        int res = 0;
        for (Product pr: product_list.keySet()){
            res+=product_list.get(pr)*pr.GetPrice();
        }
        return res;
    }

    public void AddProducts(Product[] products){
        for(Product element: products){
            //String name = element.GetName();
            if (element.GetCount()-1 >= 0) {
                element.AddCount(-1);
                if (product_list.containsKey(element)) {
                    product_list.put(element, product_list.get(element) + 1);
                } else {
                    product_list.put(element, 1);
                }
            }

        }
    }
    public void AddUser(User user){
        if (user == null){
           return;
        }
        this.user = user;
    }
    public void RemoveProducts(Product[] products){
        for(Product element: products){
            //String name = element.GetName();
            if(product_list.containsKey(element)){
                product_list.put(element, product_list.get(element) -1);
                element.AddCount(1);
                if (product_list.get(element) == 0){
                    product_list.remove(element);
                }
            }
        }
    }
}
