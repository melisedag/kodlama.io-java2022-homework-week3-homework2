public class ProductValidator {
    public ProductValidator(){ //constructor - yapıcı blok
        System.out.println("Yapıcı blok çalıştı");

    }
    //yukarıdakını sadece yazdıgımızda calısmaz.
    //yapıcı bloklar new lenmeden calısmaz
    //bu sebeple productmanager kısmında bısey methodunu new leyınce calısır
    //newlemeden calısmasını ıstersek asagıdakı gıbı statıc yazlıp statıc yapıcı blok olusturulur
    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    //statıc blok bırden fazla da operasyon ıcın ayrı ayrı da yazılır
    public static boolean isValid(Product product){ //burda static eklemezsek ProductManager da açıklama satırındakı gibi yapmak gerekir
        //static yapınca tek seferlık kullanılır kullanımı cok yaygın degıl
        //static tanımlandıgında bellekten atılmıyor uygulama sıfırlanana kadar
        //new ile yaptıgımızda bellekten atılıyor
        //static oldugunda ılk belırlenen tanım ne ıse o sekılde kullanılıyor dıger kullnıcılar degıstıremıyor
        //Manager lar statıc olmaz
        if(product.price>0 && !product.name.isEmpty()){ //veritabanına girilmesi için fiyat 0 dan büyük isim boş olmamalı dedik
            return true;
        }
        else {
            return false;
        }
    }
    //bunu eklediğimizde is valid static oldugundan ProductValidator.isValid olarak gelir
    //ancak aşağıdaki bu şekilde gelmez new lemek gerekir.
    public void bisey(){

    }

    /*
    public static class BaskaBirClass{ //inner class-sınıf ıcınde sınıf
        public static void sil(){

        }

    }*/
}
