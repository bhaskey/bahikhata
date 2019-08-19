package in.taskoo.bahikhata.order.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class OrderDetail {
    private Long orderId;
    private Long priceId;
    private Long discountId;
    private Integer quantity;
    private String orderDevice;
}