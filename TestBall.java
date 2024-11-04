public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 10, 5, 45);
        System.out.println("Initial Ball: " + ball);

        // Move the ball
        ball.move();
        System.out.println("After move: " + ball);

        // Reflect horizontally
        ball.reflectHorizontal();
        ball.move();
        System.out.println("After reflectHorizontal and move: " + ball);

        // Reflect vertically
        ball.reflectVertical();
        ball.move();
        System.out.println("After reflectVertical and move: " + ball);
    }
}