public class Lab203 {
    public static void main(String[] args) {
        String[] subjects = {"ITE-201", "BIS-112", "DAT-201", "JPN-201", "ENL-211"};

        displayArray("Original", subjects);
        System.out.println();

        String newSub = "SOC-111";
        subjects = addArraySize(subjects);
        subjects[subjects.length - 1] = newSub;
        displayArray("Already appended element", subjects);
        System.out.println();
        System.out.println();

        int delIdx1 = 3;
        subjects = deleteElement(delIdx1, subjects);
        displayArray("Already deleted index " + delIdx1, subjects);
        System.out.println();

        int delIdx2 = 0;
        subjects = deleteElement(delIdx2, subjects);
        displayArray("Already deleted index " + delIdx2, subjects);
        System.out.println();

        int delIdx3 = subjects.length - 1;
        subjects = deleteElement(delIdx3, subjects);
        displayArray("Already deleted last index", subjects);
        System.out.println();

        int upIdx = 1;
        String upElement = "MTE-201";
        subjects = updateElement(upIdx, upElement, subjects);
        displayArray("Already updated element", subjects);
    }

    public static void displayArray(String msg, String[] subjects) {
        System.out.print(msg + ": ");
        boolean first = true;
        for (String sub : subjects) {
            System.out.print((!first ? ", " : "") + sub);
            first = false;
        }
        System.out.println();
    }

    public static String[] addArraySize(String[] subjects) {
        String[] next = new String[subjects.length + 1];
        for (int i = 0; i < subjects.length; i++) {
            next[i] = subjects[i];
        }
        return next;
    }

    public static String[] deleteElement(int idx, String[] subjects) {
        if (idx < 0 || idx >= subjects.length) {
            return subjects;
        }
        String[] next = new String[subjects.length - 1];
        int k = 0;
        
        for (int i = 0; i < subjects.length; i++) {
            if (i == idx) {
                continue;
            }
            next[k] = subjects[i];
            k++;
        }
        return next;
    }

    public static String[] updateElement(int idx, String newElement, String[] subjects) {
        if (idx >= 0 && idx < subjects.length) {
            subjects[idx] = newElement;
        }
        return subjects;
    }
}