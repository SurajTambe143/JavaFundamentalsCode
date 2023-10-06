package polymorphismexample.methodoverriding.usinginterface;

public interface Cat {

    //Multiple defaults methods with same name cause Diamond problem
    default String identifyMyself() {
        return "I am a Cat.";
    }
}
