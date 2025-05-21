public class Main {
    public static void main(String[] args) {

        Reine reine = new Reine(3, 3);
        Position testPosition = new Position(3, 10);

        if(reine.isValidMove(testPosition)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }

    }
}