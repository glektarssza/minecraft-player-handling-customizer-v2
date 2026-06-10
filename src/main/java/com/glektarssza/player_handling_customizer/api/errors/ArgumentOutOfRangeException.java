package com.glektarssza.player_handling_customizer.api.errors;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;
import com.glektarssza.player_handling_customizer.api.annotations.Nullable;

/**
 * An exception that indicates an argument passed was outside of the allowed
 * range.
 */
public class ArgumentOutOfRangeException extends InvalidArgumentException {
    // #region Public Fields

    /**
     * The value of the argument which was out of range.
     */
    @Nullable
    public final Object value;

    /**
     * The minimum allowed value of the argument which was out of range.
     */
    @Nullable
    public final Object minValue;

    /**
     * The maximum value of the argument which was out of range.
     */
    @Nullable
    public final Object maxValue;

    // #endregion Constructors

    // #region Constructors

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     */
    public ArgumentOutOfRangeException(@NotNull final String argumentName) {
        super(argumentName);
        this.value = null;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value
    ) {
        super(argumentName);
        this.value = value;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param message The message describing what went wrong.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @Nullable final String message
    ) {
        super(argumentName, message);
        this.value = value;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @Nullable final Throwable cause
    ) {
        super(argumentName, cause);
        this.value = value;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(argumentName, message, cause);
        this.value = value;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue
    ) {
        super(argumentName);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue,
        @Nullable final String message
    ) {
        super(argumentName, message);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue,
        @Nullable final Throwable cause
    ) {
        super(argumentName, cause);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(argumentName, message, cause);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     * @param maxValue The maximum allowed value of the argument which was
     *        invalid.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue,
        @NotNull final Object maxValue
    ) {
        super(argumentName);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     * @param maxValue The maximum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue,
        @NotNull final Object maxValue,
        @Nullable final String message
    ) {
        super(argumentName, message);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     * @param maxValue The maximum allowed value of the argument which was
     *        invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue,
        @NotNull final Object maxValue,
        @Nullable final Throwable cause
    ) {
        super(argumentName, cause);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /**
     * Create a new instance.
     *
     * @param argumentName The name of the argument which was invalid.
     * @param value The value of the argument which was invalid.
     * @param minValue The minimum allowed value of the argument which was
     *        invalid.
     * @param maxValue The maximum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argumentName,
        @NotNull final Object value,
        @NotNull final Object minValue,
        @NotNull final Object maxValue,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(argumentName, message, cause);
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    // #endregion Constructors
}
