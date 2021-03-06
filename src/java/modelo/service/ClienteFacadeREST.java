/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Cliente;
/**
 *
 * @author jackson
 */
@Stateless
public class ClienteFacadeREST extends AbstractFacade<Cliente> {
    @PersistenceContext(unitName = "SuporteWSPU")
    private EntityManager em;

    public ClienteFacadeREST() {
        super(Cliente.class);
    }

    @Override
    public void create(Cliente entity) {
        super.create(entity);
    }

    public void edit(Integer id, Cliente entity) {
        super.edit(entity);
    }

    public void remove(Integer id) {
        super.remove(super.find(id));
    }

    public Cliente find(Integer id) {
        return super.find(id);
    }

    @Override
    public List<Cliente> findAll() {
        return super.findAll();
    }

    public List<Cliente> findRange(Integer from, Integer to) {
        return super.findRange(new int[]{from, to});
    }

    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
