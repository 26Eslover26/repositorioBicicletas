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

import proyecto_bicicletas_g32.bicicleta_spring.modelo.mensajes;
import proyecto_bicicletas_g32.bicicleta_spring.servicios.mensajeService;

@RestController
@RequestMapping(path = "/api/Message")
@CrossOrigin (origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class mensajeControlador
{
    @Autowired
    private mensajeService mensajeService;

    @GetMapping("/all")
    public List<mensajes> getMensajes()
        {
            return mensajeService.getAll();
        }

    @GetMapping("/{id}")
    public Optional<mensajes> getMensaje(@PathVariable("id") int id)
        {
            return mensajeService.getMensaje(id);
        }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public mensajes save(@RequestBody mensajes m)
        {
            return mensajeService.save(m);
        }
}
