package pe.edu.cibertec.app_security_backoffice.service;

import pe.edu.cibertec.app_security_backoffice.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario buscarUsuarioxNomUsuario(String nomusuario);

    void actualizarUsuario(Usuario usuario);

    Usuario guardarUsuario(Usuario usuario);
}
