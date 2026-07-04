package com.glektarssza.player_handling_customizer.api.utils;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;
import com.glektarssza.player_handling_customizer.api.annotations.Nullable;
import com.glektarssza.player_handling_customizer.api.errors.InvalidStateException;
import com.glektarssza.player_handling_customizer.api.functional.suppliers.UnarySupplier;
import com.glektarssza.player_handling_customizer.api.functional.suppliers.VoidSupplier;

/**
 * A value that may hold another value.
 *
 * @param <T> The type of value that may be held in instances of this class.
 */
public final class Maybe<T> implements ICopyable<Maybe<T>> {
    /**
     * Create a new instance from the given, possibly {@code null}, value.
     *
     * @param <T> The type of value that may be held in the new instances.
     * @param maybeValue The value, possibly {@code null}, which will be held in
     *        the new instance.
     *
     * @return The new instance.
     */
    @NotNull
    public static <T> Maybe<T> ofNullable(@Nullable final T maybeValue) {
        return new Maybe<T>(maybeValue);
    }

    /**
     * Create a new instance from the given value.
     *
     * @param <T> The type of value that may be held in the new instances.
     * @param value The value which will be held in the new instance.
     *
     * @return The new instance.
     */
    @NotNull
    public static <T> Maybe<T> ofValue(@NotNull final T value) {
        return Maybe.ofNullable(value);
    }

    /**
     * Create a new instance from no value.
     *
     * @param <T> The type of value that would have been held in the new
     *        instances.
     *
     * @return The new instance.
     */
    @NotNull
    public static <T> Maybe<T> ofNull() {
        return Maybe.ofNullable(null);
    }

    /**
     * The value held in this instance.
     */
    @Nullable
    private final T value;

    /**
     * Create a new instance.
     *
     * @param valueArg The value which might be held in the new instance.
     */
    private Maybe(@Nullable final T valueArg) {
        this.value = valueArg;
    }

    /**
     * Check whether this instance holds a value.
     *
     * @return {@code true} if this instance holds a value, {@code false}
     *         otherwise.
     */
    public boolean isSome() {
        return this.value != null;
    }

    /**
     * Check whether this instance holds no value.
     *
     * @return {@code true} if this instance holds no value, {@code false}
     *         otherwise.
     */
    public boolean isNone() {
        return !this.isSome();
    }

    /**
     * Get the value held in this instance.
     *
     * @return The value held in the instance.
     *
     * @throws InvalidStateException If the instance holds no value.
     */
    @NotNull
    public T getValue() throws InvalidStateException {
        if (this.value == null) {
            throw new InvalidStateException(
                "getValue called on a Maybe instance that holds no value"
            );
        }
        return this.value;
    }

    /**
     * Get the value held in this instance, if any.
     *
     * @return The value held in the instance, if any, or {@code null}
     *         otherwise.
     */
    @Nullable
    public T tryGetValue() {
        return this.value;
    }

    /**
     * Get the given {@link Maybe} value if this instance has a value, a copy of
     * this instance otherwise.
     *
     * @param other The {@link Maybe} value to return if this instance has a
     *        value.
     *
     * @return The given {@link Maybe} value if this instance has a value, a
     *         copy of this instance otherwise.
     */
    @NotNull
    public Maybe<T> andThen(@NotNull final Maybe<T> other) {
        if (this.value != null) {
            return other;
        }
        return Maybe.ofNullable(this.value);
    }

    /**
     * Get the result of calling the given {@link UnarySupplier} if this
     * instance has a value, a copy of this instance otherwise.
     *
     * @param otherFunc The {@link UnarySupplier} to call to get the value to
     *        return if this instance has a value.
     *
     * @return The result of calling the given {@link UnarySupplier} if this
     *         instance has a value, a copy of this instance otherwise.
     */
    @NotNull
    public Maybe<T> andThen(
        @NotNull final UnarySupplier<T, @NotNull Maybe<T>> otherFunc
    ) {
        if (this.value != null) {
            return otherFunc.call(this.value);
        }
        return Maybe.ofNullable(this.value);
    }

    /**
     * Get the given {@link Maybe} value if this instance has no value, an
     * instance has no value otherwise.
     *
     * @param <U> The type of the value contained in the returned {@link Maybe}.
     * @param other The {@link Maybe} value to return if this instance holds no
     *        value.
     *
     * @return The given {@link Maybe} value if this instance holds no value, an
     *         instance has no value otherwise.
     */
    @NotNull
    public <U> Maybe<U> orElse(@NotNull final Maybe<U> other) {
        if (this.value == null) {
            return other;
        }
        return Maybe.ofNull();
    }

    /**
     * Get the result of calling the given {@link UnarySupplier} if this
     * instance has no value, an instance holding no value otherwise.
     *
     * @param <U> The type of the value contained in the returned {@link Maybe}.
     * @param otherFunc The {@link UnarySupplier} to call to get the value to
     *        return if this instance has no value.
     *
     * @return The result of calling the given {@link UnarySupplier} if this
     *         instance has no value, an instance holding no value otherwise.
     */
    @NotNull
    public <U> Maybe<U> orElse(
        @NotNull final VoidSupplier<@NotNull Maybe<U>> otherFunc
    ) {
        if (this.value == null) {
            return otherFunc.call();
        }
        return Maybe.ofNull();
    }

    /**
     * {@inheritDoc}
     */
    @NotNull
    @Override
    public Maybe<T> copy() {
        return new Maybe<T>(this.value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object obj) {
        if (this.value == null) {
            if (obj instanceof Maybe<?>) {
                return ((Maybe<?>)obj).value == null;
            }
            return obj == null;
        }
        if (obj instanceof Maybe<?>) {
            final Object otherValue = ((Maybe<?>)obj).value;
            if (otherValue == null) {
                return false;
            }
            return otherValue.equals(this.value);
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return this.value == null ? 0 : this.value.hashCode();
    }
}
