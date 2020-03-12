package design.patterns.factorydesignpattern;

/**
 * Ibodulla Ibodullaev created on 3/6/2020 inside the package - designpatterns.factorydesignpattern
 */
public class SelectNetworkFactory {
    public CellularPlan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("aNetwork")){
            return new aNetwork();
        }
        if(planType.equalsIgnoreCase("bNetwork")){
            return new bNetwork();
        }
        if(planType.equalsIgnoreCase("cNetwork")){
            return new cNetwork();
        }
        return null;
    }
}