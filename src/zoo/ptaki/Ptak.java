package zoo.ptaki;

import zoo.Zwierze;

/** Ptak */
public abstract class Ptak extends Zwierze {
  private int rozpietoscSkrzydel;

  public Ptak(String imie, int wiek, int rozpietoscSkrzydel) {
    super(imie, wiek);
    this.rozpietoscSkrzydel = rozpietoscSkrzydel;
  }

  public abstract void machajSkrzydlami();
}
