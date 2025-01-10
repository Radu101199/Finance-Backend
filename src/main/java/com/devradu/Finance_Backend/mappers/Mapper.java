package com.devradu.Finance_Backend.mappers;

public interface Mapper<A, B> {
    B mapTo(A a);
    A mapFrom(B b);
}
