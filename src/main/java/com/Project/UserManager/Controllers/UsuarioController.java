package com.Project.UserManager.Controllers;
import com.Project.UserManager.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNombre("Elfo");
        usuario.setApellido("Leonidas");
        usuario.setEmail("LeoNN@gmail.com");
        usuario.setTelefono("54545454");
        usuario.setPassword("fasf42324");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> Getusuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario();
        usuario1.setId(1233L);
        usuario1.setNombre("Elfo");
        usuario1.setApellido("Leonidas");
        usuario1.setEmail("LeoNN@gmail.com");
        usuario1.setTelefono("54545454");
        usuario1.setPassword("fasf42324");

        Usuario usuario2 = new Usuario();
        usuario2.setId(1333L);
        usuario2.setNombre("Marcela");
        usuario2.setApellido("bassa");
        usuario2.setEmail("MBSS@gmail.com");
        usuario2.setTelefono("5333-4444");
        usuario2.setPassword("asd333");

        Usuario usuario3 = new Usuario();
        usuario3.setId(555L);
        usuario3.setNombre("Eva");
        usuario3.setApellido("Bonaparte");
        usuario3.setEmail("evaBona@gmail.com");
        usuario3.setTelefono("3333-5555");
        usuario3.setPassword("tofutoto27");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;

    }
}



