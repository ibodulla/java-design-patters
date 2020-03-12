package design.patterns.singleton.exmaple2;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.singleton.exmaple2
 */
public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if(sc==null){
            synchronized(SingletonLazyDoubleCheck.class){
                if(sc==null){
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}