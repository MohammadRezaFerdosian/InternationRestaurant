package provider;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by MohammadReza on 4/12/2018.
 */
public class EntityManagerUtility  {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restaurantPU");

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

}
