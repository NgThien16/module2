package ss5_access_modifier;

public class ProductManagement {
    private static Product[] productList = new Product[100];
    static{
        productList[0] = new Product(1,"Samsung",100);
        productList[1] = new Product(2, "Iphone", 150);
    }
    public Product[] getAll(){

        return productList;
    }

    public void add(Product product){
        for(int i = 0; i < productList.length; i++){
            if(productList[i] == null){
                productList[i] = product;
                break;
            }
        }
    }
    public void remove(Product product){
        for(int i = 0; i < productList.length; i++){
            if(productList[i] != product&& productList[i].getId() == product.getId()){
                productList[i] = null;
                break;
            }
        }
    }
    public Product find(int id){
        for(int i = 0; i < productList.length; i++){
            if(productList[i] != null && productList[i].getId() == id){
                return productList[i];
            }
        }
        return null;
    }
}
