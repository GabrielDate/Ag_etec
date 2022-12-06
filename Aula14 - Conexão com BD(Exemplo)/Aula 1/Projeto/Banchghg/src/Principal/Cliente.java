

package Principal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.beans.PropertyChangeSupport;


@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCliCod", query = "SELECT c FROM Cliente c WHERE c.cliCod = :cliCod"),
    @NamedQuery(name = "Cliente.findByCliNome", query = "SELECT c FROM Cliente c WHERE c.cliNome = :cliNome"),
    @NamedQuery(name = "Cliente.findByCliTel", query = "SELECT c FROM Cliente c WHERE c.cliTel = :cliTel")})
public class Cliente implements Serializable {
        private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cli_cod")
    private Integer cliCod;
    @Column(name = "cli_nome")
    private String cliNome;
    @Column(name = "cli_tel")
    private Integer cliTel;

    public Cliente() {
    }

    public Cliente(Integer cliCod) {
        this.cliCod = cliCod;
    }

    public Integer getCliCod() {
        return cliCod;
    }

    public void setCliCod(Integer cliCod) {
         Integer oldCliCod = this.cliCod;
        this.cliCod = cliCod;
        changeSupport.firePropertyChange("cliCod", oldCliCod, cliCod);
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        String oldCliNome = this.cliNome;
        this.cliNome = cliNome;
        changeSupport.firePropertyChange("cliNome", oldCliNome, cliNome);
       
    }

    public Integer getCliTel() {
        return cliTel;
    }

    public void setCliTel(Integer cliTel) {
         Integer oldCliTel = this.cliTel;
        this.cliTel = cliTel;
        changeSupport.firePropertyChange("cliTel", oldCliTel, cliTel);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCod != null ? cliCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
      
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliCod == null && other.cliCod != null) || (this.cliCod != null && !this.cliCod.equals(other.cliCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Principal.Cliente[cliCod=" + cliCod + "]";
    }

}
