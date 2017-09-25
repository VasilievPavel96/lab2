package lab2;

import java.util.ArrayList;
import java.util.List;

class Vertex {
    Vertex parent;
    List<Integer> value;
    List<Vertex> children = new ArrayList<>();

    public Vertex() {
    }

    public Vertex(Vertex parent, List<Integer> value) {
        this.parent = parent;
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
