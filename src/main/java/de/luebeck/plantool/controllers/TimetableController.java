package de.luebeck.plantool.controllers;

import de.luebeck.plantool.repositories.TimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TimetableController {
    private final TimetableRepository timetableRepository;

    @Autowired
    public TimetableController(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }
}
