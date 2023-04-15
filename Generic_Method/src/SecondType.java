
public class SecondType extends Subject{

    public SecondType(int math, int physics, int programming, int english) {
        super(math, physics, programming, english);
    }

    @Override
    int calculation() {
        return (getMath() * 6 + getPhysics() * 3 + getProgramming() * 8 + getEnglish() * 2 );
        
    }
    
}
