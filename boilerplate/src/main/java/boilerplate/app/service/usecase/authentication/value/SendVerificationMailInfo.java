package boilerplate.app.service.usecase.authentication.value;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SendVerificationMailInfo {

    private String email;

    private String token;
}
