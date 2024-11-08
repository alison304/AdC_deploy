package com.auradecristal.aura_de_cristal.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Para imprimir en formato JSON
 * @author lumurga
 */
public class JsonPrinter {

    public static String toString(Object t) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateAdapter());
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter());
        Gson gson = gsonBuilder.setPrettyPrinting().create();

        return gson.toJson(t).trim().replace("\n", "").replace("\t", "");

    }
}
