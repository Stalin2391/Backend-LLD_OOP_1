package OOPS.LLD1.PassByValue;

public class CLient {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Stalin";
        System.out.println(st.name + " Before function call");
        fun(st);
        System.out.println(st.name + " After function call");
    }

    static void fun(Student st){
        st = new Student();
        st.name = "Deepthi";
        System.out.println(st.name + " Inside function call");
    }
}
