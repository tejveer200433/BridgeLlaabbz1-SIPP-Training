package inherit;


class Order {
 String orderId;
 String orderDate;

 public Order(String orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 public String getOrderStatus() {
     return "Order Placed";
 }
}

class ShippedOrder extends Order {
 String trackingNumber;

 public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 
 public String getOrderStatus() {
     return "Order Shipped (Tracking: " + trackingNumber + ")";
 }
}

class DeliveredOrder extends ShippedOrder {
 String deliveryDate;

 public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }


 public String getOrderStatus() {
     return "Order Delivered on " + deliveryDate;
 }
}

public class OrderManagement {
 public static void main(String[] args) {
     Order order = new Order("ORD001", "2023-01-15");
     ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2023-01-16", "TRK12345");
     DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2023-01-17", "TRK67890", "2023-01-20");

     System.out.println("--- Online Retail Order Management ---");
     System.out.println(order.getOrderStatus());
     System.out.println(shippedOrder.getOrderStatus());
     System.out.println(deliveredOrder.getOrderStatus());
 }
}