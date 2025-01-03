package dev.example.restaurantManager.service;

import dev.example.restaurantManager.model.MenuRestaurant;
import java.util.List;

public interface MenuRestaurantService {
    List<MenuRestaurant> getAllMenus();
    MenuRestaurant createMenu(MenuRestaurant menu);
    MenuRestaurant getMenuById(String id);
    MenuRestaurant updateMenu(String id, MenuRestaurant menuDetails);
    boolean deleteMenu(String id);
    long countMenus();
    MenuRestaurant addMenuItemToMenu(String menuId, String menuItemId);
    MenuRestaurant removeMenuItemFromMenu(String menuId, String menuItemId);
}