package space.enthropy.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta implements Serializable {
    private static final long serialVersionUID = -4214300852193008870L;

    private String locale;
    private String timezone;
    @JsonProperty("client_id")
    private String clientId;
    private Interface interfaces;
}
