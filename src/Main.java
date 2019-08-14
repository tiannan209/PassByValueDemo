public class Main {

    public static void main(String[] args) {

        Balloon redBalloon = new Balloon("Red");
        Balloon blueBalloon = new Balloon("Blue");
        swap(redBalloon, blueBalloon);
        System.out.println("red after swap = "+redBalloon.getColor());
        System.out.println("blue after swap = "+blueBalloon.getColor());

        foo(blueBalloon);
        System.out.println("blue after foo = "+blueBalloon.getColor());

    }

    public static void swap(Object o1, Object o2){
        Object temp = o1; // red: 10 / temp: 10 / blue: 20
        o1 = o2; // red: 20 / temp: 10 / blue: 20
        o2 = temp; // red: 20 / temp: 10 / blue: 10
    }

    public static void foo(Balloon balloon){
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Blue");
    }
}
