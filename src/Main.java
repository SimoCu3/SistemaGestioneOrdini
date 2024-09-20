import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Istanze Prodotto
        Order order1 = new Order("Simone","iPhone",2,2000);
        Order order2 = new Order("Marco","iPhone",1,1000);
        Order order3 = new Order("Luca","Samsung",3,3000);
        Order order4 = new Order("Giovanna","Laptop",1,1500);
        Order order5 = new Order("Giorgia","Samsung",4,4000);
        Order order6 = new Order("Luca","iPHone",1,1000);

        //Add product
        GestionOrder gestionOrder = new GestionOrder();
        gestionOrder.addOrder(order1);
        gestionOrder.addOrder(order2);
        gestionOrder.addOrder(order3);
        gestionOrder.addOrder(order4);
        gestionOrder.addOrder(order5);
        gestionOrder.addOrder(order6);


        //Mostrare tutti gli ordini.
        System.out.println("Prodotti presenti nell'ordine: \n" + gestionOrder.soutListOrder() + "\n");

        //Filtrare gli ordini per prodotto.
        System.out.println("Ordini filtrati in base a prodotto: \n" +gestionOrder.filterOrderByProduct("iPhone") + "\n");

        //Calcolare il totale delle vendite per un prodotto specifico.
        System.out.println("Numero prodotti presenti:\n" + gestionOrder.sumOrderProductByProduct("Laptop") + "\n");

        //Ordinare gli ordini per quantità in ordine crescente e decrescente.
        System.out.println("Ordini in ordine crescente:\n" + gestionOrder.ascendingOrderPrice() + "\n");
        System.out.println("Ordini in ordine decrescente:\n" + gestionOrder.descendingOrderPrice() + "\n");

        //Elencare tutti i clienti che hanno ordinato un determinato prodotto.
        System.out.println("Ordini filtrati in base al cliente:\n" + gestionOrder.filterOrderByClient("luca") + "\n");
    }
}