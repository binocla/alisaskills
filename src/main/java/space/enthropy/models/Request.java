package space.enthropy.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Request implements Serializable {
    private static final long serialVersionUID = -4339188311926484626L;

    @NotBlank
    private String command;
    @JsonProperty("original_utterance")
    @NotBlank
    private String originalUtterance;
    private Markup markup;
    private Object payload;
    private String type;
}
