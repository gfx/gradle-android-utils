# gradle-android-utils [![Build Status](https://secure.travis-ci.org/gfx/gradle-android-utils.png)](http://travis-ci.org/gfx/gradle-android-utils)

This is a set of utilities for Android build system.

# METHODS

## `void iconToGrayScale(File inputFile, File outputFile)`

Converts the input icon file into grayscaled one.

## `void initSdkDir()`

Creates `local.properties` with `sdk.dir` if it does not exist

## `void writeResources(File file, Map<String, String> dict)`

Creates a resource XML file, which contains `dict`.

## `Version parseVersion(String versionName)`, `Version readVersion(File versionFile)`

Prases or reads a version object, which has `toVersionCode()` and `toVersionName()` methods.

# SEE ALSO

* https://github.com/gfx/Android-HankeiN
