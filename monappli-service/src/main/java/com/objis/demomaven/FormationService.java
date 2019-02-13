package com.objis.demomaven;

import com.objis.demomaven.domaine.Formation;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;


public class FormationService implements IFormationService {

    /* (non-Javadoc)
     * @see com.objis.demomaven.IFormationService#creerFormation(javax.persistence.EntityManagerFactory, com.objis.demomaven.domaine.Formation)
     */
    @Override
    public void creerFormation(EntityManagerFactory emf, Formation maformation) throws ServletException, IOException {
        FormationDAO monDAO = new FormationDAO();
        monDAO.create(emf, maformation);
    }

    /* (non-Javadoc)
     * @see com.objis.demomaven.IFormationService#LireLesFormations(javax.persistence.EntityManagerFactory)
     */
    @Override
    public List<Formation> lireLesFormations(EntityManagerFactory emf) throws ServletException, IOException {
        FormationDAO monDAO = new FormationDAO();
        return monDAO.read(emf);
    }
}
