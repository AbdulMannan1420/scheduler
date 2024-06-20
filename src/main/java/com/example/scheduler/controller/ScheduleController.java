package com.example.scheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class ScheduleController {

    @GetMapping("/schedule")
    public String getSchedule(Model model) {
        model.addAttribute("schedule", "This is the schedule page");
        return "schedule";
    }
}
