package org.example.springboot_13.service;

import org.example.springboot_13.dto.ItemDTO;
import org.example.springboot_13.entity.Item;
import org.example.springboot_13.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public List<ItemDTO> getAllItem() {
        List<Item> items = itemRepo.findAll();
        return items.stream().map(item -> new ItemDTO(item.getIid(),item.getDescription(), item.getU_Price(), item.getQty())).toList();
    }

    public void addItem(ItemDTO itemDTO) {
        Item item = new Item(itemDTO.getIid(), itemDTO.getDescription(), itemDTO.getU_Price(), itemDTO.getQty());
        itemRepo.save(item);
    }

    public void updateItem(ItemDTO itemDTO) {
        Item item = new Item(itemDTO.getIid(), itemDTO.getDescription(), itemDTO.getU_Price(), itemDTO.getQty());
        itemRepo.save(item);
    }

    public void deleteItem(String iid) {
        itemRepo.deleteById(iid);

    }
}
