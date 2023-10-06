package interfaceexample;

public class Square implements Dimensions{
    public void length(int l){
        System.out.println("length is "+l);
    }
    public void breath(int b){
        System.out.println("breath is "+b);
    }
}

//private to public