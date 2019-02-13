package com.objis.demomaven;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;

import com.objis.demomaven.domaine.Formation;

public interface IFormationDAO {

	void create(EntityManagerFactory emf, Formation maformation) throws ServletException, IOException;

	List<Formation> read(EntityManagerFactory emf) throws ServletException, IOException;

}