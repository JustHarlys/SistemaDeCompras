/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import com.compras.entity.Marcas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Harlys
 */
@Stateless
public class MarcasFacade extends AbstractFacade<Marcas> {

    @PersistenceContext(unitName = "SistemaDeComprasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarcasFacade() {
        super(Marcas.class);
    }
    
}
