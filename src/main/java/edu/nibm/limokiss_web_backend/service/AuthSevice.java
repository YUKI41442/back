package edu.nibm.limokiss_web_backend.service;

import edu.nibm.limokiss_web_backend.model.UpdatePasswordDto;
import edu.nibm.limokiss_web_backend.model.User;
import edu.nibm.limokiss_web_backend.template.SuccessfulResponsesData;
import edu.nibm.limokiss_web_backend.template.SuccessfulResponsesMessage;

public interface AuthSevice {
    SuccessfulResponsesData login(String email , String password);
    SuccessfulResponsesMessage registerUser(User user);

    boolean validateToken(String token, String email);
   boolean updatePassword(int id, UpdatePasswordDto updatePasswordDto);
    boolean updateOfflineStatus(int id);
    boolean updateAccountStatus(int id , String jwt , String status);
}
