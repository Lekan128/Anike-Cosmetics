package ng.com.anikecosmetics.model.jumia.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorHead {
    @JsonProperty("RequestAction")
    private String requestAction;
    @JsonProperty("ErrorType")
    private String errorType;
    @JsonProperty("ErrorCode")
    private String errorCode;
    @JsonProperty("ErrorMessage")
    private String errorMessage;

    public String getRequestAction() {
        return requestAction;
    }

    public void setRequestAction(String requestAction) {
        this.requestAction = requestAction;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Head{" +
                "requestAction='" + requestAction + '\'' +
                ", errorType='" + errorType + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
