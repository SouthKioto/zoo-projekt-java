package zoo.ssaki;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Malpa */
public class Malpa extends Ssak {
  private int poziomZwinnosci;

  public Malpa(String imie, int wiek, String kolorSiersci, int poziomZwinnosci) {
    super(imie, wiek, kolorSiersci);
    this.poziomZwinnosci = poziomZwinnosci;
  }

  public String wydajDzwiek() {
    energia -= 5;
    return "HIHI HAHA!!";
  }

  public void pielegnuj() {
    System.out.println("Pielegnacja " + imie);
  }

  public void jedz(Pokarm pokarm) {
    if (pokarm.getTypPokarmu() != TypPokarmu.OWOCE
        || pokarm.getTypPokarmu() != TypPokarmu.ROSLINY) {
      System.out.println("Malpa nie zje takiego pokarmu");
      return;
    } else {
      glod += pokarm.getWartoscOdzywcza();
      System.out.println("Malpa je");
    }
  }
}
