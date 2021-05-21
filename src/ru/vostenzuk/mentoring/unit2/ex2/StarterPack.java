package ru.vostenzuk.mentoring.unit2.ex2;

import java.util.HashSet;
import java.util.Set;

public class StarterPack {

  private Set<AbstractDrawingInstrument> items = new HashSet<>();

  private StarterPack() {
  }

  public static StarterPack create() {
    StarterPack pack = new StarterPack();
    Set<AbstractDrawingInstrument> instrumentSet = Set.of(
        new Pen("blue", 10),
        new Pencil("red", 6),
        new PencilWithEraser("green", 8));
    pack.setItems(instrumentSet);
    return pack;
  }

  public Set<AbstractDrawingInstrument> getItems() {
    return items;
  }

  private void setItems(Set<AbstractDrawingInstrument> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "StarterPack{" + "items=" + items +
        '}';
  }
}
