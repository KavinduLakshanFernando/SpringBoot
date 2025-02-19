package org.example.springboot_14.Controller;

import org.example.springboot_14.dto.ItemDTO;
import org.example.springboot_14.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin(origins = "http://localhost:63342")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping ("getAll")
    public List<ItemDTO> getAllItem(){
        return itemService.getAllItem();
    }

    @PostMapping("save")
    public String saveItem(@RequestBody ItemDTO itemDTO){
        itemService.addItem(itemDTO);
        return itemDTO.toString();
    }

    @PutMapping("update")
    public String updateItem(@RequestBody ItemDTO itemDTO){
        itemService.updateItem(itemDTO);
        return itemDTO.toString();
    }

    @DeleteMapping("delete/{iid}")
    public String deleteItem(@PathVariable String iid){
        itemService.deleteItem(iid);
        return "Deleted";
    }

}
