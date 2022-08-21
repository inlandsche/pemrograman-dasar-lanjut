package program.generic.data;

public class Nilai <T>{
    private T data;

    public Nilai(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
