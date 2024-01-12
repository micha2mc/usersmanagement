package com.zakado.zkd.usersmanagement.service.impl;

import com.zakado.zkd.usersmanagement.dao.ReviewsDAO;
import com.zakado.zkd.usersmanagement.model.Reviews;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CriticasServiceImpl implements CriticasService {

    private final ReviewsDAO reviewsDAO;
    @Override
    public List<Reviews> buscarTodas() {
        return reviewsDAO.buscarTodas();
    }

    @Override
    public List<Reviews> buscarCriticasPorIdPelicula(Integer idPel) {
        return reviewsDAO.buscarCriticasPorIdPelicula(idPel);
    }

    @Override
    public Reviews buscarCriticasPorId(Integer idCrit) {
        return reviewsDAO.buscarCriticaPorId(idCrit);
    }
}
