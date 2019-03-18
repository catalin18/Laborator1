import java.lang.reflect.Method;
import java.util.*;

public class Laborator1 {
    public static void main(String[] args)
    {
        Book carte = new Book(25);

        System.out.println("Price " + carte.getPrice());

        //displayMethods(carte);

        Cat myCat = new Cat();
        Animal myAnimal = new Animal();
        myAnimal.instanceMethod();
        myCat.classMethod();
    }

    public static void displayMethods(Book carte)
    {
        Class c = carte.getClass();
        Method[] allMethods = c.getMethods();
        for(Method m:allMethods)
        {
            System.out.println(m);
        }
    }
}
