package proyecto_bicicletas_g32.bicicleta_spring.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import proyecto_bicicletas_g32.bicicleta_spring.modelo.Categorias;
import proyecto_bicicletas_g32.bicicleta_spring.servicios.categoriaService;

@RestController
@RequestMapping(path = "/api/Category")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class categoriaControlador
{
    @Autowired
    private categoriaService categoriaService;

    @GetMapping("/all")
    public List<Categorias> getCategorias()
        {
            return categoriaService.getAll();
        }

    @GetMapping("/{id}")
    public Optional<Categorias> getCategoria(@PathVariable("id") int id)
        {
            return categoriaService.getCategoria(id);
        }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categorias save(@RequestBody Categorias c)
        {
            return categoriaService.save(c);
        }
}
