package com.example.gabriela.structure;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Gabriela on 11/12/2014.
 */
public class Seeds {

    private ArrayList<Question> questions = new ArrayList<>();

    public void seedQuestions() throws IOException {
    // le arquivo e povoa o array question
        //Estrutura: id#enunciado#id_filho_sim#id_filho_nao#solucao_sim#solucao_nao",
        //"Dicionario: \"-1\"->não há questão no nó filho.",
        //"\t\t\t\"null\"->não há solução no nó filho",
        String []s = {"1#Problemas no carro?#2#13#null#null",
                "2#O carro está ligando?#3#9#null#null",
                "3#O carro aparenta “perder força” ou “engasgar”?#4#7#null#null",
                "4#O carro foi abastecido em algum posto de gasolina desconhecido?#-1#5#Combustível possívelmente adulterado. Contate um mecânico.#null",
                "5#O pedal de embreagem aparenta estar “mais duro” do que o normal?#-1#6#Possível desgaste do câmbio/embreagem. Contate um mecânico.#null",
                "6#O carro apresenta algum sinal de fumaça no capô?#-1#-1#Pare imediatamente! Alto risco de danos ao motor e possibilidade de incêndio do veículo. Contate um mecânico.#Possível falha nos cabos de vela, vela(s) ou distribuidor. Contate um mecânico.",
                "7#O carro aparenta “puxar” para algum lado?#-1#8#Possível necessidade de efetuar alinhamento e/ou balanceamento do veículo.#null",
                "8#O carro aparentemente não está desenvolvendo velocidade como de costume?#5#-1#null#Desculpe, não conseguiremos opinar sobre o seu problema. Contate um mecânico.",
                "9#O carro apresenta sinais sonoros de partida?#10#12#null#null",
                "10#Percebe-se anomalias no ruído de ignição (partida)?#11#-1#null#Possível falha nos cabos de vela, vela(s) ou distribuidor. Contate um mecânico.",
                "11#Há gasolina no reservatório de partida a frio?#-1#-1#Possível defeito no motor de arranque (motor de partida). Contate um mecânico.#Reabasteça o reservatório com gasolina e tente dar a partida novamente.",
                "12#As luzes do painel aparentam estar “fracas“?#-1#11#Possível falha na bateria do automóvel (descarregamento). Tente executar o procedimento de “chupeta”.#null",
                "13#Gostaria de obter algumas dicas úteis?#14#1#null#null",
                "14#Vai viajar?#-1#15#Não se esqueça de, além de calibrar os pneus, calibrar também o estepe, além de verificar e completar (se necessário) os fluidos do motor: água do reservatório do radiador, água do limpador de para-brisa, óleo lubrificante do motor e gasolina do reservatório de partida a frio.#null",
                "15#Vai trocar pneus?#16#-1#null#Fique atento! Pneus carecas ou vencidos comprometem seriamente a sua segurança.",
                "16#Pretende trocar apenas o par de pneus que apresentar mais desgaste?#-1#-1#Para reduzir o risco de derrapagem em curvas (rodar/”sair de traseira”), coloque os pneus novos nas rodas traseiras e os pneus mais usados nas rodas dianteiras. Também não se esqueça de alinhar e balancear o seu veículo!#Escolha pneus de largura compatível com o porte do seu veículo, para evitar sobrecarga (e consequente quebra) dos eixos e demais peças. Também não se esqueça de alinhar e balancear o seu veículo!"};

        String[] splited;
        for (int i=0; i<s.length; i++){
            splited = s[i].split("#");
            Question q = new Question();
            q.setIdQuestion(Integer.parseInt(splited[0]));
            q.setQuestionText(splited[1]);
            q.setIdQuestionChildYes(Integer.parseInt(splited[2]));
            q.setIdQuestionChildNo(Integer.parseInt(splited[3]));
            q.setSolutionYes(splited[4]);
            q.setSolutionNo(splited[5]);
            questions.add(q);
        }
        System.out.println("teste");
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}