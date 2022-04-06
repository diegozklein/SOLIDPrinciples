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
public class ServicoEventos {
    private JdbcTemplate jdbc = new JdbcTemplate();
    private EventoRepository eventoRepository = new EventoRepository(jdbc);


    public List<Evento> todos() {
        return eventoRepository.todos();
    }

    public boolean cadastra(Evento evento){
        eventoRepository.cadastra(evento);
        return true;
    }    
}

