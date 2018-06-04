package com.jsj.dubbo.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

@SpringBootApplication
@MapperScan("com.jsj.dubbo.test.mapper")
public class ServerApplication {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");

        SpringApplication.run(ServerApplication.class, args);

        System.out.println("*************网卡信息***************");
        try {
            Enumeration<NetworkInterface> interfaces;
            interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                Enumeration<InetAddress> addresss = ni.getInetAddresses();
                while(addresss.hasMoreElements())
                {
                    InetAddress nextElement = addresss.nextElement();
                    String hostAddress = nextElement.getHostAddress();
                    System.out.println("本机IP地址为：" +hostAddress);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("**********************************");
    }
}