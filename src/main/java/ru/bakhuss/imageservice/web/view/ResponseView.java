package ru.bakhuss.imageservice.web.view;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseView {
    public String result;
    public Object data;

    public ResponseView() {
        result = "success";
    }

    public ResponseView(Object data) {
        this.data = data;
    }
}
