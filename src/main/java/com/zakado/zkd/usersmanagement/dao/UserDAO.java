package com.zakado.zkd.usersmanagement.dao;

import com.zakado.zkd.usersmanagement.model.User;

import java.util.List;

public interface UserDAO {
    List<User> buscarTodos();
    User buscarUsuarioPorId(Integer idUsuario);
    User buscarUsuarioPorNombre(String nombre);
    User buscarUsuarioPorCorreo(String correo);
    void guardarUsuario(User usuario);
    void eliminarUsuario(Integer idUsuario);
    void actualizarUsuario(User usuario);
}
