
public abstract class Subject {
    private int math;
    private int physics;
    private int programming;
    private int english;

    public Subject(int math, int physics, int programming, int english) {
        this.math = math;
        this.physics = physics;
        this.programming = programming;
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getProgramming() {
        return programming;
    }

    public void setProgramming(int programming) {
        this.programming = programming;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
     
    abstract int calculation();
}
