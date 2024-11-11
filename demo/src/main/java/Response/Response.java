package Response;

public class Response<T> {
    private int code;
    private T data;
    private String message;
    private boolean success;

    public Response(int code, T data, String message, boolean success) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.success = success;
    }

    // Getters and Setters
}