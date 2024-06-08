package pe.edu.cibertec.app_security_backoffice.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_security_backoffice.model.bd.Usuario;
import pe.edu.cibertec.app_security_backoffice.service.UsuarioService;

@Controller
@RequestMapping("/auth")
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String login() {
        return "auth/frmlogin";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String nomusuario = auth.getName();
        Usuario usuario = usuarioService.buscarUsuarioxNomUsuario(nomusuario);
        model.addAttribute("nomusuario", usuario.getNomusuario());
        return "layout"; // Asegúrate de que layout.html incluya los fragmentos correctamente
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario, Model model) {
        String mensaje = "Usuario registrado correctamente";
        boolean respuesta = true;
        try {
            usuarioService.guardarUsuario(usuario);
        } catch (Exception ex) {
            mensaje = "Usuario no registrado, error en la BD";
            respuesta = false;
        }
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("respuesta", respuesta);
        return "auth/registro";
    }

    @GetMapping("/registro")
    public String register(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "auth/registro";
    }
}
