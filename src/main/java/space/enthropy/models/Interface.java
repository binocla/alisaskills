package space.enthropy.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interface implements Serializable {
    private static final long serialVersionUID = 3614123358222977560L;

    private Object screen;
    private Object payments;
    @JsonProperty("account_linking")
    private Object accountLinking;
    @JsonProperty("audio_player")
    private Object audioPlayer;
}
