import java.util.List;

public class Subscribers implements Observer {
    private final String name;

    public Subscribers(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> records) {
        System.out.println("Dear " + name + ". Added new record " + records);
    }
}
