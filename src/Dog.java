public class Dog {
    // 2. 캡슐화 - 필드를 private으로
    private String name;
    private String breed;

    // 생성자
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // 1. 일반 메서드들 (getter/setter 말고!)
    public void bark() {
        System.out.println(name + "가 짖습니다: 멍멍!");
    }

    public void eat(String food) {
        System.out.println(name + "가 " + food + "를 먹습니다.");
    }

    public void sleep() {
        System.out.println(name + "가 잠을 잡니다. Zzz...");
    }

    public String introduce() {
        return "안녕하세요! 제 이름은 " + name + "이고, 품종은 " + breed + "입니다!";
    }

    // 2. Getter 메서드들 (캡슐화하면서 만들기)
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter 메서드들
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}