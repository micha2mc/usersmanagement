package com.zakado.zkd.usersmanagement.dao;

import com.zakado.zkd.usersmanagement.model.Reviews;

import java.util.List;

public interface ReviewsDAO {
    List<Reviews> buscarTodas();

    List<Reviews> buscarCriticasPorIdPelicula(Integer idMovie);

    Reviews buscarCriticaPorId(Integer idReview);

    void guardarCritica(Reviews critica);

    void eliminarCritica(Integer idCritica);
}
