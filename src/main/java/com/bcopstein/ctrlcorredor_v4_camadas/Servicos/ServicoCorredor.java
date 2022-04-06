package com.bcopstein.ctrlcorredor_v4_camadas.Servicos;

import java.util.List;
import java.util.stream.Collectors;

import com.bcopstein.ctrlcorredor_v4_camadas.AcessoDados.Corredor;
import com.bcopstein.ctrlcorredor_v4_camadas.AcessoDados.CorredorRepository;
import com.bcopstein.ctrlcorredor_v4_camadas.AcessoDados.Evento;
import com.bcopstein.ctrlcorredor_v4_camadas.AcessoDados.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class ServicoCorredor {
    private JdbcTemplate jdbc = new JdbcTemplate();
    private CorredorRepository corredorRepository = new CorredorRepository(jdbc);


    public List<Corredor> getTodos() {
        return corredorRepository.todos();
    }

    public boolean cadastraCorredor(Corredor corredor){
        corredorRepository.removeTodos();
        corredorRepository.cadastra(corredor);
        return true;
    }
}
