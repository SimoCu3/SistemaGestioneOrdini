import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestionOrder {

    private List<Order> orderList = new ArrayList<>();

    public List<Order> soutListOrder(){
        return orderList;
    }

    public void addOrder(Order o){
        orderList.add(o);
    }

    public List<Order> filterOrderByProduct(String prod){
        return orderList.stream().
                filter(p -> p.getProdotto()
                .equals(prod))
                .toList();
    }

    public int sumOrderProductByProduct(String prod){

        int tmpSumOrder = 0;

        for (int i = 0; i < orderList.size(); i++) {

            Order orderlist2 = orderList.get(i);

            if(orderlist2.getProdotto() == prod){

                tmpSumOrder ++;

            }
        }
        return tmpSumOrder;
    }

    public List<Order> ascendingOrderPrice(){
        return orderList.stream().sorted(Comparator.comparing(Order::getPrezzoProdotto)).toList();
    }

    public List<Order> descendingOrderPrice(){
        return orderList.stream().sorted(Comparator.comparing(Order::getPrezzoProdotto).reversed()).toList();
    }

    public List<Order> filterOrderByClient(String client){
        return orderList.stream()
                .filter(c -> c.getCliente()
                .equalsIgnoreCase(client))
                .toList();
    }

    @Override
    public String toString() {
        return "GestionOrder{" +
                "orderList=" + orderList +
                '}';
    }
}
