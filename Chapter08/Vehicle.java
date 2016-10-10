
public abstract class Vehicle {


    private boolean isMoving;

    public boolean getIsMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean val) {
        this.isMoving = val;
    }

    public int turn(int degrees) {
        return 0;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void slowDown();

    public abstract void speedUp();

}