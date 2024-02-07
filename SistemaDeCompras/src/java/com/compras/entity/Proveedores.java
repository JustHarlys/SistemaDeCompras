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
@Table(name = "PROVEEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")
    , @NamedQuery(name = "Proveedores.findByIdproveedor", query = "SELECT p FROM Proveedores p WHERE p.idproveedor = :idproveedor")
    , @NamedQuery(name = "Proveedores.findByCedulaORnc", query = "SELECT p FROM Proveedores p WHERE p.cedulaORnc = :cedulaORnc")
    , @NamedQuery(name = "Proveedores.findByNombrecomercial", query = "SELECT p FROM Proveedores p WHERE p.nombrecomercial = :nombrecomercial")
    , @NamedQuery(name = "Proveedores.findByEstado", query = "SELECT p FROM Proveedores p WHERE p.estado = :estado")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPROVEEDOR")
    private Integer idproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CEDULA_O_RNC")
    private String cedulaORnc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "NOMBRECOMERCIAL")
    private String nombrecomercial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ESTADO")
    private String estado;

    public Proveedores() {
    }

    public Proveedores(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Proveedores(Integer idproveedor, String cedulaORnc, String nombrecomercial, String estado) {
        this.idproveedor = idproveedor;
        this.cedulaORnc = cedulaORnc;
        this.nombrecomercial = nombrecomercial;
        this.estado = estado;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getCedulaORnc() {
        return cedulaORnc;
    }

    public void setCedulaORnc(String cedulaORnc) {
        this.cedulaORnc = cedulaORnc;
    }

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
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
        hash += (idproveedor != null ? idproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.idproveedor == null && other.idproveedor != null) || (this.idproveedor != null && !this.idproveedor.equals(other.idproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.compras.entity.Proveedores[ idproveedor=" + idproveedor + " ]";
    }
    
}
