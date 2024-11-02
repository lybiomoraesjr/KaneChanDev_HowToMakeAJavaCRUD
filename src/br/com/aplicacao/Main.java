package br.com.aplicacao;

import java.util.Date;

import br.com.agenda.model.Contato;
import br.com.dao.ContatoDAO;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
         * CONFIGURAR VARIÁVEIS DE AMBIENTE
         * 
         * export DB_USERNAME=
         * export DB_PASSWORD=
         * export DB_URL=
         */

        ContatoDAO contatoDao = new ContatoDAO();

        Contato contato = new Contato();

        contato.setNome("João Roberto Moro");
        contato.setIdade(55);
        contato.setDataCadastro(new Date());

        contatoDao.save(contato);

        for (Contato c : contatoDao.getContatos()) {
            System.out.println("Contato: " + c.getNome());
        }

        Contato c1 = new Contato();

        c1.setNome("Lybio Croton de Moraes Junior");
        c1.setIdade(23);
        c1.setDataCadastro(new Date());
        c1.setId(1);

        contatoDao.update(c1);

        contatoDao.delete(4);

    }

}
