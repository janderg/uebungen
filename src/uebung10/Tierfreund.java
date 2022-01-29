package uebung10;

class Katze {
    private String name ;
    public Katze ( String name ) {
        this. name = name ;
    }
    public String miezmiez () {
        return " Fauch !";
    }
}
class Hauskatze extends Katze {
    private String name ;
    public Hauskatze ( String name ) {
        super( name );
    }
    public String miezmiez () {
        return " Miau Miau ";
    }
}
public class Tierfreund {
    public static void main ( String [] args ) {
        Hauskatze h = new Hauskatze (" Schnurri ");
        Katze k = new Katze (" Garfield ");
        System . out . println ((( Katze )h). miezmiez ());
        k = h;
        System . out . println ((( Hauskatze )k). miezmiez ());
    }
}
