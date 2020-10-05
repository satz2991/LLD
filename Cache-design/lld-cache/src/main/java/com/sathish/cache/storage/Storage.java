package com.sathish.cache.storage;

import com.sathish.cache.exceptions.NotFoundException;
import com.sathish.cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void add(Key key, Value value) throws StorageFullException;

    void remove(Key key) throws NotFoundException;

    Value get(Key key) throws NotFoundException;
}
