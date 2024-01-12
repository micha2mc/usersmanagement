package com.zakado.zkd.usersmanagement.service.impl;

import com.zakado.zkd.usersmanagement.dao.ReviewsDAO;
import com.zakado.zkd.usersmanagement.dao.UserDAO;
import com.zakado.zkd.usersmanagement.model.User;
import com.zakado.zkd.usersmanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final ReviewsDAO reviewsDAO;

    @Override
    public List<User> buscarTodos() {
        return userDAO.buscarTodos();
    }

    @Override
    public User buscarUsuarioPorId(Integer idUsuario) {
        return userDAO.buscarUsuarioPorId(idUsuario);
    }

    @Override
    public User buscarUsuarioPorNombre(String nombre) {
        return userDAO.buscarUsuarioPorNombre(nombre);
    }

    @Override
    public User buscarUsuarioPorCorreo(String correo) {
        return userDAO.buscarUsuarioPorCorreo(correo);
    }

    @Override
    public void guardarUsuario(User usuario) {
        userDAO.guardarUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {
        userDAO.eliminarUsuario(idUsuario);
    }

    @Override
    public void actualizarUsuario(User usuario) {
        userDAO.actualizarUsuario(usuario);
    }

    @Override
    public void eliminarCritica(Integer idUsuario, Integer idCrit) {
        User user = userDAO.buscarUsuarioPorId(idUsuario);
        if(Objects.nonNull(user)){
            user.removeReviews(reviewsDAO.buscarCriticaPorId(idCrit));
        }
        reviewsDAO.eliminarCritica(idCrit);
    }
}
