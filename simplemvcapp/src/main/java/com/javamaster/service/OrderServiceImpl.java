package com.javamaster.service;

import com.javamaster.domain.Order;
import com.javamaster.repository.OrderRepository;
import com.javamaster.repository.OrderRepositoryImpl;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderRepository repository = new OrderRepositoryImpl();

    public void save(Order order) {
        if(order != null){
            List<Order> orders = repository.getAll();
            if (!orders.isEmpty()){
                Order orderLast = orders.get(orders.size()-1);
                order.setId(orderLast.getId()+1);
            }
            repository.save(order);
        }
        else throw new IllegalArgumentException();
    }

    public void delete(Order order) {
        if (order != null){
            repository.delete(order);
        }
        else throw new IllegalArgumentException();
    }

    public List<Order> getAll() {
        return repository.getAll();
    }

    public Order getById(Integer id) {
        if (id!= null){
            return repository.getById(id);
        }
        else throw  new IllegalArgumentException();
    }
}
