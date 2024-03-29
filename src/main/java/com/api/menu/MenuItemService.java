package com.api.menu;

import org.springframework.stereotype.Service;

@Service
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    // TODO: Put in exception handling
    public MenuItem findByName(String name) {
        return menuItemRepository.findByName(name);
    }

}
