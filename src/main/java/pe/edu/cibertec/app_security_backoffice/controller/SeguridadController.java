package pe.edu.cibertec.app_security_backoffice.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_security_backoffice.model.bd.Usuario;
import pe.edu.cibertec.app_security_backoffice.model.dto.ResultadoDto;
import pe.edu.cibertec.app_security_backoffice.model.dto.UsuarioDto;
import pe.edu.cibertec.app_security_backoffice.service.UsuarioService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/seguridad")
public class SeguridadController {
    private UsuarioService usuarioService;



}
