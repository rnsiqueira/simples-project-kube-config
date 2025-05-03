package br.com.rns.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@RunWith(SpringRunner.class)
@WebMvcTest(StartAppPage.class)
@ActiveProfiles("test")
public class StartAppPageTest {


    @Autowired
    private MockMvc mvc;


    @WithMockUser(value = "spring")
    @Test
    public void returnBodyStartAppPage() throws Exception {
        MockHttpServletResponse response = this.mvc.perform(get("/init")).andReturn().getResponse();
        assertEquals(200, response.getStatus());

        assertEquals("<h1>Welcome to Accounting Tax</h1>", response.getContentAsString());
    }
}
