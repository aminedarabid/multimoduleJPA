package com.objis.demomaven;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;

import com.objis.demomaven.domaine.Formation;



public class FormationService implements IFormationService {
	
	/* (non-Javadoc)
	 * @see com.objis.demomaven.IFormationService#creerFormation(javax.persistence.EntityManagerFactory, com.objis.demomaven.domaine.Formation)
	 */
	@Override
	public void creerFormation(EntityManagerFactory emf, Formation maformation) throws ServletException, IOException{
		FormationDAO monDAO = new FormationDAO();
		monDAO.create(emf, maformation);
	}
	
	/* (non-Javadoc)
	 * @see com.objis.demomaven.IFormationService#LireLesFormations(javax.persistence.EntityManagerFactory)
	 */
	@Override
	public List<Formation> LireLesFormations(EntityManagerFactory emf) throws ServletException, IOException{
		FormationDAO monDAO = new FormationDAO();
		return monDAO.read(emf);
	}
}
