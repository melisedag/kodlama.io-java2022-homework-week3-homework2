public class Main {
    public static void main(String[] args) {
        /*
        gretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();
        */
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());

    }
}