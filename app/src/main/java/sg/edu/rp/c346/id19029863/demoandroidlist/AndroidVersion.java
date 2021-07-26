package sg.edu.rp.c346.id19029863.demoandroidlist;

public class AndroidVersion {

    private String version;
    private String name;

    public AndroidVersion(String name, String version) {
        this.version = version;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return name + ": " + version;
    }
}