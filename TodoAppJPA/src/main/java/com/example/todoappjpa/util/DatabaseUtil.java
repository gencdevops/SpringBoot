package com.example.todoappjpa.util;

import com.example.todoappjpa.data.repository.RepositoryException;

import java.util.function.Consumer;

public final class DatabaseUtil {
    private DatabaseUtil() {

    }

    public static<R> R doWorkForRepository(ISupplierCallback<R> supplier, String msg) {
        try{
           return supplier.get();
        } catch (Throwable ex) {
            throw new RepositoryException(msg, ex);
        }
    }




}
