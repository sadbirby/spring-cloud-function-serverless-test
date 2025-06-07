package io.github.sadbirby.functions_example;

import java.io.Serializable;

public record Data(
        Long id,
        String name
) implements Serializable {
}
