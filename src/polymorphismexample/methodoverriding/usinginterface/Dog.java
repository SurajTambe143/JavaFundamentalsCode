package polymorphismexample.methodoverriding.usinginterface;

    public interface Dog {
        default String identifyMyself() {
            return "I am a Dog.";
        }
    }
