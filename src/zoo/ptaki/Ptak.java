/** Ptak */
public abstract class Ptak extends Zwierze {
  private int rozpietoscSkrzydel;

  public Ptak(Stirng imie, int wiek, int rozpietoscSkrzydel) {
    super(imie, wiek);
    this.rozpietoscSkrzydel = rozpietoscSkrzydel;
  }

  public abstract void machajSkrzydlami();
}
