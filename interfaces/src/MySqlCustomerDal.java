public class MySqlCustomerDal implements ICustomerDal, IRepository { //Dal = Data Access Layer - Veritabanı işlemleri yapılan yer anlamında kullanılır
    //1class extend edilir ama birden fazla interface implement edilebilir.
    //Interface ler referans tutucudur
    @Override
    public void Add() {
        System.out.println("My sql eklendi");
    }

}
