class Student extends Reader {
    public Student(String name) {
        super(name);
    }

    public int getMaxBooks() {
        return 5;
    }

    public int getBorrowDays() {
        return 30;
    }
}

class Worker extends Reader {
    public Worker(String name) {
        super(name);
    }

    public int getMaxBooks() {
        return 3;
    }

    public int getBorrowDays() {
        return 20;
    }
}

class Guest extends Reader {
    public Guest(String name) {
        super(name);
    }

    public int getMaxBooks() {
        return 1;
    }

    public int getBorrowDays() {
        return 10;
    }
}