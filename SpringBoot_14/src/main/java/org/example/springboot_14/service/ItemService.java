package org.example.springboot_14.service;

import org.example.springboot_14.dto.ItemDTO;
import org.example.springboot_14.entity.Item;
import org.example.springboot_14.repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<ItemDTO> getAllItem() {
//        List<Item> items = itemRepo.findAll();
//        return items.stream().map(item -> new ItemDTO(item.getIid(),item.getDescription(), item.getU_Price(), item.getQty())).toList();

        return modelMapper.map(itemRepo.findAll(),new TypeToken<List<ItemDTO>>(){}.getType());
    }

    public void addItem(ItemDTO itemDTO) {
//        Item item = new Item(itemDTO.getIid(), itemDTO.getDescription(), itemDTO.getU_Price(), itemDTO.getQty());

        Item item = modelMapper.map(itemDTO,Item.class);
        itemRepo.save(item);
    }

    public void updateItem(ItemDTO itemDTO) {
//        Item item = new Item(itemDTO.getIid(), itemDTO.getDescription(), itemDTO.getU_Price(), itemDTO.getQty());
        Item item = modelMapper.map(itemDTO,Item.class);
        itemRepo.save(item);
    }

    public void deleteItem(String iid) {
        itemRepo.deleteById(iid);

    }

    public List<String> getAllItemIDs() {
        return itemRepo.findAllIIDs();
    }

    public ItemDTO getItemData(String iid) {
        return modelMapper.map(itemRepo.getItemData(iid),ItemDTO.class);
    }
}
