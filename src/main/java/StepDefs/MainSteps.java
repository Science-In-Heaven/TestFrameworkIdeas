package StepDefs;

public class MainSteps {

    public void printFormatedMsg(String ... args) {
        StringBuilder formated = new StringBuilder();
        for (String str:args) {
            formated.append("\n'%s'");
        }
        System.out.format("\n\nPrinting..." + formated, args);
    }
}
