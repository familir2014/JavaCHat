package Server;

import java.util.ArrayList;

interface IAuthService {
    void start();
    void stop();
    ArrayList<String> getUsersList();
    String addLoginPass(String login, String pass);
    void deleteByLogin(String login);
    String getNickByLoginPass(String login, String pass);
}
