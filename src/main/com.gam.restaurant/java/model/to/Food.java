package model.to;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="table_name")
@Table(name = "food")
@SequenceGenerator(name ="seq_food",sequenceName = "seq_food",allocationSize = 1)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "seq_food")
    private long id;
    @Column(name="food_id")
    private long foodId;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private long price;
    @Column(name="description")
    private String description;
    @Column(name="calories")
    private long calories;
    @Enumerated(EnumType.STRING)
    private MealCategory mealCategory;
    @Enumerated(EnumType.STRING)
    private Cuisine cuisine;
    @Enumerated (EnumType.STRING)
    private Cook cook;

    public static enum MealCategory {
        APPETIZER,
        MAIN_COURCE,
        DESSERT;


    }
    public static enum Cuisine{
        IRANIN,
        ARABIC,
        INDIAN;
    }
    public static enum Cook{
        Raw,
        MEDIUM,
        BAKE;
    }

    public MealCategory getMealCategory() {
        return mealCategory;
    }

    public void setMealCategory(MealCategory mealCategory) {
        this.mealCategory = mealCategory;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFoodId() {
        return foodId;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCalories() {
        return calories;
    }

    public void setCalories(long calories) {
        this.calories = calories;
    }

}

