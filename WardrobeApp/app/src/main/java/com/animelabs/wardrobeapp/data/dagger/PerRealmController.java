package com.animelabs.wardrobeapp.data.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by a35764 on 6/3/2018.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerRealmController {
}