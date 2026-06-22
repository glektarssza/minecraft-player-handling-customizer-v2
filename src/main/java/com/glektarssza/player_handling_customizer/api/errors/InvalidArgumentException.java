package com.glektarssza.player_handling_customizer.api.errors;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;
import com.glektarssza.player_handling_customizer.api.annotations.Nullable;

/**
 * An exception that indicates an argument passed was invalid.
 */
public class InvalidArgumentException extends BaseCustomRuntimeException {
    // #region Public Fields

    /**
     * The name of the argument which was invalid.
     */
    @NotNull
    public final String argumentName;

    // #endregion Public Fields

    // #region Constructors

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     */
    public InvalidArgumentException(@NotNull final String argName) {
        this.argumentName = argName;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param message The message describing what went wrong.
     */
    public InvalidArgumentException(
        @NotNull final String argName,
        @Nullable final String message
    ) {
        super(message);
        this.argumentName = argName;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public InvalidArgumentException(
        @NotNull final String argName,
        @Nullable final Throwable cause
    ) {
        super(cause);
        this.argumentName = argName;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public InvalidArgumentException(
        @NotNull final String argName,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(message, cause);
        this.argumentName = argName;
    }

    // #endregion Constructors
}
