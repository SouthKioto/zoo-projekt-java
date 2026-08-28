package zoo.ssaki;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Lew */
public class Lew extends Ssak {
  private int sila;
  private TypPokarmu typPokarmu;

  Lew(String imie, int wiek, String kolorSiersci, int sila) {
    super(imie, wiek, kolorSiersci);
    this.sila = sila;
  }

  public String wydajDzwiek() {
    return "Roar!!";
  }

  public void pielegnuj() {
    System.out.println("Pielegnacja ");
  }

  public void jedz(Pokarm pokarm) {}
}
