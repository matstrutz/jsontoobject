import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"versao", "requisicaoStatus"})
public class UnnusedDTO {

    @JsonProperty("agenda")
    List<AgendaDTO> agenda = new ArrayList<>();

    public UnnusedDTO() {
    }
}
