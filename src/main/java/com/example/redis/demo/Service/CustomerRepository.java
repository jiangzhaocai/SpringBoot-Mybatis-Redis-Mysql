package com.example.redis.demo.Service;

import com.example.redis.demo.Domain.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

//泛型的参数分别是实体类型和主键类型
public interface CustomerRepository extends ElasticsearchRepository<Customer,String>{

    public List<Customer> findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

}
