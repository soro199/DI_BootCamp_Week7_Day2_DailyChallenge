package author;

public class Author {
	
	//Les attributs demandés  
    private String name;
    private String email;
    private char gender;

    public Author() {
        name = "";
        email = "";
        gender = 'm';
    }
//Le constructeur
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
//Les Getters et les Setters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + ("" + gender + "") + " at " + email;
    }
}
