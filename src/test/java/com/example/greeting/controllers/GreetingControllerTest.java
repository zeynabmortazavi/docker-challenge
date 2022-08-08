package com.example.greeting.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = {GreetingController.class})
class GreetingControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/helloWorld"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Stranger")));
    }

    @Test
    void shouldReturnAuthoName() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/author"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Zeynab Mortazavi")));
    }
}