package desafio01;

public class Eleitores {

    private int totalEleitores;
    private int validos;
    private int votosBrancos;
    private int nulos;

    public Eleitores(int totalEleitores, int validos, int votosBrancos, int nulos) {
        this.totalEleitores = totalEleitores;
        this.validos = validos;
        this.votosBrancos = votosBrancos;
        this.nulos = nulos;
    }

    public int getTotalEleitores() {
        return totalEleitores;
    }

    public int getValidos() {
        return validos;
    }

    public int getVotosBrancos() {
        return votosBrancos;
    }

    public int getNulos() {
        return nulos;
    }

    public int calcPercentualValid(int totEleitores, int votosValidos) {
         return votosValidos * 100 / totEleitores;
    }

    public int calcPercentualBrancos(int totEleitores, int votosBrancos) {
        return votosBrancos * 100 / totEleitores;
    }

    public int calcPercentualNulos(int totEleitores, int votosNulos) {
        return votosNulos * 100 / totEleitores;
    }
}
