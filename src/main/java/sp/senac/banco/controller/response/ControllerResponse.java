package sp.senac.banco.controller.response;

import java.util.List;

public class Response<T> {

    private String message;
    private List<T> data;
    private Integer status;
    private String timestamp;

    public Response(){}

    public Response(String message, List<T> data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public Response<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public Response<T> setData(List<T> data) {
        this.data = data;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Response<T> setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Response<T> setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
