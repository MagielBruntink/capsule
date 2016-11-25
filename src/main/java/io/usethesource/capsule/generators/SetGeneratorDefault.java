/**
 * Copyright (c) Michael Steindorfer <Centrum Wiskunde & Informatica> and Contributors.
 * All rights reserved.
 *
 * This file is licensed under the BSD 2-Clause License, which accompanies this project
 * and is available under https://opensource.org/licenses/BSD-2-Clause.
 */
package io.usethesource.capsule.generators;

import io.usethesource.capsule.DefaultTrieSet;
import io.usethesource.capsule.api.deprecated.ImmutableSet;

@SuppressWarnings({"rawtypes", "unchecked"})
public class SetGeneratorDefault<T extends ImmutableSet> extends CapsuleSetGenerator<T> {

  public SetGeneratorDefault() {
    super((Class<T>) DefaultTrieSet.getTargetClass());
  }

}