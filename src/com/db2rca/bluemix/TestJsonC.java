package com.db2rca.bluemix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/getmeJson.json")
public class TestJsonC {

    @RequestMapping(method = RequestMethod.GET, produces={"application/json"})
    public @ResponseBody
    String getmeJson() {
        return "this is a test data file.";
    }
}
