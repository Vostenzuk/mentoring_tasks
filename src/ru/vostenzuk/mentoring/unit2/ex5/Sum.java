package ru.vostenzuk.mentoring.unit2.ex5;

@FunctionalInterface
public interface Sum<T extends Number> {

  T count(T a, T b);
}