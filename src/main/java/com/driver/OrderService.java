package com.driver;

import java.util.List;

public class OrderService {

    OrderRepository orderRepository;
    public void addOrderService(Order order){
        orderRepository.addOrder(order);
    }
    public void addDeliveryPartnerService(String partnerId){
        orderRepository.addDeliveryPartner(partnerId);
    }
    public void addOrderPartnerPaidService(String partnerId, String orderId){
        orderRepository.addOrderPartnerPair(partnerId,orderId);
    }
    public Order getOrderByOrderIdService(String orderId){
        return orderRepository.getOrderByOrderId(orderId);
    }
    public DeliveryPartner getPartnerByPartneridService(String partnerId){
        return orderRepository.getPartnerByPartnerId(partnerId);
    }
    public int getNumberOfOrdersAssignedService(String partnerId){
        return orderRepository.getNumberOfOrdersAssigned(partnerId);
    }
    public List<String> getAllTheOrderService(String partnerId){
        return orderRepository.getAllTheOrdersOfAPartner(partnerId);
    }

    public List<String> getAllTheOrdersFromSystemService(){
        return orderRepository.getAllOrdersFromSystem();
    }
    public int getNotAssignedOrders(){
        return orderRepository.getNotAssignedOrders();
    }

    public int getCountOfUndeliveredOrdersService(String partnerId , String time){
        return orderRepository.getCountOfUndeliveredOrders(partnerId , time);
    }

    public String getLastTimeService(String partnerId){
        return orderRepository.getTheLastTime(partnerId);
    }

    public void deletePartnerByIdService(String partnerId){
        orderRepository.deletePartnerById(partnerId);
    }

    public void deleteOrderByIdService(String orderId){
        orderRepository.deleteOrderById(orderId);
    }
}
