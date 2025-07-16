package sp.senac.banco.controller.response;

import java.util.List;

public class ControllerResponse<T> {

    private String message;
    private String timestamp;
    private List<T> data;


    public ControllerResponse(){}

    public ControllerResponse(String message, List<T> data, String timestamp) {
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public ControllerResponse<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public ControllerResponse<T> setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public ControllerResponse<T> setData(List<T> data) {
        this.data = data;
        return this;
    }

}
