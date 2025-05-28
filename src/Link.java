public class Link {
    Customer customer;
    Link next;

    public Link(Customer customer) {
        this.customer = customer;
    }

    public void displayLink(){
        System.out.println(customer);
    }
}
