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
     * @param argName The name of the argument which was invalid.
     */
    public ArgumentOutOfRangeException(@NotNull final String argName) {
        super(argName);
        this.value = null;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue
    ) {
        super(argName);
        this.value = argValue;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param message The message describing what went wrong.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @Nullable final String message
    ) {
        super(argName, message);
        this.value = argValue;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @Nullable final Throwable cause
    ) {
        super(argName, cause);
        this.value = argValue;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(argName, message, cause);
        this.value = argValue;
        this.minValue = null;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue
    ) {
        super(argName);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue,
        @Nullable final String message
    ) {
        super(argName, message);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue,
        @Nullable final Throwable cause
    ) {
        super(argName, cause);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(argName, message, cause);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = null;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     * @param argMaxValue The maximum allowed value of the argument which was
     *        invalid.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue,
        @NotNull final Object argMaxValue
    ) {
        super(argName);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = argMaxValue;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     * @param argMaxValue The maximum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue,
        @NotNull final Object argMaxValue,
        @Nullable final String message
    ) {
        super(argName, message);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = argMaxValue;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     * @param argMaxValue The maximum allowed value of the argument which was
     *        invalid.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue,
        @NotNull final Object argMaxValue,
        @Nullable final Throwable cause
    ) {
        super(argName, cause);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = argMaxValue;
    }

    /**
     * Create a new instance.
     *
     * @param argName The name of the argument which was invalid.
     * @param argValue The value of the argument which was invalid.
     * @param argMinValue The minimum allowed value of the argument which was
     *        invalid.
     * @param argMaxValue The maximum allowed value of the argument which was
     *        invalid.
     * @param message The message describing what went wrong.
     * @param cause The {@link Throwable} that triggered the new instance to be
     *        created.
     */
    public ArgumentOutOfRangeException(
        @NotNull final String argName,
        @NotNull final Object argValue,
        @NotNull final Object argMinValue,
        @NotNull final Object argMaxValue,
        @Nullable final String message,
        @Nullable final Throwable cause
    ) {
        super(argName, message, cause);
        this.value = argValue;
        this.minValue = argMinValue;
        this.maxValue = argMaxValue;
    }

    // #endregion Constructors
}
