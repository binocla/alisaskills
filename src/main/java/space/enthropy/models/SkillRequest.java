package space.enthropy.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkillRequest implements Serializable {
    private static final long serialVersionUID = -1379090151092106703L;

    private Meta meta;
    private Request request;
    private String version;
}
