package nl.basroding.director.models;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.RollbackException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.SystemException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author basroding
 */
public final class ModelCollection 
{
    private DriversModel driversModel;
    private TeamsModel teamsModel;
    private ArrayList<Model> models;
    
    public ModelCollection()
    {
	models = new ArrayList<Model>();
	
	addModel(driversModel = new DriversModel());
	addModel(teamsModel = new TeamsModel());
	
	SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	
	DummyFactory.insertDummyData(session);
	
	for(Model model : models)
	    model.loadFromDatabase(session);
	
	session.getTransaction().commit();
    }
    
    private void addModel(Model model)
    {
	models.add(model);
    }

    public DriversModel getDriversModel() 
    {
	return driversModel;
    }

    public TeamsModel getTeamsModel() 
    {
	return teamsModel;
    }
}
