public class Main {
    public static void main(String[] args) {

        // 강아지 3마리 생성
        Dog dog1 = new Dog("멍멍이", "말티즈");
        Dog dog2 = new Dog("초코", "진돗개");
        Dog dog3 = new Dog("복치", "푸들");

        // 직접 만든 메서드 호출
        dog1.bark();
        dog2.bark();
        dog3.bark();

        System.out.println();

        // introduce() 메서드 호출
        System.out.println(dog1.introduce());
        System.out.println(dog2.introduce());
        System.out.println(dog3.introduce());

        System.out.println();

        // getter 이용 출력
        System.out.println("이름: " + dog1.getName() + ", 품종: " + dog1.getBreed());
        System.out.println("이름: " + dog2.getName() + ", 품종: " + dog2.getBreed());
        System.out.println("이름: " + dog3.getName() + ", 품종: " + dog3.getBreed());
    }
}
