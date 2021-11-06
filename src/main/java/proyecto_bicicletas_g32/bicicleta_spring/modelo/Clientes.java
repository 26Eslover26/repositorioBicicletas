package proyecto_bicicletas_g32.bicicleta_spring.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Clientes implements Serializable
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String NAME;
    private String EMAIL;
    private Integer AGE;
    
    public Clientes()
    {
        
    }

    public Clientes(Integer iD, String nAME, String eMAIL, Integer aGE)
    {
        ID = iD;
        NAME = nAME;
        EMAIL = eMAIL;
        AGE = aGE;
    }

    public Integer getID()
    {
        return ID;
    }

    public void setID(Integer iD)
    {
        ID = iD;
    }

    public String getNAME()
    {
        return NAME;
    }

    public void setNAME(String nAME)
    {
        NAME = nAME;
    }

    public String getEMAIL()
    {
        return EMAIL;
    }

    public void setEMAIL(String eMAIL)
    {
        EMAIL = eMAIL;
    }

    public Integer getAGE()
    {
        return AGE;
    }

    public void setAGE(Integer aGE)
    {
        AGE = aGE;
    }   
}
