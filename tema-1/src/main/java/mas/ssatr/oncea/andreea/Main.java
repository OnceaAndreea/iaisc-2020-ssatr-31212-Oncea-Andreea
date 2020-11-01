package mas.ssatr.oncea.andreea;

public class Main {

    public static void main(String[] args) throws Exception {
        Simulator s1 = new Simulator(ModelFactory.loadTpnModelFromJsonFile("petrinet_tema1.json"));
        s1.start();
    }

}
