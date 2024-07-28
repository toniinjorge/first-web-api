package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping()
    public List<Usuario>getUsers(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username, String password){
        return repository.findByUsername(username, password);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);

    }
}
