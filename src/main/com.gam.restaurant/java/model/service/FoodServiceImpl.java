package model.service;

import model.dao.FoodDAOImpl;
import model.to.Food;

/**
 * Created by MohammadReza on 4/14/2018.
 */
public class FoodServiceImpl implements FoodService {
    FoodDAOImpl foodDAO;

    public FoodServiceImpl()
    {
        foodDAO=new FoodDAOImpl();
    }
    public Food insertFood(Food food)
    {
        return foodDAO.insertFood(food);
    }
}
