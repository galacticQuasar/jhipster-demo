package com.mochico.bugtracker.cucumber;

import com.mochico.bugtracker.BugtrackApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BugtrackApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
