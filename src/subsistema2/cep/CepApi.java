package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recupearCidade(String cep){
        return "Araraquara";
    }
    public String recupearEstado(String cep){
        return "SP";
    }

}
