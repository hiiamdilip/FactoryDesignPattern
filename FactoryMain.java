package designPattern;

public class FactoryMain {
    public static void main(String[] args){
        FactoryPattern o = new FactoryPattern();
        OS ob = o.getInstance("open");
        ob.spec();
    }
}
