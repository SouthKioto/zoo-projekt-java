package zoo.gady;

import zoo.Pokarm;
import zoo.Zwierze;

/** Gad */
public abstract class Gad extends Zwierze {
  private boolean jadowity;

  public Gad(String imie, int wiek, boolean jadowity) {
    super(imie, wiek);
    this.jadowity = jadowity;
  }

  public abstract void jedz(Pokarm pokarm);

  public void wygrzewajSie() {
    System.out.println(imie + " wygrzewa sie");
  }
}
