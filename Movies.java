public class Movies {
    private String name;
    private int id;
    public Movies(String name, int id) {
        this.setName(name);
        this.setId(id);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
