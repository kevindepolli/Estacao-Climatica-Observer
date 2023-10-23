import java.util.*;

public class MaximasMinimasObserver implements Painel {

    private List<DadoClima> dadosClima;

    public MaximasMinimasObserver() {
        dadosClima = new ArrayList<>();
    }
    @Override
    public void atualizar(DadoClima dadoClima) {
        dadosClima.add(dadoClima);
        exibirMaximasMinimas();
    }
    private void exibirMaximasMinimas() {
        DadoClima maxTemperatura, minTemperatura;
        DadoClima maxUmidade, minUmidade;
        DadoClima maxPressao, minPressao;

        maxTemperatura = Collections.max(dadosClima, Comparator.comparing(DadoClima::getTemperatura));
        minTemperatura = Collections.min(dadosClima, Comparator.comparing(DadoClima::getTemperatura));

        maxUmidade = Collections.max(dadosClima, Comparator.comparing(DadoClima::getUmidade));
        minUmidade = Collections.min(dadosClima, Comparator.comparing(DadoClima::getUmidade));

        maxPressao = Collections.max(dadosClima, Comparator.comparing(DadoClima::getPressao));
        minPressao = Collections.min(dadosClima, Comparator.comparing(DadoClima::getPressao));

        System.out.println("A máxima e a mínima temperatura registrada foram de "
                + maxTemperatura.getTemperatura() + " em " + maxTemperatura.getData()
        + " e " + minTemperatura.getTemperatura() + " em " + minTemperatura.getData()
        + "\nA máxima e a mínima Umidade registrada foram de "
                + maxUmidade.getUmidade() + " em " + maxUmidade.getData()
        + " e " + minUmidade.getUmidade() + " em " + minUmidade.getData()
        + "\nA máxima e a mínima Pressao registrada foram de "
                + maxPressao.getPressao() + " em " + maxPressao.getData()
        + " e " + minPressao.getPressao() + " em " + minPressao.getData()
        + "\n");

    }
}


