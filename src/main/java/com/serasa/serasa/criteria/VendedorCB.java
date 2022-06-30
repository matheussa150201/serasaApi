package com.serasa.serasa.criteria;

import com.serasa.serasa.entity.Vendedor;
import com.serasa.serasa.exception.NotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class VendedorCB {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Vendedor> fetchAllVendedor() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Vendedor> criteriaQuery = criteriaBuilder.createQuery(Vendedor.class);

        Root<Vendedor> root = criteriaQuery.from(Vendedor.class);
        criteriaQuery.select(root);

        TypedQuery<Vendedor> typedQuery = entityManager.createQuery(criteriaQuery);
        List<Vendedor> vendedorList = typedQuery.getResultList();
        if(vendedorList.size() == 0) {
            new NotFoundException("Nenhuma Vendedor foi encontrado!");
        }
        return vendedorList;
    }
}
