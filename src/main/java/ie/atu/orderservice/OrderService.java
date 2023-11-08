package ie.atu.orderservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    private ArrayList <OrderInfo>orderInfo = new ArrayList<OrderInfo>();
    public void addOrderInfo(OrderInfo OrderInfo){
        orderInfo.add(orderInfo);
        System.out.println("OrderId" +orderInfo.getorderId());
        System.out.println(("productId " + orderInfo.getproductId());
        public ArrayList<OrderInfo> getOrderInfo(){
            System.out.println("Returning Orders");
            return orderInfo;
        }
    }
}
