package it.polito.tdp.corsi.model;

import java.util.List;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
private CorsoDAO corsoDAO;


public Model ()
{corsoDAO= new CorsoDAO();
}
	
public List <Corso> getCorsiByPeriodo(int periodo)
{return corsoDAO.getCorsiByPeriodo(periodo);
	}


}
