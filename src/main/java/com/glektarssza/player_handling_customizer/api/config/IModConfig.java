package com.glektarssza.player_handling_customizer.api.config;

import java.nio.file.Path;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;
import com.glektarssza.player_handling_customizer.api.utils.Maybe;
import com.glektarssza.player_handling_customizer.api.utils.TypeHelpers;

/**
 * An interface defining a mod configuration.
 */
public interface IModConfig {
    /**
     * Get the name of the mod this instance is for.
     *
     * @return The name of the mod this instance is for.
     */
    @NotNull
    public abstract String getModName();

    /**
     * Get the name of the configuration this instance represents.
     *
     * @return The name of the configuration this instance represents.
     */
    @NotNull
    public abstract String getConfigName();

    /**
     * Get the path to the root configuration directory.
     *
     * @return The path to the root configuration directory.
     */
    @NotNull
    public abstract Path getRootConfigDirectoryPath();

    /**
     * Get the path to the sub-directory under the root configuration path which
     * the configuration represented by this instance lives.
     *
     * @return The path to the sub-directory under the root configuration path
     *         which the configuration represented by this instance lives.
     */
    @NotNull
    public abstract Maybe<Path> getConfigSubDirectoryPath();

    /**
     * Get the full path to the configuration file represented by this instance.
     *
     * @return The full path to the configuration file represented by this
     *         instance.
     */
    @NotNull
    public default Path getConfigFullPath() {
        return this.getConfigSubDirectoryPath().andThen(path -> {
            return Maybe
                .ofValue(
                    TypeHelpers
                        .castToNotNull(
                            this.getRootConfigDirectoryPath().resolve(path)
                        )
                );
        }).orElse(Maybe.ofValue(getRootConfigDirectoryPath())).getValue();
    }
}
