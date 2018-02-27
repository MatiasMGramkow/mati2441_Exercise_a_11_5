import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> liste = new LinkedList<>();
        liste.add(7);
        liste.add(4);
        liste.add(-9);
        liste.add(4);
        liste.add(15);
        liste.add(8);
        liste.add(27);
        liste.add(7);
        liste.add(11);
        liste.add(-5);
        liste.add(32);
        liste.add(-9);
        liste.add(-9);

        mainDuplicate(liste);
        System.out.println(mainDuplicate(liste));
    }

    public static Set mainDuplicate(List<Integer> s)
    {
        return new TreeSet<>(s);
    }
}
