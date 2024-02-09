package com.zakado.zkd.usersmanagement.dao.impl;


import com.zakado.zkd.usersmanagement.dao.ReviewsDAO;
import com.zakado.zkd.usersmanagement.dao.repository.ReviewsRepository;
import com.zakado.zkd.usersmanagement.model.Reviews;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ReviewsDAOImpl implements ReviewsDAO {

    private final ReviewsRepository reviewsRepository;

    @Override
    public List<Reviews> buscarTodas() {
        return reviewsRepository.findAll();
    }

    @Override
    public List<Reviews> buscarCriticasPorIdPelicula(Integer idMovie) {
        return reviewsRepository.findByIdMovie(idMovie);
    }

    @Override
    public Reviews buscarCriticaPorId(Integer idReview) {
        return reviewsRepository.findById(idReview).orElse(null);
    }

    @Override
    public Reviews guardarCritica(Reviews critica) {
        return reviewsRepository.save(critica);
    }

    @Override
    public void eliminarCritica(Integer idCritica) {
        reviewsRepository.deleteById(idCritica);
    }
}
