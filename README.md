# gradle-android-utils [![Build Status](https://secure.travis-ci.org/gfx/gradle-android-utils.png)](http://travis-ci.org/gfx/gradle-android-utils)

This is a set of utilities for Android build system.

NOTE: **This project is still alpha-qality; API will be change without notice**

# METHODS

### `void iconToGrayScale(File inputFile, File outputFile)`

Converts the input icon file into grayscaled one.

### `void initSdkDir(Map<String, String> extra = null)`

Creates `local.properties` if it does not exist, which includes
`sdk.dir`, `ndk.dir` and `extra` properties.

### `void writeResources(File file, Map<String, String> dict)`

Creates a resource XML file, which contains `dict`.

### `Version parseVersion(String versionName)`, `Version readVersion(File versionFile)`

Prases or reads a version object, which has `toVersionCode()` and `toVersionName()` methods.

## `void setBuildConfigField(buildType, Map<String, Object> buildConfigMap)`

Set `buildConfigField` from `Map`. Requirements to 'com.android.tools.build:gradle:0.8.0' or later.

``` groovy
// For example

android.applicationVariants.all { variant ->
    def buildConfigMap = [
        'APP_NAME': 'MyApp' + variant.buildType.name.capitalize(),
        'EXTENSION_MIN_SDK_INT': 14,
        'API_SERVER_PRODUCTION': false,
    ]

    setBuildConfigField(variant.buildType, buildConfigMap)
}

/**
 * //Build result
 *
 * public final class BuildConfig {
 *   ...
 *   // Fields from build type: debug
 *   public static final String APP_NAME = "MyAppDebug";
 *   public static final Integer EXTENSION_MIN_SDK_INT = 14;
 *   public static final Boolean API_SERVER_PRODUCTION = false;
 * }
 */
```

# SEE ALSO

* https://github.com/gfx/Android-HankeiN which uses this project

# LICENSE

This program is free software; you can redistribute it and/or modify it under the same terms of the MIT license.

