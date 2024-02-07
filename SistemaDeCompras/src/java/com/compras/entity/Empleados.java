/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compras.entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Harlys
 */
@Entity
@Table(name = "EMPLEADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findByIdempleados", query = "SELECT e FROM Empleados e WHERE e.idempleados = :idempleados")
    , @NamedQuery(name = "Empleados.findByCedula", query = "SELECT e FROM Empleados e WHERE e.cedula = :cedula")
    , @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empleados.findByDepartamento", query = "SELECT e FROM Empleados e WHERE e.departamento = :departamento")
    , @NamedQuery(name = "Empleados.findByEstado", query = "SELECT e FROM Empleados e WHERE e.estado = :estado")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDEMPLEADOS")
    private Integer idempleados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "CEDULA")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ESTADO")
    private String estado;

    public Empleados() {
    }

    public Empleados(Integer idempleados) {
        this.idempleados = idempleados;
    }

    public Empleados(Integer idempleados, String cedula, String nombre, String departamento, String estado) {
        this.idempleados = idempleados;
        this.cedula = cedula;
        this.nombre = nombre;
        this.departamento = departamento;
        this.estado = estado;
    }

    public Integer getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(Integer idempleados) {
        this.idempleados = idempleados;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleados != null ? idempleados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idempleados == null && other.idempleados != null) || (this.idempleados != null && !this.idempleados.equals(other.idempleados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compras.entity.Empleados[ idempleados=" + idempleados + " ]";
    }
    
}
