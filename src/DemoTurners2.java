public class DemoTurners2 {
    public static void main(String[] args) {
        Turner[] turners = new Turner[] {new Leaf(),new Page(),new Pancake(),
                new Window(), new Wheel()};

        for (Turner turner : turners) {
            turner.turn();
        }
    }
}
