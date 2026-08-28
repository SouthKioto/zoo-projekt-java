import java.util.ArrayList;

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
      zwierze.jedz(pokarm);
    }
  }
}
