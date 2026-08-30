import java.util.ArrayList;
import java.util.Scanner;
import zoo.Pokarm;
import zoo.TypPokarmu;
import zoo.Zwierze;
import zoo.gady.*;
import zoo.ptaki.*;
import zoo.ssaki.*;

/** Zoo */
public class Zoo {
  private String nazwa;
  private ArrayList<Zwierze> zwierzeta = new ArrayList<>();

  public Zoo(String nazwa) {
    this.nazwa = nazwa;
  }

  {
    zwierzeta.add(new Krokodyl("Jakub", 20, false, 30));
    zwierzeta.add(new Lew("Jakub", 20, "kremowy", 100));
    zwierzeta.add(new Pingwin("Patrycja", 10, 20, 30.00));
    zwierzeta.add(new Malpa("Krzysiek", 20, "brazowy", 2));
    zwierzeta.add(new Slon("Jakub", 50, "szary", 5));
    zwierzeta.add(new Orzel("Beatka", 10, 22, 200));
  }

  private ArrayList<Pokarm> dostepnyPokarm = new ArrayList<Pokarm>();

  {
    dostepnyPokarm.add(new Pokarm("Miesko", TypPokarmu.MIESO, 50));
    dostepnyPokarm.add(new Pokarm("Rosliny", TypPokarmu.ROSLINY, 10));
    dostepnyPokarm.add(new Pokarm("Owoce", TypPokarmu.OWOCE, 25));
    dostepnyPokarm.add(new Pokarm("Ryby", TypPokarmu.RYBY, 15));
    dostepnyPokarm.add(new Pokarm("Owady", TypPokarmu.OWADY, 5));
  }

  private void zakoncz() {
    System.out.println("Zakanczam program");
    System.exit(0);
  }

  private void uiInit() {
    String actions =
        "\n1. Dodaj zwierze\n"
            + "2. Usun zwierze\n"
            + "3. Nakarm zwierzeta\n"
            + "4. Generuj raport.\n"
            + "5. Lista wszystkich zwierzat.\n"
            + "6. Wyjdz\n";
    System.out.println("Witaj w zoo " + nazwa + " prosze wybierz akcje: " + actions);
  }

  private void dodajZwierze() {
    System.out.println("Podaj imie zwierzatka: ");
    Scanner in = new Scanner(System.in);
    String imie = in.nextLine();

    System.out.println("Podaj wiek zwierzatka: ");
    in = new Scanner(System.in);
    int wiek = in.nextInt();

    System.out.println(
        "Dostepne zwierzeta: Lew, malpa, slon, pingwin, orzel, waz, krokodyl. Wpisz rodzaj: ");

    in = new Scanner(System.in);
    String wybor = in.nextLine().toLowerCase();

    Zwierze noweZwierze;
    switch (wybor) {
      case "lew":
        {
          System.out.println("Podaj kolor siersci zwierzatka: ");
          in = new Scanner(System.in);
          String kolorSiersci = in.nextLine();

          System.out.println("Podaj sile zwierzatka: ");
          in = new Scanner(System.in);
          int sila = in.nextInt();

          noweZwierze = new Lew(imie, wiek, kolorSiersci, sila);
          zwierzeta.add(noweZwierze);
          break;
        }
      case "malpa":
        {
          System.out.println("Podaj kolor siersci zwierzatka: ");
          in = new Scanner(System.in);
          String kolorSiersci = in.nextLine();

          System.out.println("Podaj zwinnosc zwierzatka: ");
          in = new Scanner(System.in);
          int zwinnosc = in.nextInt();

          noweZwierze = new Malpa(imie, wiek, kolorSiersci, zwinnosc);
          zwierzeta.add(noweZwierze);
          break;
        }
      case "slon":
        {
          System.out.println("Podaj kolor siersci zwierzatka: ");
          in = new Scanner(System.in);
          String kolorSiersci = in.nextLine();

          System.out.println("Podaj dlugosc traby zwierzatka: ");
          in = new Scanner(System.in);
          int dlugoscTraby = in.nextInt();

          noweZwierze = new Slon(imie, wiek, kolorSiersci, dlugoscTraby);
          zwierzeta.add(noweZwierze);
          break;
        }
      case "pingwin":
        {
          System.out.println("Podaj rozpietosc skrzydel zwierzatka: ");
          in = new Scanner(System.in);
          int rozpietoscSkrzydel = in.nextInt();

          System.out.println("Podaj predkosc plywania zwierzatka: ");
          in = new Scanner(System.in);
          double predkoscPlywania = in.nextInt();

          noweZwierze = new Pingwin(imie, wiek, rozpietoscSkrzydel, predkoscPlywania);
          zwierzeta.add(noweZwierze);
          break;
        }
      case "orzel":
        {
          System.out.println("Podaj rozpietosc skrzydel zwierzatka: ");
          in = new Scanner(System.in);
          int rozpietoscSkrzydel = in.nextInt();

          System.out.println("Podaj maksymalna wysokosc lotu zwierzatka: ");
          in = new Scanner(System.in);
          double maxWysokosc = in.nextInt();

          noweZwierze = new Orzel(imie, wiek, rozpietoscSkrzydel, maxWysokosc);
          zwierzeta.add(noweZwierze);
          break;
        }
      case "waz":
        {
          boolean czyJadowity;
          System.out.println("Czy waz jest jadowity (tak/nie): ");
          in = new Scanner(System.in);
          String jadowityString = in.nextLine();
          czyJadowity = jadowityString.equalsIgnoreCase("tak");

          System.out.println("Podaj dlugosc zwierzatka: ");
          in = new Scanner(System.in);
          double dlugosc = in.nextDouble();

          noweZwierze = new Waz(imie, wiek, czyJadowity, dlugosc);
          zwierzeta.add(noweZwierze);
          break;
        }
      case "krokodyl":
        {
          boolean czyJadowity;
          System.out.println("Czy krokodyl jest jadowity (tak/nie): ");
          in = new Scanner(System.in);
          String jadowityString = in.nextLine();
          czyJadowity = jadowityString.equalsIgnoreCase("tak");

          System.out.println("Podaj sile ukasu zwierzatka: ");
          in = new Scanner(System.in);
          double silaUkasu = in.nextDouble();

          noweZwierze = new Krokodyl(imie, wiek, czyJadowity, silaUkasu);
          zwierzeta.add(noweZwierze);
          break;
        }
      default:
        System.out.println("Nieznane zwierze");
        break;
    }
  }

