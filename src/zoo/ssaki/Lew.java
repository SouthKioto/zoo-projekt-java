package zoo.ssaki;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Lew */
public class Lew extends Ssak {
  private int sila;

  Lew(String imie, int wiek, String kolorSiersci, int sila) {
    super(imie, wiek, kolorSiersci);
    this.sila = sila;
  }

  public String wydajDzwiek() {
    energia -= 5;
    return "Roar!!";
  }

  public void pielegnuj() {
    System.out.println("Pielegnacja " + imie);
  }

  public void jedz(Pokarm pokarm) {
    if (pokarm.getTypPokarmu() != TypPokarmu.MIESO) {
      System.out.println("Lew nie zje takiego pokarmu");
      return;
    } else {
      glod += pokarm.getWartoscOdzywcza();
      System.out.println("Lew je");
    }
  }
}
