package de.luebeck.plantool.controllers;

import de.luebeck.plantool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){this.userRepository = userRepository;};
}
