package org.example.springboot_14.repo;

import org.example.springboot_14.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepo extends JpaRepository<Item, String> {

    @Query(value = "select iid from item",nativeQuery = true)
    List<String> findAllIIDs();

    @Query(value = "select * from item where iid = :iid",nativeQuery = true)
    Item getItemData(String iid);
}
