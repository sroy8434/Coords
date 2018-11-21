public class Test
{
    public static void main(String[] args)
    {
        Coords point1 = new Coords(1, 8);
        Coords point2 = new Coords(3);
        Coords point3 = new Coords();
        Coords point4 = new Coords(point1);
        Coords point5 = point1;



        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(point4);
        System.out.println(point5);
    }
}
