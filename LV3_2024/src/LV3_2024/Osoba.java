package LV3_2024;

public class Osoba {
	String ime;
	String prezime;
	String oib;
	String adresa;
	String datum;
	 // prvi konstruktor
	public Osoba() {
	ime = "";
	prezime = "";
	oib = "";
	adresa = "";
	datum = "";
	}
	 // drugi konstruktor
	public Osoba(String i, String p, String o, String a, String d) {
	ime = i;
	prezime = p;
	oib = o;
	adresa = a;
	datum = d;
	}
	public static void main(String[] args) {
	 // kreiramo objekt o1 klase Osoba:
	Osoba o1 = new Osoba();
	// ispis imena, prezimena i OIB-a objekta o1, to su prazni stringovi zbog poziva konstruktora bez argumenata:
	System.out.println("Ime: " + o1.ime);
	System.out.println("Prezime: " + o1.prezime);
	System.out.println("OIB: " + o1.oib);
	System.out.println("Adresa: " + o1.adresa);
	System.out.println("Datum: " + o1.datum);
	System.out.println("-----------------");
	o1.ime = "Marko"; // definiramo ime objekta o1
	o1.prezime = "Maric"; // definiramo prezime objekta o1
	o1.oib = "01234567891"; // definiramo OIB objekta o1
	o1.adresa = "Adresa Test 11";
	o1.datum = "01.01.2001.";
	System.out.println("Ime: " + o1.ime);
	System.out.println("Prezime: " + o1.prezime);
	System.out.println("OIB: " + o1.oib);
	System.out.println("Adresa: " + o1.adresa);
	System.out.println("Datum: " + o1.datum);
	System.out.println("-----------------");
	 // kreiramo objekt o2 klase Osoba pozivom drugog konstruktora:
	Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100", "Adresa Test 22", "02.02.2001.");
	System.out.println("Ime: " + o2.ime);
	System.out.println("Prezime: " + o2.prezime);
	System.out.println("OIB: " + o2.oib);
	System.out.println("Adresa: " + o2.adresa);
	System.out.println("Datum: " + o2.datum);
	
	}
	public boolean isInteger(String number) {
		return Double.valueOf(number)% 1 == 0;
	}
	public boolean ProvjeraDatuma() throws Exception {
		try {
			String[] splitDatum = datum.split(".");
			String Dan = splitDatum[0];
			String Mjesec = splitDatum[1];
			String Godina = splitDatum[2];
			
			if(!isInteger(Dan) && !isInteger(Mjesec) && !isInteger(Godina))
			{
				throw new Exception("Netocan unos");
			}
			if(Integer.valueOf(Dan) < 1 || Integer.valueOf(Dan) > 31)
			{
				throw new Exception("Netocan unos");
			}
			if(Integer.valueOf(Mjesec) < 1 || Integer.valueOf(Mjesec) > 12)
			{
				throw new Exception("Netocan unos");
			}
			if(Integer.valueOf(Godina) < 1900)
			{
				throw new Exception("Netocan unos");
			}
			System.out.print("Datum je ispravan");
			return true;
		}
	}

}
