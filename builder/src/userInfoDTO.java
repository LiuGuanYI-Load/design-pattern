public class userInfoDTO {
    private String name;
    private int number;
    private int age;
    private userInfoDTO(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.number=builder.number;
    }
    public static final class Builder{
        private String name;
        private int number;
        private int age;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public userInfoDTO build(){
            return new userInfoDTO(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + name + '\'' +
                ", screen='" + number + '\'' +
                ", memory='" + age + '\'' +
                '}';
    }
}
