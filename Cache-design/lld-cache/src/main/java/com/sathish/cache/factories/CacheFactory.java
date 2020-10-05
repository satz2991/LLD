package com.sathish.cache.factories;

import com.sathish.cache.Cache;
import com.sathish.cache.policies.LRUEvictionPolicy;
import com.sathish.cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}
