public class Product {
    private String name;
    private int price;
    private int code;
    private int count;
    public Product(String name, int price, int code){
        this.name = name;
        this.price = price;
        this.code = code;
        count = 0;
    }
   public Product(String name, int price, int code, int count){
        this.name = name;
        this.price = price;
        this.code = code;
        this.count = count;
   }

   public void SetPrice(int val){
        price = val;
   }
   public void SetCount(int val){
        if(val < 0){
            System.out.println("Cant be less than zero");
            return;
        }
        count = val;
   }
   public void AddCount(int val){
        count += val;
   }
   public int GetPrice(){
        return price;
   }
   public int GetCount(){
        return count;
   }

   public String GetName(){return name;}

}
