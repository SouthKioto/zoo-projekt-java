package zoo.ptaki;

import zoo.Pokarm

/** Orzel */
public class Orzel extends Ptak {
  private double maxWysokoscLotu;

  public Orzel(String imie, int wiek, int rozpietoscSkrzydel, double maxWysokoscLotu) {
    super(imie, wiek, rozpietoscSkrzydel);
    this.maxWysokoscLotu = maxWysokoscLotu;
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
