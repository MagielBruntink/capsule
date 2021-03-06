/**
 * Copyright (c) Michael Steindorfer <Centrum Wiskunde & Informatica> and Contributors.
 * All rights reserved.
 *
 * This file is licensed under the BSD 2-Clause License, which accompanies this project
 * and is available under https://opensource.org/licenses/BSD-2-Clause.
 */
package io.usethesource.capsule;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public interface ImmutableMap<K, V> extends Map<K, V> {

  @Override
  V get(final Object o);

  V getEquivalent(final Object o, final Comparator<Object> cmp);

  @Override
  boolean containsKey(final Object o);

  boolean containsKeyEquivalent(final Object o, final Comparator<Object> cmp);

  @Override
  boolean containsValue(final Object o);

  boolean containsValueEquivalent(final Object o, final Comparator<Object> cmp);

  ImmutableMap<K, V> __put(final K key, final V val);

  ImmutableMap<K, V> __putEquivalent(final K key, final V val, final Comparator<Object> cmp);

  ImmutableMap<K, V> __putAll(final Map<? extends K, ? extends V> map);

  ImmutableMap<K, V> __putAllEquivalent(final Map<? extends K, ? extends V> map,
      final Comparator<Object> cmp);

  ImmutableMap<K, V> __remove(final K key);

  ImmutableMap<K, V> __removeEquivalent(final K key, final Comparator<Object> cmp);

  Iterator<K> keyIterator();

  Iterator<V> valueIterator();

  Iterator<Map.Entry<K, V>> entryIterator();

  boolean isTransientSupported();

  TransientMap<K, V> asTransient();

}
