package com.objis.demomaven;

import com.objis.demomaven.domaine.Formation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

public class FormationDAO implements IFormationDAO {

    /**
     * @see HttpServlet#HttpServlet()
     */
    FormationDAO() {
        super();
    }

    @Override
    public void create(EntityManagerFactory emf, Formation maformation) throws ServletException, IOException {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(maformation);
        tx.commit();
        em.close();

    }

    @Override
    public List<Formation> read(EntityManagerFactory emf) throws ServletException, IOException {
        return null;
    }

}