  private void zooActions(int action) {
    switch (action) {
      case 1:
        dodajZwierze();
        break;
      case 2:
        usunZwierze();
        break;

      case 3:
        przeprowadzKarmienie();
        break;

      case 4:
        raportDzienny(getGlodneZwierzeta());
        break;

      case 5:
        zwierzetaWZoo();
        break;

      case 6:
        zakoncz();
        break;

      default:
        System.out.println("Nieznana akcja");
        break;
    }
  }

  private void usunZwierze() {
    System.out.println("Podaj imie zwierzecia do usuniecia: ");
    Scanner in = new Scanner(System.in);
    String imie = in.nextLine();

    Zwierze doUsuniecia = null;
    for (Zwierze zwierze : zwierzeta) {
      if (zwierze.getImie().equals(imie)) {
        doUsuniecia = zwierze;
        break;
      }
    }

    if (doUsuniecia != null) {
      zwierzeta.remove(doUsuniecia);
      System.out.println("Usunieto zwierze: " + imie);
    } else {
      System.out.println("Nie znaleziono zwierzecia o imieniu: " + imie);
    }
  }

  private void przeprowadzKarmienie() {
    for (Zwierze zwierze : zwierzeta) {
      for (Pokarm pokarm : dostepnyPokarm) {
        zwierze.jedz(pokarm);
      }
    }
  }

  private ArrayList<Zwierze> getGlodneZwierzeta() {
    ArrayList<Zwierze> glodneZwierzeta = new ArrayList<Zwierze>();
    for (Zwierze zwierze : zwierzeta) {
      if (zwierze.czyGlodny()) {
        glodneZwierzeta.add(zwierze);
      }
    }

    return glodneZwierzeta;
  }

  private void raportDzienny(ArrayList<Zwierze> glodneZwierzeta) {
    int countGlodne = glodneZwierzeta.size();
    String message = "Na dzien dzisiejszy mamy " + countGlodne + " zwierze(-ta) sa to: \n";

    String listaZwierzat = "[\n";
    int counter = 0;
    for (Zwierze zwierze : glodneZwierzeta) {
      counter++;
      listaZwierzat += counter + ". " + zwierze.getImie() + "\n";
    }
    listaZwierzat += "]\n";

    System.out.println(message);
    System.out.println(listaZwierzat);
  }

  private void zwierzetaWZoo() {
    String listaZwierzat = "";
    int counter = 1;
    for (Zwierze zwierze : zwierzeta) {
      counter++;
      listaZwierzat += counter + ". " + zwierze.getImie() + "\n";
    }
    System.out.println(listaZwierzat);
  }

  public void welcomeMessage() {
    while (true) {
      uiInit();
      Scanner in = new Scanner(System.in);
      int wybor = in.nextInt();
      zooActions(wybor);
    }
  }
}
