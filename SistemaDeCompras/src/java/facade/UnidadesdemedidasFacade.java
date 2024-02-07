/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import com.compras.entity.Unidadesdemedidas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Harlys
 */
@Stateless
public class UnidadesdemedidasFacade extends AbstractFacade<Unidadesdemedidas> {

    @PersistenceContext(unitName = "SistemaDeComprasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnidadesdemedidasFacade() {
        super(Unidadesdemedidas.class);
    }
    
}
