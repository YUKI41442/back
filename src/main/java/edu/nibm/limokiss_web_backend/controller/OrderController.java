package edu.nibm.limokiss_web_backend.controller;

import edu.nibm.limokiss_web_backend.model.OrderCountsDTO;
import edu.nibm.limokiss_web_backend.model.OrderDto;
import edu.nibm.limokiss_web_backend.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public String createOrders(@RequestBody OrderDto orderDto) {
        return orderService.createOrders(orderDto);
    }

    @GetMapping("/{id}")
    public OrderDto getOrdersById(@PathVariable int id) {
        return orderService.getOrdersById(id);
    }

    @GetMapping("cus/{id}")
    public List<OrderDto> getAllOrdersByCusId(@PathVariable int id) {
        return orderService.getAllOrdersByCusId(id);
    }

    @GetMapping
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PutMapping("/{id}/{status}")
    public boolean updateStatusById(@PathVariable int id, @PathVariable String status) {
        return orderService.updateStatusById(id, status);
    }

    @DeleteMapping("/{id}")
    public boolean deleteOrderByOderId(@PathVariable int id,  @RequestHeader("Authorization") String authorizationHeader ) {
        String jwt = authorizationHeader.startsWith("Bearer ")
                ? authorizationHeader.substring(7)
                : authorizationHeader;
        return orderService.deleteOrderById(id, jwt);
    }

    @GetMapping("/count")
    public OrderCountsDTO getOrderCounts() {
        return orderService.getOrderCounts();
    }
    @GetMapping("/price")
   public Double getTotalPrice(){
        return orderService.getTotalPrice();
    }
}
