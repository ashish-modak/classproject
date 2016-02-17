import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Ignore;
import org.junit.Test;

import com.common.Role;
import com.entities.EmployeeBE;
import com.entities.UserBE;

@Ignore
public class TestExampleJPA {

    private static final String PERSISTENCE_UNIT_NAME = "MasterData";

    private static EntityManagerFactory factory;

    @Test
    public void test() {
        Map<String, String> persistProperties = new HashMap<String, String>();

        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION, PersistenceUnitProperties.DROP_AND_CREATE);
        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION_MODE, "sql-script");
        // persistProperties.put(PersistenceUnitProperties.CREATE_JDBC_DDL_FILE, "create.sql");

        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION, "drop-and-create-tables");
        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION_MODE, "sql-script");
        // persistProperties.put(PersistenceUnitProperties.APP_LOCATION, "D:\\Database");
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, persistProperties);
        // persistProperties.put(PersistenceUnitProperties.CREATE_JDBC_DDL_FILE, "create.sql");
        EntityManager em = factory.createEntityManager();

        EntityTransaction transactionFactory = em.getTransaction();
        transactionFactory.begin();

        UserBE be = new UserBE();
        // be.setId(111);
        be.setUserName("Ashish");
        be.setUserPassword("Pass");
        be.setUserRole(Role.Admin);

        em.persist(be);
        transactionFactory.commit();

    }

    @Test
    public void test2() {
        Map<String, String> persistProperties = new HashMap<String, String>();

        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION, PersistenceUnitProperties.DROP_AND_CREATE);
        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION_MODE, "sql-script");
        // persistProperties.put(PersistenceUnitProperties.CREATE_JDBC_DDL_FILE, "create.sql");

        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION, "drop-and-create-tables");
        // persistProperties.put(PersistenceUnitProperties.DDL_GENERATION_MODE, "sql-script");
        // persistProperties.put(PersistenceUnitProperties.APP_LOCATION, "D:\\Database");
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, persistProperties);
        // persistProperties.put(PersistenceUnitProperties.CREATE_JDBC_DDL_FILE, "create.sql");
        EntityManager em = factory.createEntityManager();

        EntityTransaction transactionFactory = em.getTransaction();
        transactionFactory.begin();

        EmployeeBE be = em.find(EmployeeBE.class, new Long(1));
        System.out.println(be.getName());
        System.out.println(be.getUser().getUserName());
        // be.setAddress("ABCD");
        // be.setContactNumber("123456");
        // be.setJoiningDate(new Date());
        // be.setName("Employee1");
        // be.setSalary(122345);
        //
        // UserBE userbe = em.find(UserBE.class, new Long(1));
        // be.setUser(userbe);
        // em.persist(be);
        transactionFactory.commit();

    }
}
