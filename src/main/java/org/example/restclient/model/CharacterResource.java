package org.example.restclient.model;

import java.util.List;

public record CharacterResource(CharacterResourceInfo info, List<Character> results) {
}
