package homework.day14.checkpoint01.test7;

public class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        setName(name);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score<0){
            throw new NoScoreException("分数不能为负数："+score);
        }
        this.score = score;
    }
}
