package org.example.Controller;

import org.example.dto.ItemDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/items")
public class ItemController {
    private List<ItemDTO> items = new ArrayList<>();

    @PostMapping(path = "save")
    public ItemDTO saveItem(@RequestBody ItemDTO itemDTO){
        items.add(itemDTO);
        return itemDTO;
    }

    @GetMapping(path = "getAll")
    public List<ItemDTO> getAllItems(){
        return items;
    }

    @PutMapping(path = "update")
    public ItemDTO updataItems(@RequestBody ItemDTO itemDTO){
        for(int i = 0; i<items.size(); i++){
            ItemDTO exitesitems = items.get(i);
            if (exitesitems.getId().equals(itemDTO.getId())) {
                exitesitems.setDescription(itemDTO.getDescription());
                exitesitems.setPrice(itemDTO.getPrice());
                exitesitems.setQuantity(itemDTO.getQuantity());
                return exitesitems;
            }
        }
        return itemDTO;
    }

    @DeleteMapping(path = "delete/{id}")
    public boolean deleteItem(@PathVariable("id") String id){
        for(int i = 0; i<items.size(); i++){
            ItemDTO exitesitems = items.get(i);
            if (exitesitems.getId().equals(id)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }
}
