package conversione;

public class Convertitore {

	public String converti(String numeroRomano) {

		char[] cifreNumeroRomano = numeroRomano.toCharArray();
		return String.valueOf(calcolaNumeroRomano(cifreNumeroRomano));
	}

	private int calcolaNumeroRomano(char[] cifre) {

		int summa = 0;
		int i = 0;
		for (; i < cifre.length - 1; i += 2) {

			int valoreCifra = convertiCifra(cifre[i]);
			int valoreCifraSuccessiva = convertiCifra(cifre[i + 1]);

			if (valoreCifra < valoreCifraSuccessiva) {
				summa += valoreCifraSuccessiva - valoreCifra;
			} else {
				summa += valoreCifra + valoreCifraSuccessiva;
			}
		}
		/* se necessario converti l'ultima cifra */
		if (i < cifre.length) {
			summa += convertiCifra(cifre[cifre.length - 1]);
		}
		return summa;
	}

	private int convertiCifra(char cifra) {

		if (cifra == 'M' || cifra == 'm') {
			return 1000;
		} else if (cifra == 'C' || cifra == 'c') {
			return 100;
		} else if (cifra == 'L' || cifra == 'l') {
			return 50;
		} else if (cifra == 'X' || cifra == 'x') {
			return 10;
		} else if (cifra == 'V' || cifra == 'v') {
			return 5;
		} else {
			return 1;
		}
	}
}