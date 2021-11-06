package proyecto_bicicletas_g32.bicicleta_spring.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Message")
public class mensajes implements Serializable
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String messagetext;
    
    public mensajes()
    {

    }

    public mensajes(Integer id, String messagetext)
    {
        this.id = id;
        this.messagetext = messagetext;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getMessagetext() 
    {
        return messagetext;
    }

    public void setMessagetext(String messagetext)
    {
        this.messagetext = messagetext;
    }   
}
