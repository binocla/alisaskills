package space.enthropy.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Markup implements Serializable {
    private static final long serialVersionUID = 8581734860350185847L;

    @JsonProperty("dangerous_context")
    private Boolean dangerousContext;
}
