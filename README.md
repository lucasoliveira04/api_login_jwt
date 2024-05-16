# API de Autenticação e Registro com JWT

## Descrição

Esta API permite realizar operações de autenticação e registro de usuários utilizando JWT (JSON Web Token). A API oferece endpoints para login e registro de novos usuários.

## Endpoints

### Autenticação

#### Login

- **Endpoint:** `/api/public/auth/`
- **Método:** `POST`
- **Descrição:** Realiza a autenticação do usuário com base no nome de usuário e senha fornecidos. Retorna um token JWT se a autenticação for bem-sucedida.
- **Corpo da Requisição:**
  ```json
  {
    "username": "string",
    "password": "string"
  }
  ```

- Resposta:
- `200 OK` - Retorna o token JWT.
- `401 UNAUTHORIZED` - Se a autenticação falhar.
### Registro
- Registro de Usuário
- Endpoint: `/api/public/register/add/register`
- Método: `POST`
- Descrição: Registra um novo usuário no sistema.
- Corpo da Requisição:

  ~~~json
    {
    "username": "string",
    "password": "string",
    "email": "string"
    }
  ~~~

- Resposta:
- `200 OK`
