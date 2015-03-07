public class Convertitore {

	public String converti(String numeroRomano) {

		int summa = 0;

		String[] split = numeroRomano.split("");

		int i = 1;
		while (i < split.length - 1) {

			int valoreCifra = convertiCifra(split[i].toUpperCase());
			int valoreCifraSuccessiva = convertiCifra(split[i + 1]
					.toUpperCase());

			if (valoreCifra < valoreCifraSuccessiva) {
				summa += valoreCifraSuccessiva - valoreCifra;
			} else {
				summa += valoreCifra + valoreCifraSuccessiva;
			}
			i += 2;
		}
		/* se necessario converti l'ultima cifra */
		if (i < split.length) {
			summa += convertiCifra(split[split.length - 1]);
		}

		return String.valueOf(summa);
	}

	private int convertiCifra(String cifra) {

		if (cifra.equals("M")) {
			return 1000;
		} else if (cifra.equals("C")) {
			return 100;
		} else if (cifra.equals("L")) {
			return 50;
		} else if (cifra.equals("X")) {
			return 10;
		} else if (cifra.equals("V")) {
			return 5;
		} else {
			return 1;
		}
	}
}