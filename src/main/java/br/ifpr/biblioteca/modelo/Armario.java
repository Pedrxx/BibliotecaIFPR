package br.ifpr.biblioteca.modelo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "tb_armario")
public class Armario{
    
    @Id
    @Column(name = "id_armario", unique = true, nullable = false)
    private Integer armarioID;
    @Column(name = "armario_ativo", unique = false, nullable = false)
    private String ativo;
    @Column(name = "armario_locado", unique = false, nullable = false)
    private String locado;
    
    
    public Armario() {}
    
    public Armario(Integer id, String ativo, String locado) {
        this.armarioID = id;
        this.ativo = ativo;
        this.locado = locado;
    }

    /**
     * @return the numero
     */
    public Integer getArmarioID() {
        return armarioID;
    }

    /**
     * @param numero the numero to set
     */
    public void setArmarioID(Integer numero) {
        this.armarioID = numero;
    }

    /**
     * @return the ativo
     */
    public String isAtivo() {
        return getAtivo();
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the ativo
     */
    public String getAtivo() {
        return ativo;
    }

    /**
     * @return the locado
     */
    public String getLocado() {
        return locado;
    }

    /**
     * @param locado the locado to set
     */
    public void setLocado(String locado) {
        this.locado = locado;
    }

    @Override
    public String toString() {
        return  "" + armarioID + ' ';
    }

    
    
    
}
