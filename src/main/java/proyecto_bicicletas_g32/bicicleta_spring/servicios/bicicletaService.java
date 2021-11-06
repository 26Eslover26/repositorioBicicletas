package proyecto_bicicletas_g32.bicicleta_spring.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_bicicletas_g32.bicicleta_spring.modelo.Bicicletas;
import proyecto_bicicletas_g32.bicicleta_spring.repositorio.bicicletaRepository;

@Service
public class bicicletaService
{
    @Autowired
    private bicicletaRepository bicicletaRepository;

    public List<Bicicletas> getAll()
    {
        return bicicletaRepository.getAll();
    }

    public Optional<Bicicletas> getBicicleta(int id)
    {
        return bicicletaRepository.getBicicleta(id);
    }

    public Bicicletas save(Bicicletas b)
    {
        if (b.getID()==null)
            {
                return bicicletaRepository.save(b);
            }
        else
            {
                Optional<Bicicletas> bAux = bicicletaRepository.getBicicleta(b.getID());
                if (bAux.isEmpty())
                    {
                        return bicicletaRepository.save(b);
                    }
                else
                    {
                        return b;
                    }
            }
    }
}
