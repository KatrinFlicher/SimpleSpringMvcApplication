package com.javamaster.controller;

import com.javamaster.domain.Order;
import com.javamaster.service.OrderService;
import com.javamaster.service.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderController {
    OrderService service = new OrderServiceImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getOrderPage(Model model){
        List<Order> orders = service.getAll();
        model.addAttribute("orderList", orders);
        return "order";
    }


    @RequestMapping(value = "/add-new-order", method = RequestMethod.GET)
    public String addNewOrderPage(Model model){
        return "addNewOrder";
    }

    @RequestMapping(value = "/add-new-order", method = RequestMethod.POST)
    public String addNewOrder(@RequestParam(value = "title") String title, @RequestParam(value = "price") Double price){
        Order order = new Order();
        order.setTitle(title);
        order.setPrice(price);
        service.save(order);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteOrder(@PathVariable Integer id){
        Order order = service.getById(id);
        service.delete(order);
        return "redirect:/";
    }


}
