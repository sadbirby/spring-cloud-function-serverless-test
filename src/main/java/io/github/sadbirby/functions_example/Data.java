package io.github.sadbirby.functions_example;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;

import java.io.Serializable;

@RegisterReflectionForBinding(Data.class)
public record Data(
        Long id,
        String name
) implements Serializable {
}
