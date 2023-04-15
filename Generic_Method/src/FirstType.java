
public class FirstType extends Subject{

    public FirstType(int math, int physics, int programming, int english) {
        super(math, physics, programming, english);
    }

    @Override
    int calculation() {
        return (getMath() * 5 + getPhysics() * 4 + getProgramming() * 7 + getEnglish() * 3 );
    }
    
}
