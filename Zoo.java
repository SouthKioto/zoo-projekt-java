import java.util.ArrayList;
import zoo.Zwierze;

/** Zoo */
public abstract class Zoo {
  private String nazwa;
  private ArrayList<Zwierze> zwierzeta;

  public void dodajZwierze(Zwierze z) {
    zwierzeta.add(z);
  }

  public void usunZwierze(Zwierze z) {
    zwierzeta.remove(z);
  }

  public void przeprowadzKarmienie() {
    for (Zwierze zwierze : zwierzeta) {
      // zwierze.jedz();
    }
  }

  public void raportDzienny() {}

  /*
   * public ArrayList<Zwierze> getGlodneZwierzeta() {
   * ArrayList<Zwierze> glodneZwierzeta;
   *
   * return glodneZwierzeta;
   *
   * }
   */
}
