package zoo.gady;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Waz */
public class Waz extends Gad {
  private double dlugosc;

  public Waz(String imie, int wiek, boolean jadowity, double dlugosc) {
    super(imie, wiek, jadowity);
    this.dlugosc = dlugosc;
  }

  public void jedz(Pokarm pokarm) {
    if (pokarm.getTypPokarmu() != TypPokarmu.MIESO) {
      System.out.println("Waz nie zje takiego pokarmu");
      return;
    } else {
      glod += pokarm.getWartoscOdzywcza();
      System.out.println("Waz je");
    }
  }

  public String wydajDzwiek() {
    energia -= 5;
    return "Ssssss!!!";
  }

  public double getDlugosc() {
    return dlugosc;
  }

  public void zrzucSkore() {
    System.out.println("Waz zrzuca skore");
  }
}
