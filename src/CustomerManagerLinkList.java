public class CustomerManagerLinkList {
    Link head;
    public CustomerManagerLinkList() {
        this.head = null;
    }
    public void insertToHead(Customer customer){
        Link newLink = new Link(customer);
        newLink.next = head;
        head = newLink;
    }
    public void listCustomerNormally(){
        System.out.println("Liste:");
        Link current = head;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
    public void listCustomersInOrder(){
        boolean swapped;
        Link current;
        if (this.head == null){
            return;
        }
        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.customer.getCustomerNo() > current.next.customer.getCustomerNo()) {
                    Customer temp = current.customer;
                    current.customer = current.next.customer;
                    current.next.customer = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        Link current1 = head;
        while (current1 != null){
            current1.displayLink();
            current1 = current1.next;

        }
        System.out.println();
    }
    public void deleteCustomer(){
        Link temp= head;
        while (temp != null){
            head=head.next;
            System.out.println(temp.customer);
        }
    }
    public Customer searchCustomer(String surName){
        Link current = head;
        while (current != null){
            if (current.customer.eslesmeKontrol(surName)) {
                break;
            }
            current = current.next;
        }
        return current.customer;
    }
}
