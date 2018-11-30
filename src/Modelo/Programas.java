/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ismael
 */
@Entity
@Table(name = "programas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programas.findAll", query = "SELECT p FROM Programas p")
    , @NamedQuery(name = "Programas.findByIdProgramas", query = "SELECT p FROM Programas p WHERE p.idProgramas = :idProgramas")
    , @NamedQuery(name = "Programas.findByNombre", query = "SELECT p FROM Programas p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Programas.findByDescripcion", query = "SELECT p FROM Programas p WHERE p.descripcion = :descripcion")})
public class Programas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_programas")
    private Integer idProgramas;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

    public Programas() {
    }

    public Programas(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Programas(Integer idProgramas, String nombre, String descripcion) {
        this.idProgramas = idProgramas;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    

    
    public Programas(Integer idProgramas) {
        this.idProgramas = idProgramas;
    }

    public Integer getIdProgramas() {
        return idProgramas;
    }

    public void setIdProgramas(Integer idProgramas) {
        this.idProgramas = idProgramas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProgramas != null ? idProgramas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programas)) {
            return false;
        }
        Programas other = (Programas) object;
        if ((this.idProgramas == null && other.idProgramas != null) || (this.idProgramas != null && !this.idProgramas.equals(other.idProgramas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Programas[ idProgramas=" + idProgramas + " ]";
    }
    
}
