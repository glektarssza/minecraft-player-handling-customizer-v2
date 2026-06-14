package com.glektarssza.player_handling_customizer.api.utils;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;

/**
 * A collection of helper functions for array types.
 */
public final class ArrayHelpers {
    // #region Public Static Methods

    @NotNull
    public static <T> String join(final T[] arr, @NotNull final String joiner) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i += 1) {
            sb.append(arr[i].toString());
            sb.append(joiner);
        }
        return TypeHelpers.castToNotNull(sb.toString());
    }

    // #endregion Public Static Methods

    // #region Constructors

    /**
     * Create a new instance.
     */
    private ArrayHelpers() {
        // -- Does nothing
    }

    // #endregion Constructors
}
