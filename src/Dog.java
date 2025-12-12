public class Dog {
    private String name;
    private String breed;

    // 생성자
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // 직접 만든 메서드 1: 짖기
    public void bark() {
        System.out.println(name + "가(이) 멍멍 짖었어!");
    }

    // 직접 만든 메서드 2: 자기소개
    public String introduce() {
        return "안녕! 나는 " + name + "이고, 품종은 " + breed + "야!";
    }

    // getter 메서드
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // setter 메서드 (필요하면 사용)
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
