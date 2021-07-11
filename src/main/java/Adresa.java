public class Adresa {
    private String strada;
    private int bloc;

    public Adresa(String strada, int bloc) {
        this.strada = strada;
        this.bloc = bloc;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getBloc() {
        return bloc;
    }

    public void setBloc(int bloc) {
        this.bloc = bloc;
    }

    @Override
    public String toString() {
        return  strada +" nr " + bloc;
    }
}
