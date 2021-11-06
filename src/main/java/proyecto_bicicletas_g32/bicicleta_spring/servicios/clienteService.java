package proyecto_bicicletas_g32.bicicleta_spring.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_bicicletas_g32.bicicleta_spring.modelo.Clientes;
import proyecto_bicicletas_g32.bicicleta_spring.repositorio.clienteRepository;

@Service
public class clienteService
{
    @Autowired
    private clienteRepository clienteRepository;

    public List<Clientes> getAll()
        {
            return clienteRepository.getAll();
        }

    public Optional<Clientes> getCliente(int id)
        {
            return clienteRepository.getCliente(id);
        }

    public Clientes save(Clientes c)
        {
            if (c.getID()==null)
                {
                    return clienteRepository.save(c);
                }
            else
                {
                    Optional<Clientes> cAux = clienteRepository.getCliente(c.getID());
                    if(cAux.isEmpty())
                        {
                            return clienteRepository.save(c);
                        }
                    else
                        {
                            return c;
                        }
                }
        }
}
