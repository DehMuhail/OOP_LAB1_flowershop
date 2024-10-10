import com.accesories.*;
import com.flowers.*;
import com.Bouquet.*;
public class Main {
    public static void main(String[] args) {
        Lily Lily = new Lily();
        Lily.print();
        Tulip Tulip = new Tulip();
        Tulip.print();
        Rose Rose = new Rose();
        Rose.print();
        Accessory Acces = new Accessory("Aboba");
        Acces.print();
        Brooch Brooch = new Brooch();
        System.out.println("Brooch");
        Brooch.print();
        Wrapping Wrap = new Wrapping();
        System.out.println("wrapping");
        Wrap.print();
    }
}
