import java.util.Random;

public class Mekan {
    String name;
    Canavar canavar;
    boolean eşya;
    Karakter karakter;
    
    Mekan(String name, Canavar canavar, boolean eşya){
        this.canavar=canavar;
        this.name=name;
        this.eşya=eşya;
    }
    
    public int canavarSayisi(){
    public int canavarSayisi(){
        Random rand = new Random();
        int sayi = rand.nextInt(3)+1;
        return sayi;
        return sayi;
    }
    public void savasGanimet(Karakter karakter, int i){
        System.out.println(i+". düşman");
        System.out.println("---------");
    public void savasGanimet(Karakter karakter, int i){
        System.out.println(i+". düşman");
        System.out.println("---------");
        System.out.println("Oyuncu sağlığı:" + karakter.saglik + "Canavar sağlığı:" + canavar.saglik);
        int temp=canavar.saglik;
        while(canavar.saglik>0 && karakter.saglik>0){
            canavar.saglik-=karakter.etki;
            karakter.saglik-=canavar.etki;
        int temp=canavar.saglik;
        while(canavar.saglik>0 && karakter.saglik>0){
            canavar.saglik-=karakter.etki;
            karakter.saglik-=canavar.etki;
        }
        System.out.println("Oyuncu sağlığı:" + karakter.saglik + "Canavar sağlığı:" + canavar.saglik);
        System.out.println("===========");
        canavar.saglik=temp;
    }
}
