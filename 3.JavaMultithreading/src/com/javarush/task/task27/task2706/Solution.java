package com.javarush.task.task27.task2706;

/* 
Убираем deadlock
*/
public class Solution {
    public void safeMethod(Object obj1, Object obj2) {
        int obj1Hash = System.identityHashCode(obj1) * 31;
        int obj2Hash = System.identityHashCode(obj2) * 31;

        Object firstMonitor = obj1Hash > obj2Hash ? obj1 : obj2;
        Object secondMonitor = obj1Hash > obj2Hash ? obj2 : obj1;

        synchronized (firstMonitor) {
            longTimeMethod();
            synchronized (secondMonitor) {
                unsafeMethod(obj1, obj2);
            }
        }
    }

    public void longTimeMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    protected void unsafeMethod(Object obj1, Object obj2) {
        System.out.println(obj1 + " " + obj2);
    }

    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        final Solution solution = new Solution();

        new Thread(() -> solution.safeMethod(o1, o2)).start();
        new Thread(() -> solution.safeMethod(o2, o1)).start();
    }
}
