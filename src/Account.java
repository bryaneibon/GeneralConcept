class Account {
    public static void main(String[] args) {
        Account account = new Account();

        account.setId(1000);
        account.setCode("62968503812");
        account.setBalance(100_000_000);
        account.setEnabled(true);

        System.out.println(account.getId());      // 1000
        System.out.println(account.getCode());    // 62968503812
        System.out.println(account.getBalance()); // 100000000
        System.out.println(account.isEnabled());  // true
    }

    private long id;
    private String code;
    private long balance;
    private boolean enabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    class Patient {

        private String name;

        public Patient(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            if (name != null) {
                this.name = name;
            }
        }
    }
}

class Patient {

    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}