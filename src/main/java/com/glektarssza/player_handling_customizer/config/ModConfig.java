package com.glektarssza.player_handling_customizer.config;

import java.nio.file.Path;

import com.glektarssza.player_handling_customizer.api.annotations.NotNull;
import com.glektarssza.player_handling_customizer.api.config.IModConfig;
import com.glektarssza.player_handling_customizer.api.utils.Maybe;

/**
 * An implementation of the {@link IModConfig} interface.
 */
public class ModConfig implements IModConfig {
    // #region Fields

    /**
     * The name of the mod this instance is for.
     */
    @NotNull
    private final String modName;

    /**
     * The name of the configuration this instance represents.
     */
    @NotNull
    private final String configName;

    /**
     * The path to the root configuration directory.
     */
    @NotNull
    private final Path rootConfigDirectoryPath;

    /**
     * The path to the sub-directory under the root configuration path which the
     * configuration represented by this instance lives.
     */
    @NotNull
    private final Maybe<Path> configSubDirectoryPath;

    // #endregion Fields

    // #region Constructors

    /**
     * Create a new instance.
     *
     * @param argModName The name of the mod which the new instance will
     *        represent.
     * @param argRootConfigPath The path to the root of the Minecraft
     *        configuration directory.
     */
    public ModConfig(
        @NotNull final String argModName,
        @NotNull final Path argRootConfigPath
    ) {
        this(argModName, argModName, argRootConfigPath);
    }

    /**
     * Create a new instance.
     *
     * @param argModName The name of the mod which the new instance will
     *        represent.
     * @param argRootConfigPath The path to the root of the Minecraft
     *        configuration directory.
     * @param argConfigSubDirectoryPath The subdirectory under the root
     *        Minecraft configuration directory to create the configuration file
     *        represented by the new instance.
     */
    public ModConfig(
        @NotNull final String argModName,
        @NotNull final Path argRootConfigPath,
        @NotNull final Path argConfigSubDirectoryPath
    ) {
        this(
            argModName,
            argModName,
            argRootConfigPath,
            argConfigSubDirectoryPath
        );
    }

    /**
     * Create a new instance.
     *
     * @param argModName The name of the mod which the new instance will
     *        represent.
     * @param argRootConfigPath The path to the root of the Minecraft
     *        configuration directory.
     * @param argMaybeConfigSubDirectoryPath The subdirectory under the root
     *        Minecraft configuration directory to create the configuration file
     *        represented by the new instance.
     */
    protected ModConfig(
        @NotNull final String argModName,
        @NotNull final Path argRootConfigPath,
        @NotNull final Maybe<Path> argMaybeConfigSubDirectoryPath
    ) {
        this(
            argModName,
            argModName,
            argRootConfigPath,
            argMaybeConfigSubDirectoryPath
        );
    }

    /**
     * Create a new instance.
     *
     * @param argModName The name of the mod which the new instance will
     *        represent.
     * @param argConfigName The name of the configuration the new instance will
     *        represent.
     * @param argRootConfigPath The path to the root of the Minecraft
     *        configuration directory.
     */
    public ModConfig(
        @NotNull final String argModName,
        @NotNull final String argConfigName,
        @NotNull final Path argRootConfigPath
    ) {
        this(argModName, argConfigName, argRootConfigPath, Maybe.ofNull());
    }

    /**
     * Create a new instance.
     *
     * @param argModName The name of the mod which the new instance will
     *        represent.
     * @param argConfigName The name of the configuration the new instance will
     *        represent.
     * @param argRootConfigPath The path to the root of the Minecraft
     *        configuration directory.
     * @param argConfigSubDirectoryPath The subdirectory under the root
     *        Minecraft configuration directory to create the configuration file
     *        represented by the new instance.
     */
    public ModConfig(
        @NotNull final String argModName,
        @NotNull final String argConfigName,
        @NotNull final Path argRootConfigPath,
        @NotNull final Path argConfigSubDirectoryPath
    ) {
        this(
            argModName,
            argConfigName,
            argRootConfigPath,
            Maybe.ofValue(argConfigSubDirectoryPath)
        );
    }

    /**
     * Create a new instance.
     *
     * @param argModName The name of the mod which the new instance will
     *        represent.
     * @param argConfigName The name of the configuration the new instance will
     *        represent.
     * @param argRootConfigPath The path to the root of the Minecraft
     *        configuration directory.
     * @param argMaybeConfigSubDirectoryPath The subdirectory under the root
     *        Minecraft configuration directory to create the configuration file
     *        represented by the new instance.
     */
    protected ModConfig(
        @NotNull final String argModName,
        @NotNull final String argConfigName,
        @NotNull final Path argRootConfigPath,
        @NotNull final Maybe<Path> argMaybeConfigSubDirectoryPath
    ) {
        this.modName = argModName;
        this.configName = argConfigName;
        this.rootConfigDirectoryPath = argRootConfigPath;
        this.configSubDirectoryPath = argMaybeConfigSubDirectoryPath;
    }

    // #endregion Constructors

    // #region Public Methods

    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public String getModName() {
        return this.modName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public String getConfigName() {
        return this.configName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public Path getRootConfigDirectoryPath() {
        return this.rootConfigDirectoryPath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public Maybe<Path> getConfigSubDirectoryPath() {
        return this.configSubDirectoryPath;
    }

    // #endregion Public Methods
}
