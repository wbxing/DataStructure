package chapter3.e3_9.ProvinceAndCity;

public class Province {
    private int pid;
    private String name;
    private City [] cities;

    public Province() {}
    public Province(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public City[] getCities() {
        return cities;
    }

    public String getInfo() {
        return "省份编号：" + this.pid + "，名称：" + this.name;
    }
}
