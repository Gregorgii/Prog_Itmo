package src.interaction;

import java.io.Serializable;

/**
 * CLass for get response value.
 */
public class Response implements Serializable {
    private final ResponseResult responseResult;
    private final String responseBody;


    public Response(ResponseResult responseResult, String responseBody) {
        this.responseResult = responseResult;
        this.responseBody = responseBody;
    }

    /**
     * getter for result
     * @return Response result
     */
    public ResponseResult getResponseResult(){
        return responseResult;
    }

    /**
     * getter for result body
     * @return Response body
     */
    public String getResponseBody(){
        return responseBody;
    }

    @Override
    public String toString(){
        return "Response["+ responseResult+", "+responseBody+"]";
    }
}
