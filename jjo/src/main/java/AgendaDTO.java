import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties("edicao")
public class AgendaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("@hash")
    String hash;

    @JsonProperty("@id")
    Long id;

    @JsonProperty("nome")
    String nome;

    @JsonProperty("esfera")
    String esfera;

    @Override
    public String toString() {
        return "AgendaDTO{" +
                "hash='" + hash + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", esfera='" + esfera + '\'' +
                '}';
    }
}
