package ie.atu.orderservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {
    private int orderId;
    private int productId;
    private int quantity;
    private int customerId;

}
