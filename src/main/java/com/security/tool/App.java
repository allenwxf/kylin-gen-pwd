package com.security.tool;

public class App {
    public static void main( String[] args )
    {
        org.springframework.security.crypto.password.PasswordEncoder encoder
                = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
        try {
            String ycode = args[0];
            String encodedPassword = encoder.encode(ycode);
            System.out.println("原始密码:");
            System.out.println(ycode);
            System.out.println("加密后:");
            System.out.println(encodedPassword);
        } catch (Exception e) {
            System.out.println("请输入要加密的内容");
        } finally {
        }
    }
}
