package Base;

@SuppressWarnings("ALL") // Ошибок быть не должно, так и задумывалось)
public class Toy implements Comparable<Toy> {
    public int id;
    public String name;
    public int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Номер игрущки:" + id + " Имя: " + name + " Вес: " + weight;
    }

    public int compareTo(Toy o) {
        return o.getWeight() - this.getWeight();
    }
}
