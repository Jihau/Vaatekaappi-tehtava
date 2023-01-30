import com.adidas.*;

public class Main {
    public static void main(String[] args) {
        Person jasper = new Person();
        ClothesFactory adidasFactory = new AdidasClothesFactory();
        ClothesFactory bossFactory = new BossClothesFactory();

        System.out.println("Jasper opiskelee ja kayttaa Adidaksen vaatteita. Tassa ne ovat:");
        jasper.putOn(adidasFactory);
        jasper.whatAmIWearing();

        System.out.println("Jasper valmistui nyt insinooriksi ja on aika vaihtaa parempiin. Bossin merkit kelpaavat ainoastaan ja paalta loytyy:");
        jasper.putOn(bossFactory);
        jasper.whatAmIWearing();
    }
}