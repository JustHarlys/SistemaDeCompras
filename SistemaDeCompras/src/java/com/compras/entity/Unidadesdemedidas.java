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
@Table(name = "UNIDADESDEMEDIDAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidadesdemedidas.findAll", query = "SELECT u FROM Unidadesdemedidas u")
    , @NamedQuery(name = "Unidadesdemedidas.findByIdumedida", query = "SELECT u FROM Unidadesdemedidas u WHERE u.idumedida = :idumedida")
    , @NamedQuery(name = "Unidadesdemedidas.findByDescripcion", query = "SELECT u FROM Unidadesdemedidas u WHERE u.descripcion = :descripcion")
    , @NamedQuery(name = "Unidadesdemedidas.findByEstado", query = "SELECT u FROM Unidadesdemedidas u WHERE u.estado = :estado")})
public class Unidadesdemedidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUMEDIDA")
    private Integer idumedida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ESTADO")
    private String estado;

    public Unidadesdemedidas() {
    }

    public Unidadesdemedidas(Integer idumedida) {
        this.idumedida = idumedida;
    }

    public Unidadesdemedidas(Integer idumedida, String descripcion, String estado) {
        this.idumedida = idumedida;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdumedida() {
        return idumedida;
    }

    public void setIdumedida(Integer idumedida) {
        this.idumedida = idumedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idumedida != null ? idumedida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadesdemedidas)) {
            return false;
        }
        Unidadesdemedidas other = (Unidadesdemedidas) object;
        if ((this.idumedida == null && other.idumedida != null) || (this.idumedida != null && !this.idumedida.equals(other.idumedida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compras.entity.Unidadesdemedidas[ idumedida=" + idumedida + " ]";
    }
    
}
