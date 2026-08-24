/** Pokarm */
public class Pokarm {

  private String nazwa;
  private TypPokarmu typPokarmu;
  private double wartoscOdzywcza;

  public Pokarm(String nazwa, TypPokarmu typ, double wartoscOdzywcza) {
    this.nazwa = nazwa;
    this.typPokarmu = typ;
    this.wartoscOdzywcza = wartoscOdzywcza;
  }

  // INFO: gettery
  public String getNazwa() {
    return this.nazwa;
  }

  public TypPokarmu getTypPokarmu() {
    return this.typPokarmu;
  }

  public double getWartoscOdzywcza() {
    return this.wartoscOdzywcza;
  }
}
