package app.util;

import app.inbox.Inbox;

/**
 * Created by winnerawan on 1/27/17.
 */
public class ServerResponse {

    private int status;
    private String message;
    private Object result;

    public ServerResponse() { }

    public ServerResponse(int status, String message)
    {
        this.status = status;
        this.message = message;
    }

    public ServerResponse(int status, String message, Inbox result)
    {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
