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
@Table(name = "DEPARTAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d")
    , @NamedQuery(name = "Departamentos.findByIddep", query = "SELECT d FROM Departamentos d WHERE d.iddep = :iddep")
    , @NamedQuery(name = "Departamentos.findByNombre", query = "SELECT d FROM Departamentos d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Departamentos.findByEstado", query = "SELECT d FROM Departamentos d WHERE d.estado = :estado")})
public class Departamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDEP")
    private Integer iddep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "ESTADO")
    private String estado;

    public Departamentos() {
    }

    public Departamentos(Integer iddep) {
        this.iddep = iddep;
    }

    public Departamentos(Integer iddep, String nombre, String estado) {
        this.iddep = iddep;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getIddep() {
        return iddep;
    }

    public void setIddep(Integer iddep) {
        this.iddep = iddep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (iddep != null ? iddep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.iddep == null && other.iddep != null) || (this.iddep != null && !this.iddep.equals(other.iddep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compras.entity.Departamentos[ iddep=" + iddep + " ]";
    }
    
}
