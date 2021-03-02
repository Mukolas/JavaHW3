package One;

public class Futbolka extends Clouses implements ManClouses,WomanClouses {
    @Override
    public void VdyagnutyCholovika() {
        System.out.println("Cholovik vdyagnutyy");
    }

    @Override
    public void VdyagnutyJinku() {
        System.out.println("Jinka vdyagnuta");
    }
}
