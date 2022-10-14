public class ProductManager {
    public void add(Product product){
        /*
        ProductValidator validator = new ProductValidator();
        if(validator.isValid(product)) {
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Ürün bilgisi geçersizdir");
        }
        */
        if(ProductValidator.isValid(product)) {
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Ürün bilgisi geçersizdir");
        }
        /*
        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();
        */



    }
}
