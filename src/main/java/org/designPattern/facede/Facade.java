package org.designPattern.facede;

import org.designPattern.facede.cep.CepAPI;
import org.designPattern.facede.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }

}
