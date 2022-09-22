package br.ifpr.biblioteca.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "tb_armario")
public class Armario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_armario", unique = true, nullable = false)
    private Integer armarioID;
    @Column(name = "armario_ativo", unique = false, nullable = false)
    private boolean ativo;
    @Column(name = "armario_locado", unique = false, nullable = false)
    private boolean locado;
    
    

    public Armario() {
    }

    public Armario(String numero, boolean ativo, boolean locado) {
        this.armarioID = armarioID;
        this.ativo = ativo;
        this.locado = locado;
    }
    
    public void alugaArmario() {
        this.locado = true;
    }
    
    public void devolveArmario(String RA) {
        this.locado = false;
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
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
