## Login com JWT

Você já se deparou com a dificuldade de implementar um sistema de login em sua API? 
A variedade de abordagens encontradas em blogs e vídeos do YouTube pode tornar o 
processo confuso e desafiador. 
Eu também estive nessa situação. No entanto, 
aprendi e desenvolvi uma solução padronizada para facilitar 
o login em sua aplicação.

### O que é JWT?
JWT (JSON Web Token) é um padrão aberto (RFC 7519) que define uma maneira compacta e autônoma para transmitir informações com segurança entre as partes como um objeto JSON. 
Escolhi o JWT para autenticação devido à sua simplicidade, segurança e eficiência.

### Por que JWT?
- **Simplicidade**: Com JWT, você pode simplificar o processo de autenticação, eliminando a necessidade de consultar o banco de dados em cada solicitação.
- **Segurança**: Os tokens JWT são assinados digitalmente, o que os torna seguros contra adulteração.
- **Eficiência**: Como os tokens JWT são autocontidos, reduzem a necessidade de consultar o banco de dados do servidor para cada solicitação, resultando em melhor desempenho.


Dependencias usadas: 
--

~~~xml
    <dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-mail</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-api</artifactId>
        <version>0.11.2</version>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-impl</artifactId>
        <version>0.11.2</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-jackson</artifactId>
        <version>0.11.2</version>
        <scope>runtime</scope>
    </dependency>


    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
</dependencies>
~~~

### Como começar

Para começar a usar o sistema de login com JWT em sua própria aplicação, siga estas etapas simples:

1. Clone este repositório.
2. Configure as dependências necessárias no seu projeto.
3. Siga as instruções de configuração e implementação fornecidas na documentação.
4. Integre o sistema de login em sua aplicação e comece a autenticar seus usuários de forma segura e eficiente.


