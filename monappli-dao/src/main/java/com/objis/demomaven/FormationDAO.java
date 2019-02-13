package com.objis.demomaven;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;

import com.objis.demomaven.domaine.Formation;

public class FormationDAO implements IFormationDAO {

	/**
     * @see HttpServlet#HttpServlet()
     */
    public FormationDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/* (non-Javadoc)
	 * @see com.objis.demomaven.IFormationDAO2#create(javax.persistence.EntityManagerFactory, com.objis.demomaven.domaine.Formation)
	 */
	@Override
	public void create(EntityManagerFactory emf, Formation maformation) throws ServletException, IOException {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(maformation);
        tx.commit();
        em.close();
		
	}

	/* (non-Javadoc)
	 * @see com.objis.demomaven.IFormationDAO2#read(javax.persistence.EntityManagerFactory)
	 */
	@Override
	public List<Formation> read(EntityManagerFactory emf) throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

    
    /*
	public void create(EntityManagerFactory emf, Formation maformation) throws ServletException, IOException{
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(maformation);
        tx.commit();
        em.close();
    }*/



}
