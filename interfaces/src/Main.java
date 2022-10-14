public class Main {
    public static void main(String[] args) {
       // ICustomerDal customerDal = new OracleCustomerDal(); //implemente eden methodun referansını kullanır
//interface ler new lenemez.

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal()); //parametre olarak oracle sectık asagıdakı koda benzer ıslem
        //customerManager.customerDal = new MySqlCustomerDal(); //veritabanını seçtik
        customerManager.add();

    }
}