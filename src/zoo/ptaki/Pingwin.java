package zoo.ptaki;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Pingwin */
public class Pingwin extends Ptak {
  private double predkoscPlywania;

  public Pingwin(String imie, int wiek, int rozpietoscSkrzydel, double predkoscPlywania) {
    super(imie, wiek, rozpietoscSkrzydel);
    this.predkoscPlywania = predkoscPlywania;
  }

  public String wydajDzwiek() {
    energia -= 5;
    return "Kua-kua!!!";
  }

  public void pielegnuj() {
    System.out.println("Pielegnacja " + imie);
  }

  public void jedz(Pokarm pokarm) {
    if (pokarm.getTypPokarmu() != TypPokarmu.MIESO) {
      System.out.println("Orzel nie zje takiego pokarmu");
      return;
    } else {
      glod += pokarm.getWartoscOdzywcza();
      System.out.println("Orzel je");
    }
  }

  public void machajSkrzydlami() {
    System.out.println(imie + " macha skrzydlami");
  }

  public double getPredkoscPlywania() {
    return this.predkoscPlywania;
  }
}
