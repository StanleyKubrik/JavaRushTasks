package level9.stacktrace;

public class NOtask200_lev9_lec02 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].getMethodName());
        }
        return stackTraceElements[1].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].getMethodName());
        }
        return stackTraceElements[1].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].getMethodName());
        }
        return stackTraceElements[1].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].getMethodName());
        }
        return stackTraceElements[1].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i].getMethodName());
        }

        return stackTraceElements[1].getMethodName();
    }
}