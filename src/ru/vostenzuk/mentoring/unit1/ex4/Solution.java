package ru.vostenzuk.mentoring.unit1.ex4;

import java.util.Objects;

public class Solution {

    private Double firstRoot;
    private Double secondRoot;

    public double getFirstRoot() {
        return firstRoot;
    }

    public void setFirstRoot(double firstRoot) {
        this.firstRoot = firstRoot;
    }

    public double getSecondRoot() {
        return secondRoot;
    }

    public void setSecondRoot(double secondRoot) {
        this.secondRoot = secondRoot;
    }

    public void print() {
        if (!Objects.isNull(this.firstRoot) && this.firstRoot.equals(this.secondRoot)) {
            System.out.printf("У уравнения один корень, он равен %s", this.firstRoot);
        } else if (Objects.isNull(this.firstRoot) && Objects.isNull(this.secondRoot)) {
            System.out.println("У уравнения есть только комплексные корни.");
        } else {
            System.out.printf("Первый корень равен %s, второй корень равен %s", this.firstRoot, this.secondRoot);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Solution{");
        sb.append("firstRoot=").append(firstRoot);
        sb.append(", secondRoot=").append(secondRoot);
        sb.append('}');
        return sb.toString();
    }
}
