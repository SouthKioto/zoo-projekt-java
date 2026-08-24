/** Gad */
public abstract class Gad extends Zwierze {
  private boolean jadowity;

  public Gad(String imie, int wiek, boolean jadowity) {
    super(imie, wiek);
    this.jadowity = jadowity;
  }

  public abstract void wygrzewajSie();
}
