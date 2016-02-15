
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.persistence.config.PersistenceUnitProperties;


public class TestExampleJPA {
	
	private static final String PERSISTENCE_UNIT_NAME = "MasterData";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		 Map<String, String> persistProperties = new HashMap<String, String>();
	        persistProperties.put(PersistenceUnitProperties.DDL_GENERATION, "create-tables");
	        persistProperties.put(PersistenceUnitProperties.DDL_GENERATION_MODE, "sql-script");
	        persistProperties.put(PersistenceUnitProperties.APP_LOCATION, "D:\\Database");
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME,persistProperties);
		EntityManager em = factory.createEntityManager();
		
	}
}