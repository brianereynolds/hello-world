package com.acme.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class TestController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloWorldPage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(content().string(containsString("<h2>Hello World</h2>")))
                .andExpect(status().isOk());
    }

    @Test
    public void testHealthz() throws Exception {
        this.mockMvc.perform(get("/healthz"))
                .andExpect(status().isOk());
    }

    @Test
    public void testReadinessz() throws Exception {
        this.mockMvc.perform(get("/readinessz"))
                .andExpect(status().isOk());
    }

}
