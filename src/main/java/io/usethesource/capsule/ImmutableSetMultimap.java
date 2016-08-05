/*******************************************************************************
 * Copyright (c) 2013-2015 CWI All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * * Michael Steindorfer - Michael.Steindorfer@cwi.nl - CWI
 *******************************************************************************/
package io.usethesource.capsule;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

public interface ImmutableSetMultimap<K, V> extends SetMultimap_Legacy<K, V> {

  ImmutableSet<V> get(final Object o);

  ImmutableSet<V> getEquivalent(final Object o, final Comparator<Object> cmp);

  boolean containsKey(final Object o);

  boolean containsKeyEquivalent(final Object o, final Comparator<Object> cmp);

  boolean containsValue(final Object o);

  boolean containsValueEquivalent(final Object o, final Comparator<Object> cmp);

  boolean containsEntry(final Object o0, final Object o1);

  boolean containsEntryEquivalent(final Object o0, final Object o1, final Comparator<Object> cmp);

  

  
  
  ImmutableSetMultimap<K, V> __put(final K key, final V val);
  
  
  
  
  
  // TODO: ImmutableSetMultimap<K, V> __insert(final K key, final Set<V> values);

  ImmutableSetMultimap<K, V> __insert(final K key, final V val);

  ImmutableSetMultimap<K, V> __insertEquivalent(final K key, final V val,
      final Comparator<Object> cmp);

  ImmutableSetMultimap<K, V> __insertAll(final SetMultimap_Legacy<? extends K, ? extends V> setMultimap);

  ImmutableSetMultimap<K, V> __insertAllEquivalent(
      final SetMultimap_Legacy<? extends K, ? extends V> setMultimap, final Comparator<Object> cmp);

  
  
  
  
  // removes all mappings with 'key'
  ImmutableSetMultimap<K, V> __remove(final K key);

  // removes all mappings with 'key'
  ImmutableSetMultimap<K, V> __removeEquivalent(final K key, final Comparator<Object> cmp);
  
  ImmutableSetMultimap<K, V> __removeEntry(final K key, final V val);

  ImmutableSetMultimap<K, V> __removeEntryEquivalent(final K key, final V val,
      final Comparator<Object> cmp);

  
  
  
  
  Iterator<K> keyIterator();

  Iterator<V> valueIterator();

  // TODO: Iterator<Map.Entry<K, Set<V>>> groupByKeyIterator();

  Iterator<Map.Entry<K, V>> entryIterator();
  
  Iterator<Map.Entry<K, Object>> nativeEntryIterator();

  <T> Iterator<T> tupleIterator(final BiFunction<K, V, T> tupleOf);

  boolean isTransientSupported();

  TransientSetMultimap<K, V> asTransient();

}