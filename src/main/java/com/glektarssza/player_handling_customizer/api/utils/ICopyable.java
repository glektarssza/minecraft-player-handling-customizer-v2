package com.glektarssza.player_handling_customizer.api.utils;

/**
 * An interface for objects that can be copied.
 */
public interface ICopyable<T> {
    /**
     * Create a copy of this instance.
     *
     * @return A copy of this instance.
     */
    public T copy();
}
