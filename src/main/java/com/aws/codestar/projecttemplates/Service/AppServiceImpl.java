package com.aws.codestar.projecttemplates.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

@Service
public class AppServiceImpl implements AppService{

    @Autowired
    private ResourceLoader resourceLoader;

    @Override
    public String returnRandomEnglishWord() throws IOException {

        //lets count the lines
        Resource resource = resourceLoader.getResource("classpath:EnglishWords.txt");
        InputStream inputStream = resource.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));


        //lets get the random number for random line of a file
        int lineNumber = (int)(Math.random() * (6344 - 1));

        //get the random word
        String word = "default";
        try {
            for (int i = 0; i < lineNumber;i++)
            {
               reader.readLine();
            }
            word = reader.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
        return word;

    }
}
