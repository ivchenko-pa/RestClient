package org.example.restclient.model;

public record CharacterResourceInfo(Integer count,
                                    Integer pages,
                                    String next,
                                    String prev) {
}
