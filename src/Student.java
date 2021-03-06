/**
 * Changed by choiwj 2020.4.22
 */
public class Student {
    private String id;
    private String name;
    private Integer age;
    private String program;
    private Integer score;

    public Student(String id, String name, Integer age, String program, Integer score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.program = program;
        this.score = score;
    }

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public Integer getScore() {
    	return score;
    }
    public void setScore(Integer score) {
    	this.score = score;
    }
}
