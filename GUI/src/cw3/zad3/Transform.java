package cw3.zad3;

@FunctionalInterface
interface Transform<T, R> {
    R apply(T s);
}
