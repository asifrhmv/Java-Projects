public class Musteri {
    private String ad;
   public int prioritet;

    Musteri(String ad,int prioritet){
        this.ad=ad;
        this.prioritet=prioritet;
    }

  public String toString(){
        return ad+"(prioritet "+prioritet+")";
  }

}
