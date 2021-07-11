import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Persoana p1 =  new Persoana("Ion","Ionescu", "6000123");
        Persoana p2 =  new Persoana("Ion","Popescu", "6090123");
        Persoana p3 =  new Persoana("Maria","Mihaiescu", "6270123");
        Persoana p4 =  new Persoana("Ana","Ionescu", "6010123");
        Persoana p5 = new Persoana("Ioana", "Popescu", "2487145845");
        Persoana p6 = new Persoana("Andrei", "Mihai", "24237145845");
        Persoana p7 = new Persoana("Catalin", "Stan", "2425875845");
        Persoana p8 = new Persoana("Andreea", "Pop", "242371236845");
        Persoana p9 = new Persoana("Mihaela", "Andrei", "2423714111");
        Persoana p10 = new Persoana("Mirel", "Mare", "242371452225");
        Persoana p11 = new Persoana("Mirela", "Mare", "2421111452225");

        Adresa adr1 = new Adresa ("Strada 9", 1);
        Adresa adr2 = new Adresa ("Strada 12", 2);
        Adresa adr3 = new Adresa ("Strada 11", 3);
        Adresa adr4 = new Adresa ("Strada 10", 5);
        Adresa adr5 = new Adresa ("Strada 10", 4);

        p1.setAdresa(adr1);
        p2.setAdresa(adr1);
        p3.setAdresa(adr1);
        p4.setAdresa(adr2);
        p5.setAdresa(adr2);
        p6.setAdresa(adr3);
        p7.setAdresa(adr3);
        p8.setAdresa(adr3);
        p9.setAdresa(adr3);
        p10.setAdresa(adr4);
        p11.setAdresa(adr5);

        Map<Adresa, Integer> map = new HashMap<Adresa, Integer>();
        List<Persoana> persoane = new ArrayList<Persoana>();

        persoane.add(p1);
        persoane.add(p2);
        persoane.add(p3);
        persoane.add(p4);
        persoane.add(p5);
        persoane.add(p6);
        persoane.add(p7);
        persoane.add(p8);
        persoane.add(p9);
        persoane.add(p10);
        persoane.add(p11);

        for (Persoana persoana : persoane) {
            map.put(persoana.getAdresa(), map.containsKey(persoana.getAdresa()) ? map.get(persoana.getAdresa()) + 1 : 1);
        }
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op <5) {
            System.out.println("");
            System.out.println("1 -> Informatii persoane");
            System.out.println("2 -> Adresa la care stau cele mai multe persoane");
            System.out.println("3 -> Numarul adreselor la care stau mai mult de o persoana");
            System.out.println("4 -> Numarul adreselor la care stau persoanele cu nume dat");
            System.out.println("5 -> Iesire");
            System.out.println("Alegeti o optiune:");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    for (Persoana element : persoane)
                        System.out.println(element);
                    break;
                case 2:
                    adresa_la_care_stau_cele_mai_multe_persoane(map);
                    break;
                case 3:
                    System.out.println("Numarul adreselor la care sta mai mult de o persoana este  " + numarul_adreselor_la_care_sta_mai_mult_de_o_persoana(map));
                    break;
                case 4:
                    numarul_adreselor_la_care_locuiesc_persoane_cu_un_nume_dat(persoane);
                    break;


            }
        }

    }

    public static void adresa_la_care_stau_cele_mai_multe_persoane(Map<Adresa, Integer> map){
        int max=0;
        Adresa adresa = null;

        for (Map.Entry<Adresa, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                adresa = entry.getKey();
            }
        }
        System.out.println("Adresa la care stau cele mai multe persoane este " + adresa.toString());
    }

    public static int numarul_adreselor_la_care_sta_mai_mult_de_o_persoana(Map<Adresa, Integer> map){
        int nrAdrese = 0;
        for (Map.Entry<Adresa, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                nrAdrese++;
        }
        return nrAdrese;
    }

    public static void numarul_adreselor_la_care_locuiesc_persoane_cu_un_nume_dat(List<Persoana> persoane){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numele persoanei");
        String nume = sc.nextLine();
        int nrAdrese = 0;

        for (Persoana persoana : persoane)
            if (persoana.getNume().equals(nume) || persoana.getPrenume().equals(nume))
                nrAdrese++;

        System.out.println("Numarul adreselor la care locuiesc persoane cu un nume dat " + nume + " este " + nrAdrese);
    }
}
