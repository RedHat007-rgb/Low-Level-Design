package singleton.Eager;



public class Client{
    public static void main(String[] args) {

//        access the instance from two different “parts” of the app
        ConfigurationManager billing =  ConfigurationManager.getInstance();
        System.out.println(ConfigurationManager.getInstance());
        billing.setTaxRate(20);
        System.out.println(ConfigurationManager.getInstance());


        ConfigurationManager reporting = ConfigurationManager.getInstance();
        System.out.println(ConfigurationManager.getInstance());


//        verifying it’s the same object
        System.out.println(System.identityHashCode(reporting));
        System.out.println(System.identityHashCode(billing));
        if (billing == reporting) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
