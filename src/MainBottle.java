public class MainBottle {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        Bottle bottle2 = new Bottle();

        bottle1.name= "Piwniczanka ";
        bottle1.colorBottle= "zielona ";
        bottle1.size= 0.5 ;

        bottle2.name= "Cisowianka " ;
        bottle2.colorBottle= "biała ";
        bottle2.size= 0.5;

        System.out.println(bottle1.name + bottle1.colorBottle + bottle1.size + " l");
        System.out.println(bottle2.name + bottle2.colorBottle + bottle2.size + " l");
    }
}
