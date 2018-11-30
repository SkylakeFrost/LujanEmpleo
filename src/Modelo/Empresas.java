
package Modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ismael
 */
@Entity
@Table(name = "empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
    , @NamedQuery(name = "Empresas.findByIdEmpresas", query = "SELECT e FROM Empresas e WHERE e.idEmpresas = :idEmpresas")
    , @NamedQuery(name = "Empresas.findByNombre", query = "SELECT e FROM Empresas e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empresas.findByDireccion", query = "SELECT e FROM Empresas e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empresas.findByCuil", query = "SELECT e FROM Empresas e WHERE e.cuil = :cuil")
    , @NamedQuery(name = "Empresas.findByTelefono", query = "SELECT e FROM Empresas e WHERE e.telefono = :telefono")
    , @NamedQuery(name = "Empresas.findByRubro", query = "SELECT e FROM Empresas e WHERE e.rubro = :rubro")
    , @NamedQuery(name = "Empresas.findByCeo", query = "SELECT e FROM Empresas e WHERE e.ceo = :ceo")
    , @NamedQuery(name = "Empresas.findByActividad", query = "SELECT e FROM Empresas e WHERE e.actividad = :actividad")
    , @NamedQuery(name = "Empresas.findByDescripcion", query = "SELECT e FROM Empresas e WHERE e.descripcion = :descripcion")})
public class Empresas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empresas")
    private Integer idEmpresas;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "cuil")
    private String cuil;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "rubro")
    private String rubro;
    @Column(name = "ceo")
    private String ceo;
    @Column(name = "actividad")
    private String actividad;
    @Column(name = "descripcion")
    private String descripcion;

    public Empresas() {
    }

    public Empresas(String nombre, String direccion, String cuil, String telefono, String rubro, String ceo, String actividad, String descripcion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
        this.telefono = telefono;
        this.rubro = rubro;
        this.ceo = ceo;
        this.actividad = actividad;
        this.descripcion = descripcion;
    }

    public Empresas(Integer idEmpresas, String nombre, String direccion, String cuil, String telefono, String rubro, String ceo, String actividad, String descripcion) {
        this.idEmpresas = idEmpresas;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
        this.telefono = telefono;
        this.rubro = rubro;
        this.ceo = ceo;
        this.actividad = actividad;
        this.descripcion = descripcion;
    }

    public Empresas(Integer idEmpresas) {
        this.idEmpresas = idEmpresas;
    }

    public Integer getIdEmpresas() {
        return idEmpresas;
    }

    public void setIdEmpresas(Integer idEmpresas) {
        Integer oldIdEmpresas = this.idEmpresas;
        this.idEmpresas = idEmpresas;
        changeSupport.firePropertyChange("idEmpresas", oldIdEmpresas, idEmpresas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        String oldCuil = this.cuil;
        this.cuil = cuil;
        changeSupport.firePropertyChange("cuil", oldCuil, cuil);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        String oldRubro = this.rubro;
        this.rubro = rubro;
        changeSupport.firePropertyChange("rubro", oldRubro, rubro);
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        String oldCeo = this.ceo;
        this.ceo = ceo;
        changeSupport.firePropertyChange("ceo", oldCeo, ceo);
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        String oldActividad = this.actividad;
        this.actividad = actividad;
        changeSupport.firePropertyChange("actividad", oldActividad, actividad);        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresas != null ? idEmpresas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.idEmpresas == null && other.idEmpresas != null) || (this.idEmpresas != null && !this.idEmpresas.equals(other.idEmpresas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Empresas[ idEmpresas=" + idEmpresas + " ]";
    }

    public void setIdEmpresas(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
