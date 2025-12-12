public class Main {
    public static void main(String[] args) {
        // 3. Dog 객체 생성 및 메서드 실행
        Dog dog1 = new Dog("멍멍이", "말티즈");

        // 1번에서 만든 메서드 사용
        System.out.println(dog1.introduce());
        dog1.bark();
        dog1.eat("간식");
        dog1.sleep();

        System.out.println("\n----- Getter 사용 -----");
        // 2번에서 만든 getter 메서드 사용
        System.out.println("이름: " + dog1.getName());
        System.out.println("품종: " + dog1.getBreed());

        System.out.println("\n----- 다른 강아지들도 테스트 -----");
        Dog dog2 = new Dog("초코", "진돗개");
        System.out.println(dog2.introduce());
        dog2.bark();

        Dog dog3 = new Dog("복치", "푸들");
        System.out.println("이름: " + dog3.getName() + ", 품종: " + dog3.getBreed());
    }
}