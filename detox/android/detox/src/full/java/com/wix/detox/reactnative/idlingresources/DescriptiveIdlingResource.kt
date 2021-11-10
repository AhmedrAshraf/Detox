package com.wix.detox.reactnative.idlingresources

import androidx.test.espresso.IdlingResource

interface DescriptiveIdlingResource: IdlingResource {
    fun getDescription(): String

    /**
     * Returns a descriptive JSON representation of the resource.
     */
    fun getJSONDescription(): Map<String, Any>
}
