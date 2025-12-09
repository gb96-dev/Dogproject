public class Main {
    public static void main(String[] args) {
        // 첫 번째 강아지: 이름은 멍멍이, 종은 말티즈
        Dog dog1 = new Dog("멍멍이", "말티즈");
        System.out.println("첫 번째 강아지 - 이름: " + dog1.name + ", 종: " + dog1.breed);

        // 두 번째 강아지: 이름은 초코, 종은 진돗개
        Dog dog2 = new Dog("초코", "진돗개");
        System.out.println("두 번째 강아지 - 이름: " + dog2.name + ", 종: " + dog2.breed);

        // 세 번째 강아지: 이름은 복치, 종은 푸들
        Dog dog3 = new Dog("복치", "푸들");
        System.out.println("세 번째 강아지 - 이름: " + dog3.name + ", 종: " + dog3.breed);
    }
}
