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
@Table(name = "postulantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postulantes.findAll", query = "SELECT p FROM Postulantes p")
    , @NamedQuery(name = "Postulantes.findByIdPostulantes", query = "SELECT p FROM Postulantes p WHERE p.idPostulantes = :idPostulantes")
    , @NamedQuery(name = "Postulantes.findByNombre", query = "SELECT p FROM Postulantes p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Postulantes.findByApellido", query = "SELECT p FROM Postulantes p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Postulantes.findByEdad", query = "SELECT p FROM Postulantes p WHERE p.edad = :edad")
    , @NamedQuery(name = "Postulantes.findByDni", query = "SELECT p FROM Postulantes p WHERE p.dni = :dni")
    , @NamedQuery(name = "Postulantes.findByMovilidad", query = "SELECT p FROM Postulantes p WHERE p.movilidad = :movilidad")
    , @NamedQuery(name = "Postulantes.findByNivelEducativo", query = "SELECT p FROM Postulantes p WHERE p.nivelEducativo = :nivelEducativo")
    , @NamedQuery(name = "Postulantes.findBySexo", query = "SELECT p FROM Postulantes p WHERE p.sexo = :sexo")
    , @NamedQuery(name = "Postulantes.findByPerfil", query = "SELECT p FROM Postulantes p WHERE p.perfil = :perfil")
    , @NamedQuery(name = "Postulantes.findByCuil", query = "SELECT p FROM Postulantes p WHERE p.cuil = :cuil")
    , @NamedQuery(name = "Postulantes.findByDomicilio", query = "SELECT p FROM Postulantes p WHERE p.domicilio = :domicilio")
    , @NamedQuery(name = "Postulantes.findByTelfPrincipal", query = "SELECT p FROM Postulantes p WHERE p.telfPrincipal = :telfPrincipal")
    , @NamedQuery(name = "Postulantes.findByTelfAlternativo", query = "SELECT p FROM Postulantes p WHERE p.telfAlternativo = :telfAlternativo")
    , @NamedQuery(name = "Postulantes.findByEmail", query = "SELECT p FROM Postulantes p WHERE p.email = :email")
    , @NamedQuery(name = "Postulantes.findByDispHoraria", query = "SELECT p FROM Postulantes p WHERE p.dispHoraria = :dispHoraria")
    , @NamedQuery(name = "Postulantes.findByOtraInfo", query = "SELECT p FROM Postulantes p WHERE p.otraInfo = :otraInfo")})
public class Postulantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_postulantes")
    private Integer idPostulantes;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "edad")
    private String edad;
    @Column(name = "dni")
    private String dni;
    @Column(name = "movilidad")
    private String movilidad;
    @Column(name = "nivel_educativo")
    private String nivelEducativo;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "perfil")
    private String perfil;
    @Column(name = "cuil")
    private String cuil;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "telf_principal")
    private String telfPrincipal;
    @Column(name = "telf_alternativo")
    private String telfAlternativo;
    @Column(name = "email")
    private String email;
    @Column(name = "disp_horaria")
    private String dispHoraria;
    @Column(name = "otra_info")
    private String otraInfo;

    public Postulantes() {
    }

    public Postulantes(Integer idPostulantes, String nombre, String apellido, String edad, String dni, String movilidad, String nivelEducativo, String sexo, String perfil, String cuil, String domicilio, String telfPrincipal, String telfAlternativo, String email, String dispHoraria, String otraInfo) {
        this.idPostulantes = idPostulantes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.movilidad = movilidad;
        this.nivelEducativo = nivelEducativo;
        this.sexo = sexo;
        this.perfil = perfil;
        this.cuil = cuil;
        this.domicilio = domicilio;
        this.telfPrincipal = telfPrincipal;
        this.telfAlternativo = telfAlternativo;
        this.email = email;
        this.dispHoraria = dispHoraria;
        this.otraInfo = otraInfo;
    }

    public Postulantes(String nombre, String apellido, String edad, String dni, String movilidad, String nivelEducativo, String sexo, String perfil, String cuil, String domicilio, String telfPrincipal, String telfAlternativo, String email, String dispHoraria, String otraInfo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.movilidad = movilidad;
        this.nivelEducativo = nivelEducativo;
        this.sexo = sexo;
        this.perfil = perfil;
        this.cuil = cuil;
        this.domicilio = domicilio;
        this.telfPrincipal = telfPrincipal;
        this.telfAlternativo = telfAlternativo;
        this.email = email;
        this.dispHoraria = dispHoraria;
        this.otraInfo = otraInfo;
    }

    public Postulantes(Integer idPostulantes) {
        this.idPostulantes = idPostulantes;
    }

    public Integer getIdPostulantes() {
        return idPostulantes;
    }

    public void setIdPostulantes(Integer idPostulantes) {
        this.idPostulantes = idPostulantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelfPrincipal() {
        return telfPrincipal;
    }

    public void setTelfPrincipal(String telfPrincipal) {
        this.telfPrincipal = telfPrincipal;
    }

    public String getTelfAlternativo() {
        return telfAlternativo;
    }

    public void setTelfAlternativo(String telfAlternativo) {
        this.telfAlternativo = telfAlternativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDispHoraria() {
        return dispHoraria;
    }

    public void setDispHoraria(String dispHoraria) {
        this.dispHoraria = dispHoraria;
    }

    public String getOtraInfo() {
        return otraInfo;
    }

    public void setOtraInfo(String otraInfo) {
        this.otraInfo = otraInfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPostulantes != null ? idPostulantes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Postulantes)) {
            return false;
        }
        Postulantes other = (Postulantes) object;
        if ((this.idPostulantes == null && other.idPostulantes != null) || (this.idPostulantes != null && !this.idPostulantes.equals(other.idPostulantes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Postulantes[ idPostulantes=" + idPostulantes + " ]";
    }
    
}
