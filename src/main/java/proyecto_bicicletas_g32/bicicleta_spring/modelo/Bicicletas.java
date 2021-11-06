package proyecto_bicicletas_g32.bicicleta_spring.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Bicicleta")
public class Bicicletas implements Serializable
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String BRAND;
    private Integer MODEL;
    private Integer CATEGORY_ID;
    private String NAME;

    public Bicicletas()
    {
        
    }

    public Bicicletas(Integer iD, String bRAND, Integer mODEL, Integer cATEGORY_ID, String nAME)
    {
        ID = iD;
        BRAND = bRAND;
        MODEL = mODEL;
        CATEGORY_ID = cATEGORY_ID;
        NAME = nAME;
    }

    public Integer getID()
    {
        return ID;
    }
    
    public void setID(Integer iD)
    {
        ID = iD;
    }

    public String getBRAND()
    {
        return BRAND;
    }

    public void setBRAND(String bRAND)
    {
        BRAND = bRAND;
    }

    public Integer getMODEL()
    {
        return MODEL;
    }

    public void setMODEL(Integer mODEL)
    {
        MODEL = mODEL;
    }

    public Integer getCATEGORY_ID()
    {
        return CATEGORY_ID;
    }

    public void setCATEGORY_ID(Integer cATEGORY_ID)
    {
        CATEGORY_ID = cATEGORY_ID;
    }

    public String getNAME()
    {
        return NAME;
    }

    public void setNAME(String nAME)
    {
        NAME = nAME;
    }
}
