package conversione;

public class Convertitore {

	public String converti(String numeroRomano) {

		char[] cifreNumeroRomano = numeroRomano.toUpperCase().toCharArray();
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

		if (cifra == 'M') {
			return 1000;
		} else if (cifra == 'C') {
			return 100;
		} else if (cifra == 'L') {
			return 50;
		} else if (cifra == 'X') {
			return 10;
		} else if (cifra == 'V') {
			return 5;
		} else if (cifra == 'I') {
			return 1;
		} else {
			throw new IllegalArgumentException("'" + cifra
					+ "' non è un numero romano");
		}
	}
}