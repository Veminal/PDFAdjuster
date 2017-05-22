package com.veminal.pdf.configuration.read;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;

/**
 * Read menu array information.
 *
 * @author Veminal
 * @version 1.0
 */
public final class ReadDataArray implements ReadConfig<String[]> {
    /**
     * Read JSON file.
     */
    private JsonReader reader;

    @Override
    public void readPath(final String path) {
        try {
            reader = new JsonReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    @Override
    public String[] parse(final String key) {
        JsonObject jObject = (JsonObject) new JsonParser().parse(reader);
        JsonArray array = jObject.getAsJsonArray(key);
        Type listType = new TypeToken<String[]>() {
        }.getType();
        return new Gson().fromJson(array, listType);
    }
}
