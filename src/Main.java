public class Main {
    public static void main(String[] args) {
        Box<String, Integer> box1 = new Box<>("Amir", 21);
        Box<Character, Integer> box2 = new Box<>('!', 25);
        System.out.println(box1.getKey() + " - " + box1.getObj());
        box2.setKey('?');
        box2.setObj(16);
        System.out.println(box2.getKey() + " " + box2.getObj());
    }
}
