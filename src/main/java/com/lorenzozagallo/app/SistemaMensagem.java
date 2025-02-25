package com.lorenzozagallo.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${nome:NoReply-LZ}")
    private String name;
    @Value("${email}")
    private String email;
    @Value("${phone}")
    private List<Long> phone =
            new ArrayList<>(Arrays.asList(new Long[]{11956781254L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + name
                + "\nE-mail: " + email
                + "\nCom telefones para contato: " + phone);
        System.out.println("Seu cadastro foi aprovado!");
    }

}
