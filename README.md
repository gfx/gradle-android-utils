# gradle-android-utils [![Build Status](https://secure.travis-ci.org/gfx/gradle-android-utils.png)](http://travis-ci.org/gfx/gradle-android-utils)

This is a set of utilities for Android build system.

NOTE: **This project is still alpha-qality; API will be change without notice**

# METHODS

### `void iconToGrayScale(File inputFile, File outputFile)`

Converts the input icon file into grayscaled one.

### `void copyFile(File inputFile, File outputFile, boolean toOverwrite = false)`

Create `outputFile` from `inputFile` if it does not exist.

You can force overwrite with specifies the `true` to the 3rd argument.

### `void initSdkDir(Map<String, String> extra = null)`

Creates `local.properties` if it does not exist, which includes
`sdk.dir`, `ndk.dir` and `extra` properties.

### `void writeResources(File file, Map<String, String> dict)`

Creates a resource XML file, which contains `dict`.

### `Version parseVersion(String versionName)`, `Version readVersion(File versionFile)`

Prases or reads a version object, which has `toVersionCode()` and `toVersionName()` methods.

# SEE ALSO

* https://github.com/gfx/Android-HankeiN which uses this project

# LICENSE

This program is free software; you can redistribute it and/or modify it under the same terms of the MIT license.

