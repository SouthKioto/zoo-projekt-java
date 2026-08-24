/** Ssak */
public abstract class Ssak extends Zwierze {

  private String kolorSiersci;

  public Ssak(String imie, int wiek, String kolorSiersci) {
    super(imie, wiek);
    this.kolorSiersci = kolorSiersci;
  }

  public abstract void pielegnuj();
}
