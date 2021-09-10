package com.cursoapirest.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandarError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Instant timestamp;
    private Integer status;
    private String error ;
    private String message ;
    private String path ;

    public StandarError(){
    }
    public Instant getTimestamp() { return timestamp; }

    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }

    public Integer getStatus() { return status; }

    public void SetStatus(Integer status) { this.status = status;}

    public String getError() { return error; }

    public void setError(String error) { this.error = error;}

    public String getMessage() { return message; }

    public void setMessage(String Message) { this.message = message;}

    public void getPath() { return path;}

    public void setPath(String path) { this.path = path; }

}
