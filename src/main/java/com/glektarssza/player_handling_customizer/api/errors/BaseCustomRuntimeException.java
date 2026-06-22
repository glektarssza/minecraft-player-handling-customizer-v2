package com.glektarssza.player_handling_customizer.api.errors;

import com.glektarssza.player_handling_customizer.api.annotations.Nullable;

/**
 * A base custom runtime exception for other custom runtime exceptions to extend
 * from.
 */
public abstract class BaseCustomRuntimeException extends RuntimeException {
    // #region Constructors

    /**
     * Create a new instance.
     */
    protected BaseCustomRuntimeException() {
        // -- Does nothing
    }

    /**
     * Create a new instance with the given message describing what went wrong.
     *
     * @param message The message describing what went wrong.
     */
    protected BaseCustomRuntimeException(@Nullable final String message) {
        super(message);
    }

    /**
     * Create a new instance with the given {@link Throwable} that caused the
     * new instance to be created.
     *
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    protected BaseCustomRuntimeException(@Nullable final Throwable cause) {
        super(cause);
    }

    /**
     * Create a new instance with the given message describing what went wrong
     * and {@link Throwable} that caused the new instance to be created.
     *
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    protected BaseCustomRuntimeException(
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(message, cause);
    }

    // #endregion Constructors
}
