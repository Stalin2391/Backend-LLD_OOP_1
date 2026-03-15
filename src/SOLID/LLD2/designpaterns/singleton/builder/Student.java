package SOLID.LLD2.designpaterns.singleton.builder;

public class Student {
    String name;
    int age;
    String batch;
    Double psp;
    int gradYear;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
    }


    public static Builder getBuilder() {
        return new Builder();
    }



    public static class Builder {
        String name;
        int age;
        String batch;
        Double psp;
        int gradYear;

        private Builder() {

        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Double getPsp() {
            return psp;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
