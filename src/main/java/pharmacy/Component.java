package pharmacy;

public class Component {
    private String name;
    private int power;
    private String weight;

    public Component(String name, int power, String weight) {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }



    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", weight='" + weight + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    //    @Override
//    public boolean equals(Object o) {
//        Component t = (Component) o;
//
//        return t.power == this.power;
//    }


}
