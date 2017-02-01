
public class Euro implements Value{

    private int value;

    public Euro(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
