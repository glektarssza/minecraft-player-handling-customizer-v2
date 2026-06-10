package com.glektarssza.player_handling_customizer.api.errors;

import com.glektarssza.player_handling_customizer.api.annotations.Nullable;

/**
 * An exception that indicates the system was not in a valid state for the
 * requested operation.
 */
public class InvalidStateException extends BaseCustomRuntimeException {
    // #region Constructors

    /**
     * Create a new instance.
     */
    public InvalidStateException() {
        super();
    }

    /**
     * Create a new instance.
     *
     * @param message The message describing what went wrong.
     */
    public InvalidStateException(@Nullable final String message) {
        super(message);
    }

    /**
     * Create a new instance with the given {@link Throwable} that caused the
     * new instance to be created.
     *
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public InvalidStateException(@Nullable final Throwable cause) {
        super(cause);
    }

    /**
     * Create a new instance.
     *
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public InvalidStateException(
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(message, cause);
    }

    // #endregion Constructors
}
