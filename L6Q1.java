/*Create a base class “Game” with method called “type” that prints “indoor & outdoor games”.
Create a subclass cricket with a method called “type” that prints “cricket is an outdoor game”.
Create one more subclass of “Game” called “chess” with a method “type” that prints “chess is an indoor game”.
Write a complete Java program for the above to understand the Dynamic method dispatch concept.*/

class Game{
    void type(){
        System.out.println("Indoor and Outdoor games.");
    }
}
class cricket extends Game{
    void type(){
        System.out.println("Cricket is an Outdoor game.");
    }
}
class chess extends Game{
    void type(){
        System.out.println("Chess is an Indoor game.");
    }
}

public class L6Q1 {
    public static void main(String[] args){
        Game g=new Game();
        cricket c=new cricket();
        chess ch=new chess();
        Game r;
        r=g;
        r.type();
        r=c;
        r.type();
        r=ch;
        r.type();
    }
}
