package com.glektarssza.player_handling_customizer.api.utils;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;
import com.glektarssza.player_handling_customizer.api.annotations.Nullable;
import com.glektarssza.player_handling_customizer.api.errors.ArgumentNilException;

/**
 * A collection of helper functions for types.
 */
public final class TypeHelpers {
    // #region Public Static Methods

    /**
     * Cast a value to a non-nullable value.
     *
     * @param <T> The type of the value to cast.
     * @param value The value to cast.
     *
     * @return The value, cast as a non-nullable value.
     *
     * @throws ArgumentNilException Thrown if the value is {@code null}.
     */
    @NotNull
    public static <T> T castToNotNull(@Nullable final T value) {
        if (value == null) {
            throw new ArgumentNilException(
                "value",
                "Expected a non-nil input for argument \"value\" but got \"null\""
            );
        }
        return value;
    }
    // #endregion Public Static Methods

    // #region Constructors

    /**
     * Create a new instance.
     */
    private TypeHelpers() {
        // -- Does nothing
    }

    // #endregion Constructors
}
