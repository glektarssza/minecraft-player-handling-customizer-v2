package com.glektarssza.player_handling_customizer.api.errors;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;
import com.glektarssza.player_handling_customizer.api.annotations.Nullable;

/**
 * An exception that indicates an argument passed was an undefined value when it
 * should not have been.
 */
public class ArgumentNilException extends InvalidArgumentException {
    // #region Constructors

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     */
    public ArgumentNilException(@NotNull final String argName) {
        super(argName);
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param message The message describing what went wrong.
     */
    public ArgumentNilException(
        @NotNull final String argName,
        @Nullable final String message
    ) {
        super(argName, message);
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentNilException(
        @NotNull final String argName,
        @Nullable final Throwable cause
    ) {
        super(argName, cause);
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentNilException(
        @NotNull final String argName,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(argName, message, cause);
    }

    // #endregion Constructors
}
