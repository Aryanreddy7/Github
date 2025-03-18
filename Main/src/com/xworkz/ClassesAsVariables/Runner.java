package com.xworkz.ClassesAsVariables;

public class Runner {
    public static void main(String[] args) {
        Display display = new Display();
        Shop shop = new Shop();
        shop.ads(display);
        System.out.println("==============================");
        Theater theater=new Theater();
        Poster poster=new Poster();
        theater.show(poster);
        System.out.println("==============================");
        IplCup iplCup=new IplCup();
        Rcb rcb= new Rcb();
        rcb.Winner(iplCup);
        System.out.println("==============================");
        Rocket rocket=new Rocket();
        Space space=new Space();
        space.fly(rocket);
        System.out.println("==============================");
        Tablet tablet=new Tablet();
        Dolo650 dolo650=new Dolo650();
        dolo650.takePill(tablet);
        System.out.println("==============================");
        Hair hair=new Hair();
        Barber barber=new Barber();
        barber.hairCut(hair);
        System.out.println("==============================");
        Phone phone=new Phone();
        Camera camera=new Camera();
        camera.on(phone);
        System.out.println("==============================");
        Variety variety=new Variety();
        Mango mango=new Mango();
        mango.taste(variety);
        System.out.println("==============================");
        Bed bed=new Bed();
        Pillow pillow=new Pillow();
        pillow.lean(bed);



    }
}
