package com.gmail.v.varvaruk89.saveDataFromTheServerREST.repo;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMyDataRepository extends CrudRepository<GroupMyData, Long> {

}
