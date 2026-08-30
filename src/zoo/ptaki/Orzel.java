package zoo.ptaki;

import zoo.Pokarm;
import zoo.TypPokarmu;

/** Orzel */
public class Orzel extends Ptak implements ILatajacy {
  private double maxWysokoscLotu;

  public Orzel(String imie, int wiek, int rozpietoscSkrzydel, double maxWysokoscLotu) {
    super(imie, wiek, rozpietoscSkrzydel);
    this.maxWysokoscLotu = maxWysokoscLotu;
  }

  public String wydajDzwiek() {
    energia -= 5;
    return "Kijii-kijii!!!";
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

  public void lataj() {
    System.out.println(imie + " lata");
  }

  public double getMaksWysokoscLotu() {
    return this.maxWysokoscLotu;
  }
}
