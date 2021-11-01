public class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g)
    {
        this.name = n;
        this.email = e;
        this.gender = g;
        }
        public String getEmail() {
            return email;
        }
        public char getGender() {
            return gender;
        }
        public String getName() {
            return name;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setGender(char gender) {
            this.gender = gender;
        }
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return(this.name+"(email:"+this.email+") gender "+ this.gender);
        }

}