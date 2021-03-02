package Two;

public enum Stat {
    Cholovicha("Cholovicha"), Jinocha("Jinocha");
    String stat;

    Stat() {
    }

    Stat(String stat) {
        this.stat = stat;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return stat;
    }
}
