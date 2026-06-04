public class Department {
    private String depName;
    private String hodName;
    private double totalBudget;

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public String getDepName() {
        return this.depName;
    }

    public String getHodName() {
        return this.hodName;
    }

    public double getTotalBudget() {
        return this.totalBudget;
    }

    void checkBudgetStatus() {
        if (this.totalBudget > 50000.00) {
            System.out.println("The Budget is High.");
        } else {
            System.out.println("The Budget is Low.");
        }
    }
}
