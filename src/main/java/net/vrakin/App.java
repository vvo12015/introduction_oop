package net.vrakin;

/**
 * Introduction OOP
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product p = new Product();
        p.setId(1);
        p.setName("Pencil Box");
        p.setPrice(10.0f);
        p.setWeight(100);
        p.setDescription("Pink");

        System.out.println(p);

        Product p2 = new Product(2, "Pen", 2.0f, 10, "blue, parker");

        System.out.println(p2);

        Triangle t = new Triangle();
        t.setA(3d);
        t.setB(4d);
        t.setC(5d);

        System.out.println(t.getAreaTriangle());
    }
}
