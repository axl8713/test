package conversione;

public class Convertitore {

    public String converti(String numeroRomano) {

        char[] cifreNumeroRomano = numeroRomano.toUpperCase().toCharArray();
        return String.valueOf(convertiCifreNumeroRomano(cifreNumeroRomano));
    }

    private int convertiCifreNumeroRomano(char[] cifre) {

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

        switch (cifra) {
            case 'M':
                return 1000;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new IllegalArgumentException("'" + cifra + "' non è un numero romano");
        }
    }
}
