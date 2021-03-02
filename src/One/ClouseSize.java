package One;

public enum ClouseSize  {
    XXS("XXS"),XS("XS"),S("S"),M("M"),L("L");

    String euroSize;

    ClouseSize() {
    }

    ClouseSize(String euroSize) {
        this.euroSize = euroSize;
    }

    public String getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(String euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "ClouseSize{" +
                "euroSize='" + euroSize + '\'' +
                "} " + super.toString();
    }

}
