package design.patterns.proxypattern;

import java.rmi.Naming;

/**
 * Ibodulla Ibodullaev created on 3/18/2020 inside the package - design.patterns.proxypattern
 */
public class DemoReportGenerator {

    public static void main(String[] args) {
        new DemoReportGenerator().generateReport();
    }

    public void generateReport() {
        try {
            ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
            System.out.println(reportGenerator.generateDailyReport());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}