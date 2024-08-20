package day3.TypeCasting;

class DeveloperAlif {
    public void infoDev() {
        System.out.println("Developer Alif sudah menyelesaikan task: Fix Layout Login Page");

    }
}
class ProjectManager extends DeveloperAlif {
    public void info() {
        System.out.println("Project Manager meminta Developer Alif mengambil " +
                "task Fix Register Page setelah selesai task fix Layout Login Page");
    }
}
public class UpDownCast {
    public static void main(String[] args) {

        // Variable Casting
        float phi = 3.14f;
        int wholePhi = (int) phi;
        System.out.println("Phi in whole number: " + wholePhi);
        System.out.println();

        // Object Upcasting
//        DeveloperAlif devA = new ProjectManager();
//        devA.infoDev();

        // Object Downcasting
//        ProjectManager pm = (ProjectManager) devA;
//        pm.info();

    }
}
