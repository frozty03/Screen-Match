package br.com.froza.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtro(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) System.out.println("Altamente recomendado");
        else if (classifiable.getClassification() == 3) System.out.println("Recomendado");
        else if (classifiable.getClassification() == 2) System.out.println("Adicione na sua lista para assistir depois");
        else System.out.println("Para quando quiser sair do comum");
    }
}
