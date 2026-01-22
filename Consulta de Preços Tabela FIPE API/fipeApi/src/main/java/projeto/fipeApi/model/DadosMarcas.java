package projeto.fipeApi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMarcas(@JsonAlias ("codigo") int codigo,
                          @JsonAlias ("nome")String descricao){

        @Override
        public String toString() {
            return "Cód: " + this.codigo +
                    " Descrição: " + this.descricao;
        }
    }

