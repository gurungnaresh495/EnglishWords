package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Model.Word;
import com.aws.codestar.projecttemplates.Service.AppService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private AppService appService;

    @GetMapping("/")
    public Word getRandomEngWord() throws IOException {
        return appService.returnRandomEnglishWord();
    }
}
