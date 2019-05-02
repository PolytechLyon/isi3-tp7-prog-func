package functional;

import java.util.function.Function;

public class Monad<T> {
  private T value;

  public T getValue() {
    return this.value;
  }

  public  Monad(T value) {
    this.value = value;
  }

  public <R> Monad<R> map(Function<T,R> f) {
  }

  public <R> Monad<R> flatMap(Function<T, Monad<R>> f) { // comme le bind
  }

}