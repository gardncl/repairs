package com.example.repairs.controllers;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;


    /**
     * Tests the return content of the url '/hello' when no name parameter is passed
     * @throws Exception
     */
    @Test
    void getGreetingWithoutName() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content()
                .string("Hello World")).andReturn();
    }

    /**
     * Tests the return content of the url '/hello?name=[name]' where [name] is replaced by
     * any string value.
     * @throws Exception
     */
    @Test
    void getGreetingWithName() throws Exception {
        mockMvc.perform(get("/hello?name=Chris")).andExpect(status().isOk()).andExpect(content()
                .string("Hello Chris")).andReturn();
    }
}