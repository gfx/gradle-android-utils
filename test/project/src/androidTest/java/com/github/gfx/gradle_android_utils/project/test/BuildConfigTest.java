package com.github.gfx.gradle_android_utils.project.test;

import android.test.AndroidTestCase;

public class BuildConfigTest extends AndroidTestCase {

    public void testBuildConfigField() {
        assertEquals("Foo", BuildConfig.FOO);
        assertEquals("AppBuild-" + BuildConfig.BUILD_TYPE, BuildConfig.ENV_NAME_BUILD);
        assertEquals("AppFlavor-" + BuildConfig.FLAVOR, BuildConfig.ENV_NAME_FLAVOR);
        assertTrue(123 == BuildConfig.BAR);
        assertTrue(BuildConfig.BAZ);
    }
}
