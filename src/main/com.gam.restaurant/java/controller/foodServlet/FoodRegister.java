package controller.foodServlet;

import model.service.FoodService;
import model.service.FoodServiceImpl;
import model.to.Food;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/foodRegister")
public class FoodRegister extends HttpServlet {

    //FoodServiceImpl foodService;
   // Food food;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        System.out.println("IN SERVLET");
           Food food = new Food();
            // food.setMealCategory(Enum.valueOf(En(request.getParameter("mealCategory"));
            /*food.setId(Long.parseLong(request.getParameter("foodId")));*/
            food.setName(request.getParameter("foodName"));
            food.setPrice(Long.parseLong(request.getParameter("price")));
            food.setCalories(Long.parseLong(request.getParameter("calories")));
            food.setDescription(request.getParameter("description"));

            FoodRegister foodRegister = new FoodRegister();
            foodRegister.foodRegister(food);
            System.out.println("end servlet");
    }



    public void foodRegister (Food food)
    {

       FoodService foodService=new FoodServiceImpl();
        foodService.insertFood(food);


    }
}
