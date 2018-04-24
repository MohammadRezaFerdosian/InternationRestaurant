package model.dao;

import model.to.Food;
import provider.EntityManagerUtility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by MohammadReza on 4/14/2018.
 */
public class FoodDAOImpl implements FoodDAO {

    private static EntityManager entityManager;

   static
    {
        EntityManagerFactory entityManagerFactory= EntityManagerUtility.getEntityManagerFactory();
        entityManager=entityManagerFactory.createEntityManager();
    }

    public Food insertFood(Food food) {

        entityManager.getTransaction().begin();
        entityManager.persist(food);
        entityManager.getTransaction().commit();
        return food;
    }
}
