package com.example.testinfopolus.dao;

public abstract class AbstractRepository<T> {
    abstract T getById(int id);
    abstract T save(T entity);
}
