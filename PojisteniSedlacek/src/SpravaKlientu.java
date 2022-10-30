import java.util.HashSet;
import java.util.Scanner;

public class SpravaKlientu {

    // scanner pro vkládání záznamů o pojištěných
Scanner sc = new Scanner(System.in);

    HashSet<PojistenyKlient> klienti = new HashSet<>();

/* příkaz pro chod programu
* 1 přidat nového pojištěného
* 2 vypsat všechny pojištěné
* 3 vyhledat pojištěného
* 4 konec programu
* ošetřit správnost zadání
 */
private int prikaz;

// kolekce typu množina - drží seznam klientů

    public SpravaKlientu () {


    }


// základní chod programu - výběr dalších kroků
public void program() {
    do {
        vytiskniMenu();
        try {
            prikaz = Integer.parseInt(sc.nextLine());
        }
        catch (Exception e) {
            System.out.println("Neplatná hodnota! Zadej znovu.");
        }
        if (prikaz >= 1 && prikaz <= 4) {
            switch (prikaz) {
                case 1:
                    // kod
                    zadejJmenoKlienta();
                    String jmenoNove = sc.nextLine();
                    zadejPrijmeniKlienta();
                    String prijmeniNove = sc.nextLine();
                    zadejVekKlienta();
                    int vekNovy = Integer.parseInt(sc.nextLine());
                    zadejTelefonKlienta();
                    int telefonNovy = Integer.parseInt(sc.nextLine());

                    klienti.add(new PojistenyKlient(jmenoNove, prijmeniNove, vekNovy, telefonNovy));
                    procesDokoncen();
                    break;
                case 2:
                    //kod
                    klienti.forEach((pojisteny) -> {
                        System.out.println(pojisteny);
                        System.out.println(".......................................");
                    });
                    procesDokoncen();
                    break;
                case 3:
                    // kod
                    zadejJmenoKlienta();
                    String jmeno = sc.nextLine();
                    zadejPrijmeniKlienta();
                    String prijmeni = sc.nextLine();
                    System.out.println("");
                    klienti.forEach((pojisteny) -> {
                        if (jmeno.equals(pojisteny.getJmeno()) && prijmeni.equals(pojisteny.getPrijmeni())) {
                            System.out.println(pojisteny);
                        }
                    });
                    System.out.println("");
                    break;

            }
        }
        else {
            System.out.println("Neznámý příkaz! Zadej znovu.");
        }
        }
        while (prikaz != 4) ;


}

// základní menu pro uživatele
private void vytiskniMenu() {
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("Evidence pojištěných");
    System.out.println("----------------------------------------");
    System.out.println("");
    System.out.println("Vyberte si akci:");
    System.out.println("1 - Přidat nového pojištěného");
    System.out.println("2 - Vypsat všechny pojištěné");
    System.out.println("3 - Vyhledat pojištěného");
    System.out.println("4 - Konec");
    System.out.println("");

}
// pokyn pro zadání jména při zápisu nového klienta nebo vyhledání klienta
private void zadejJmenoKlienta() {
    System.out.println("Zadejte jméno pojištěného");
}
// pokyn pro zadání příjmení při zápisu nového klienta nebo vyhledání klienta
private void zadejPrijmeniKlienta() {
    System.out.println("Zadejte příjmení pojištěného");
}
// pokyn pro zadání věku (prozatím jako int?) při zápisu nového klienta
private void zadejVekKlienta() {
    System.out.println("Zadejte věk pojištěného");
}

// pokyn pro zadání telefonního čísla při zápisu nového klienta
private void zadejTelefonKlienta() {
    System.out.println("Zadejte telefonní číslo pojištěného");
}

//Text uzavírající vykonání příkazu.
private void procesDokoncen() {
    System.out.println("");
    System.out.println("Proces byl úspěšně dokončen.");

    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");
    System.out.println("");
}

}
