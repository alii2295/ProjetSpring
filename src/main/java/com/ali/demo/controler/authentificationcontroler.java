/*package com.ali.demo.controler;

import com.ali.demo.model.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authentification")
public class authentificationcontroler {
    @PostMapping("/connexion")
    public String login(User user , HttpSession session)
    {
        if ("user".equals(user.getUsername())&&("password".equals(user.getPassword())))
        {
            session.setAttribute("user",user);
            return ("connexion avec succès");

        }
        else
        {
            return ("connexion échouée");
        }

    }
    @PostMapping("/deconnexion")
    public String logout(HttpSession session)
    {
        session.invalidate();
        return("deconnexion avec succès");
    }

}

*/