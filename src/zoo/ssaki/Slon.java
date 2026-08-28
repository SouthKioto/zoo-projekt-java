package zoo.ssaki;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Slon */
public class Slon extends Ssak {
  private int dlugoscTraby;

  Slon(String imie, int wiek, String kolorSiersci, int dlugoscTraby) {
    super(imie, wiek, kolorSiersci);
    this.dlugoscTraby = dlugoscTraby;
  }

  public String wydajDzwiek() {
    energia -= 5;
    return "Tuuuuuuuuu!!";
  }

  public void pielegnuj() {
    System.out.println("Pielegnacja " + imie);
  }

  public void jedz(Pokarm pokarm) {
    if (pokarm.getTypPokarmu() != TypPokarmu.OWOCE
        || pokarm.getTypPokarmu() != TypPokarmu.ROSLINY) {
      System.out.println("Slon nie zje takiego pokarmu");
      return;
    } else {
      glod += pokarm.getWartoscOdzywcza();
      System.out.println("Slon je");
    }
  }
}
