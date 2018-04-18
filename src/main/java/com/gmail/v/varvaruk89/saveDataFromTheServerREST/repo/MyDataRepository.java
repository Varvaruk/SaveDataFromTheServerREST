package com.gmail.v.varvaruk89.saveDataFromTheServerREST.repo;


import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.MyData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDataRepository extends CrudRepository<MyData, Long> {

}
