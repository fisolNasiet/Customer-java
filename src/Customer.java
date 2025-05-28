public class Customer {
    private int customerNo;
    private String name;
    private String surName;
    private String email;
    private String telephone;

    public Customer(int customerNo, String name, String surName, String email, String telephone) {
        this.customerNo = customerNo;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.telephone = telephone;
    }
    public String toString(){
        return "MusNo: " + getCustomerNo()+"\nAd: "+getName()+"\nSoyAd: "+getSurName()+"\nEposta: "+getEmail()+"\nTelNo: "+getTelephone();
    }

    public boolean eslesmeKontrol (String anahtarKalime){
        if (anahtarKalime.length() < 3){
            return anahtarKalime.substring(0,2).equalsIgnoreCase(getSurName().substring(0,2)) ||
                    anahtarKalime.equalsIgnoreCase(String.valueOf(getCustomerNo()));
        }else return anahtarKalime.substring(0,4).equalsIgnoreCase(getSurName().substring(0,4)) ||
                anahtarKalime.equalsIgnoreCase(String.valueOf(getCustomerNo()));

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCustomerNo() {
        return customerNo;
    }
}
