package com.aws.codestar.projecttemplates.Service;

import com.aws.codestar.projecttemplates.Model.Word;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface AppService {

    public Word returnRandomEnglishWord() throws IOException;
}
