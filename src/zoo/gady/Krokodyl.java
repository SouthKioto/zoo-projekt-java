package zoo.gady;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Krokodyl */
public class Krokodyl extends Gad {
  private double silaUkasu;

  public Krokodyl(String imie, int wiek, boolean jadowity, double silaUkasu) {
    super(imie, wiek, jadowity);
    this.silaUkasu = silaUkasu;
  }

  public void jedz(Pokarm pokarm) {
    if (pokarm.getTypPokarmu() != TypPokarmu.MIESO) {
      System.out.println("Krokodyl nie zje takiego pokarmu");
      return;
    } else {
      glod += pokarm.getWartoscOdzywcza();
      System.out.println("Krokodyl je");
    }
  }

  public String wydajDzwiek() {
    energia -= 5;
    return "Rrrr!!!";
  }

  public double getSilaUkasu() {
    return this.silaUkasu;
  }

  public void zanurzSie() {
    System.out.println("Krokodyl zanurza sie");
  }
}
