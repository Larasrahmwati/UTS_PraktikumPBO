package jenishewan;

public class Kucing extends Hewan {
    public Kucing() {
        super("Meong");
    }

    @Override
    public boolean isMamalia() {
        return true;
    }
}

