package com.endava.cats.generator.format.impl;

import com.endava.cats.generator.format.api.ValidDataFormatGenerator;
import io.swagger.v3.oas.models.media.Schema;

import javax.inject.Singleton;
import java.util.Random;

@Singleton
public class Bcp47Generator implements ValidDataFormatGenerator {
    private final Random random = new Random();

    @Override
    public Object generate(Schema<?> schema) {
        String[] locales = {"en-US", "en-JP", "fr-FR", "de-DE", "de-CH", "de-JP", "ro-RO"};
        return locales[random.nextInt(locales.length)];
    }

    @Override
    public boolean appliesTo(String format, String propertyName) {
        return "bcp47".equalsIgnoreCase(format);
    }
}
