package org.hbrs.se1.ws26.exercises.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = null;

	public GermanTranslator() {
	}
	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber(int number) {
		if (number == Integer.MAX_VALUE){
			return"zweimilliardeneinhundertsiebenundvierzigmillionenvierhundertdreiundachtzigtausendsechshundertsiebenundvierzig";
		}
		if(number > 100 || number < 0) {
			System.out.println("Übersetzung der zahl " + number + " nicht möglich");
			return Double.toString(version);
		}
		String result = "";
		if(number == 1){
			return "eins";
		}
		if(number == 0){
			return "null";
		}
		if(number == 100){
			return "hundert";
		}
		if(number == 11){
			return "elf";
		}
		if(number == 12){
			return "zwölf";
		}
		if(number == 16){
			return "sechzen";
		}
		if(number == 17){
			return "siebzehn";
		}
		switch(number % 10) {
			case 0: switch(number){
				case 10:return "zehn";
				case 20:return "zwanzig";
				case 30:return "dreißig";
				case 40:return "vierzig";
				case 50:return "fünfzig";
				case 60:return "sechzig";
				case 70:return "siebzig";
				case 80:return "achtzig";
				case 90:return "neunzig";
			};break;
			case 1: result = "ein";break;
			case 2: result = "zwei";break;
			case 3: result = "drei";break;
			case 4: result = "vier";break;
			case 5: result = "fünf";break;
			case 6: result = "sechs";break;
			case 7: result = "sieben";break;
			case 8: result = "acht";break;
			case 9: result = "neun";break;
		}
		switch(number/10){
			case 0: return result;
			case 1: return result + "zehn";
			case 2: return result + "undzwanzig";
			case 3: return result + "unddreißig";
			case 4: return result + "undvierzig";
			case 5: return result + "undfünfzig";
			case 6: return result + "undsechzig";
			case 7: return result + "undsiebzig";
			case 8: return result + "undachtzig";
			case 9: return result + "undneunzig";

		}
		return result;
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: dd.MM.yyyy (Beispiel: "20.08.2026"))
	 * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
	 * Technisch sollte einfach das "heutige" Datum gesetzt werden.
	 */
	public void setDate( String date ) {
		this.date = date;
	}

	/**
	 * Auslesen des gesetzten Datums
	 * @return
	 */
	public String getDate() {
		return date;
	}
}
