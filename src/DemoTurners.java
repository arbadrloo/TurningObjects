public class DemoTurners {
    public static void main(String[] args) {
        Turner[] turners = new Turner[] {
                new Leaf(),
                new Page(),
                new Pancake(),
        };

        for (Turner turner : turners) {
            turner.turn();
        }
    }
}
