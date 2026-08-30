package zoo;

/** Zwierze */
public abstract class Zwierze implements IKarmiony, IWydajacyDzwiek {

  protected String imie;
  protected int wiek;
  protected double energia;
  protected double glod;

  public Zwierze(String imie, int wiek) {
    this.imie = imie;
    this.wiek = wiek;
    this.energia = (Math.random() * 101);
    this.glod = (Math.random() * 101);
  }

  public abstract void jedz(Pokarm pokarm);

  public abstract String wydajDzwiek();

  public void spij() {
    System.out.println(this.imie + " spi");
    this.energia += 10;
  }

  public void obudzSie() {
    System.out.println(this.imie + " obudzil sie");
    this.energia -= 5;
  }

  public boolean czyGlodny() {
    if (glod <= 50) {
      return true;
    }

    return false;
  }

  public String getImie() {
    return this.imie;
  }

  public int getWiek() {
    return this.wiek;
  }
}
