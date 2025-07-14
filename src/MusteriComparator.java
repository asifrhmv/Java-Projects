import java.util.Comparator;
import java.util.PriorityQueue;

public class MusteriComparator implements Comparator<Musteri>{

    public int compare(Musteri m1,Musteri m2){
      return Integer.compare(m2.prioritet,m1.prioritet);




    }
}
