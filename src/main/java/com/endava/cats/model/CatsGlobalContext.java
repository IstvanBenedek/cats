package com.endava.cats.model;

import io.swagger.v3.oas.models.media.Schema;
import lombok.Getter;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Holds global variables which should not be recomputed for each path.
 */
@Singleton
@Getter
public class CatsGlobalContext {
    private final Map<String, Schema> schemaMap = new HashMap<>();
    private final Map<String, Schema> requestDataTypes = new HashMap<>();
    private final List<String> additionalProperties = new ArrayList<>();
    private final List<String> discriminators = new ArrayList<>();
    private final Map<String, Deque<String>> postSuccessfulResponses = new HashMap<>();
}
