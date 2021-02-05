package ru.vostenzuk.mentoring.unit1.ex4;

public class Equation {

    private double a;
    private double b;
    private double c;
    private Solution solution;

    public double getA() {
        return a;
    }

    public void setA(double a) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("Аргумент a не может быть 0.");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    public Solution solve() {
        Solution solution = new Solution();
        if (!this.hasRealRoots()) {
            this.solution = solution;
            return this.solution;
        }
        solution.setFirstRoot((-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a));
        solution.setSecondRoot((-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a));
        this.solution = solution;
        return this.solution;
    }

    private double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * a * c;
    }

    private boolean hasRealRoots() {
        return this.getDiscriminant() >= 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Equation{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append(", solution=").append(solution);
        sb.append('}');
        return sb.toString();
    }
}
