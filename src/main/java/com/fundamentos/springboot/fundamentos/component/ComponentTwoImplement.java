package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement  implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola, desde el 2º componente\n");
    }
}
