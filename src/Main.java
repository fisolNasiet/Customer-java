import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerManagerLinkList customerManagerLinkList = new CustomerManagerLinkList();
        while (true){
            System.out.println("Müşteri Yönetimi Menüsü:");
            System.out.println("1. Müşteri Ekle");
            System.out.println("2. Müşterileri Sıralı Listele (Müşteri Numarasına Göre)");
            System.out.println("3. Müşterileri Normal Listele");
            System.out.println("4. Müşteri Ara");
            System.out.println("5. Müşteri Sil");
            System.out.println("6. Çıkış");
            System.out.print("Bir seçenek seçin: ");
            int secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim){
                case 1:
                    System.out.print("Adınızı girin: ");
                    String ad = scanner.nextLine();
                    System.out.print("Soyadınızı girin: ");
                    String soyad = scanner.nextLine();
                    System.out.print("E-posta adresinizi girin: ");
                    String eposta = scanner.nextLine();
                    System.out.print("Telefon numaranızı girin: ");
                    String telefon = scanner.nextLine();
                    System.out.print("Tc numara girin: ");
                    int musterNo = scanner.nextInt();
                    Customer yeniMusteri = new Customer(musterNo,ad,soyad,eposta,telefon);
                    customerManagerLinkList.insertToHead(yeniMusteri);
                    break;
                case 2:
                    customerManagerLinkList.listCustomersInOrder();
                    break;
                case 3:
                    customerManagerLinkList.listCustomerNormally();
                    break;
                case 4:
                    System.out.print("Aranacak müşteri bilgisini girin: ");
                    String anahtarKelime = scanner.nextLine();
                    System.out.println(customerManagerLinkList.searchCustomer(anahtarKelime));
                    break;
                case 5:
                    System.out.print("Silinecek müşterinin numarasını girin: ");
                    customerManagerLinkList.deleteCustomer();
                    break;
                case 6:
                    System.out.println("Müşteri Yönetimi Uygulaması'ndan Çıkılıyor.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
            }
        }




    }
}