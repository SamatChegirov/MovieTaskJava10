package movie.model;

public class Cast {

    private String actorFullName;

    private String role;

    public Cast(String actorFullName, String role) {
        this.actorFullName = actorFullName;
        this.role = role;
    }

    public String getActorFullName() {
        return actorFullName;
    }

    public void setActorFullName(String actorFullName) {
        this.actorFullName = actorFullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return  "\n  Actor full name: " + actorFullName +
                "\n  Role: " + role ;
    }
}
