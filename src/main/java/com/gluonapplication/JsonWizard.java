package com.gluonapplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JsonWizard {
    public void save
    private String jsonString = null;

    public JsonWizard(String path) {
        File jsonFile = new File(JsonWizard.class.getResource(path).getFile());
        try {
            jsonString = new String(Files.readAllBytes(jsonFile.toPath()));
            System.out.println(getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        JsonWizard wizard = new JsonWizard("settingsFile.json");

    }

    public String getJsonString() {
        return jsonString;
    }
}
