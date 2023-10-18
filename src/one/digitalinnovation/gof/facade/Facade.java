package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recupearCidade(cep);
        String estado = CepApi.getInstancia().recupearEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
