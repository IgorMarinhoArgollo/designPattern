package org.designPattern.facede.cep;

public class CepAPI {

    public static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Cidade Qualquer";
    }

    public String recuperarEstado(String cep) {
        return "Estado Qualquer";
    }


}
