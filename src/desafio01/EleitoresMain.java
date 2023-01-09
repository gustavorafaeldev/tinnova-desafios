package desafio01;

public class EleitoresMain {
    public static void main(String[] args) {

        Eleitores eleitores = new Eleitores(1000, 800, 150, 50);

        int percentualValidos = eleitores.calcPercentualValid(eleitores.getTotalEleitores(), eleitores.getValidos());
        int percentualBrancos = eleitores.calcPercentualBrancos(eleitores.getTotalEleitores(), eleitores.getVotosBrancos());
        int percentualNulos = eleitores.calcPercentualNulos(eleitores.getTotalEleitores(), eleitores.getNulos());

        System.out.println("Ao total foram " + eleitores.getTotalEleitores() + " eleitores \n" +
                percentualValidos +"% de votos válidos.\n" +
                percentualBrancos +"% de votos em branco.\n" +
                percentualNulos +"% de votos nulos.");
    }
}
