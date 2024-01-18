package com.zakado.zkd.usersmanagement.service;

import com.zakado.zkd.usersmanagement.model.Reviews;

import java.util.List;

public interface CriticasService {
    List<Reviews> buscarTodas();

    List<Reviews> buscarCriticasPorIdPelicula(Integer idPel);

    Reviews buscarCriticasPorId(Integer idMatricula);

    Reviews guardarCritica(Reviews critica);
    void actualizarCritica(Reviews reviews);
}
