package jenishewan;

public class Hewan {
    private String jenisSuara;

    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    public void bersuara() {
        System.out.println("Suara hewan: " + jenisSuara);
    }

    public boolean isMamalia() {
        return false;
    }
}

