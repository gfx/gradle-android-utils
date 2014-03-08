package com.github.gfx.gradle_android_utils.project.test;

import android.test.AndroidTestCase;

public class BuildConfigTest extends AndroidTestCase {

    public void testBuildConfigField() {
        assertEquals("Foo", BuildConfig.FOO);
        assertTrue(123 == BuildConfig.BAR);
        assertTrue(BuildConfig.BAZ);
    }
}
