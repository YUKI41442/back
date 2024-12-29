package edu.nibm.limokiss_web_backend.template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuccessfulResponsesMessage {
    private String status;
    private String message;

}
