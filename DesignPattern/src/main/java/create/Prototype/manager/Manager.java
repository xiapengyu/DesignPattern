package create.Prototype.manager;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Shape> m = new HashMap<>();

    public Manager() {
        m.put("Circle", new Circle());
        m.put("Round", new Round());
    }

    public void addShape(String key, Shape obj) {
        m.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape shape = m.get(key);
        return (Shape) shape.clone();
    }


}
