package designPattern;

public class FactoryPattern {
    public OS getInstance(String s){
        if(s.equals("open"))
            return new Android();
        if(s.equals("close"))
            return new IOS();
        else return new Windows();
    }
}
