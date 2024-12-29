package edu.nibm.limokiss_web_backend.service;

import edu.nibm.limokiss_web_backend.model.OrderCountsDTO;
import edu.nibm.limokiss_web_backend.model.OrderDto;

import java.util.List;

public interface OrderService {

    String createOrders(OrderDto orderDto);
     OrderDto getOrdersById(int id );
    List<OrderDto> getAllOrders();
    List<OrderDto> getAllOrdersByCusId(int id);
    boolean updateStatusById(int id , String status);
    boolean deleteOrderById(int id,String jwtToken);
    OrderCountsDTO getOrderCounts();
    Double getTotalPrice();
}
