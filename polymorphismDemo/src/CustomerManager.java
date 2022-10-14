public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager (BaseLogger logger){ //bunu newlediğimde bana bir baselooger verecek
        this.logger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");

        /*
        DatabaseLogger logger = new DatabaseLogger();
        logger.Log("Log mesajı");
        */


    }

}
