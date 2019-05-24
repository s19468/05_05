/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie5;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(0, "Tomasz", 20);
        Invoice invoice = new Invoice(0, customer, 1000);

        System.out.println(invoice.getCustomer().toString());
        System.out.println("Name: " + customer.getName());
        System.out.println("Discount: " + customer.getDiscount() + "%");
        System.out.println("Amount after discount: " + invoice.getAmountAfterDiscount());
    }
}
