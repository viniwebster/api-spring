package com.viniwebs.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Could not find resource with id " + id);
    }
}
