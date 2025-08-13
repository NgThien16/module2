package ss6_inheritance.exercise;

public class MovablePoint extends Point2D {
    private float xSpeed= 0.0f;
    private float ySpeed= 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }
    public MovablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    public void setSpeed(float[] speed){
        this.xSpeed= speed[0];
        this.ySpeed= speed[1];
    }
    public String toString(){
        return "("+getX()+","+getY()+")"+"speed="+xSpeed+","+ySpeed;
    }
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
    public static void main(String[] args) {
        // 1. Test constructor không tham số
        MovablePoint mp1 = new MovablePoint();
        System.out.println("Test 1 (default): " + mp1);

        // 2. Test constructor với xSpeed và ySpeed
        MovablePoint mp2 = new MovablePoint(2.5f, 3.5f);
        System.out.println("Test 2 (xSpeed,ySpeed): " + mp2);

        // 3. Test constructor đầy đủ tham số
        MovablePoint mp3 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Test 3 (x,y,xSpeed,ySpeed): " + mp3);

        // 4. Test getter/setter xSpeed, ySpeed
        mp3.setxSpeed(5.0f);
        mp3.setySpeed(6.0f);
        System.out.println("Test 4 (after set speed): xSpeed=" + mp3.getxSpeed() + ", ySpeed=" + mp3.getySpeed());

        // 5. Test getSpeed() và setSpeed()
        float[] speedArray = mp3.getSpeed();
        System.out.println("Test 5 (getSpeed): [" + speedArray[0] + ", " + speedArray[1] + "]");
        mp3.setSpeed(new float[]{10.0f, 20.0f});
        System.out.println("Test 5 (after setSpeed): " + mp3);

        // 6. Test move()
        MovablePoint mp4 = new MovablePoint(1.0f, 1.0f, 2.0f, 3.0f);

        System.out.println("Before move: " + mp4);
        mp4.move();
        System.out.println("After move (1st time): " + mp4);
        mp4.move();
        System.out.println("After move (2nd time): " + mp4);
    }

}
