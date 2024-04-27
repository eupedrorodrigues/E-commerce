# Ecommerce_system
O projeto é um API utilizada para cadastrar, consultar, editar e deletar as entidades Categoria, Pedido, Item do pedido, Pagamento, Produto e Usuário.
## Índice

* [Instalação](#instalação)
* [Uso](#uso)
* [EndPoints API](#endpoints-api)


## Instalação

* Clone o repositório do GitHub
```
git clone https://github.com/eupedrorodrigues/Ecommerce_system.git
cd ecommerce_system
```
* Instale a IDE [SpringToolSuit4](https://spring.io/tools);
* Instale o [Postman](https://www.postman.com/) ou [Insomnia](https://insomnia.rest/download) para testar os métodos: POST, GET, UPDATE, DELETE;
* Instale o banco de dados [PostgreSQL](https://www.postgresql.org/);
 

## Uso

1. Inicie a aplicação pela IDE SpringToolSuit4.
2. Clique com o botão direito no arquivo **TuringApplication.java** busque por "Run As" -> "Spring Boot App"
2. O sistema estará acessível em http://localhost:8080/ ou na porta configurada.
3. Certifique-se de ajustar as inntruções conforme o ambiente e a configuração específicos do seu projeto Spring Boot.

## EndPoints API

* ### Users
```
POST /api/users - Cria um novo usuário;
GET /api/users - Retorna todos os usuários cadastrados;
PUT /api/users/id - Atualiza informações do usuário com base no ID;
DELETE /api/users/id - Deleta um usuário por id;
```
* ### Product
```
POST /api/products - Insere um novo produto;
GET /api/products - Retorna todos os produto;
PUT /api/products/id - Atualiza informações do produto;
DELETE /api/products/id - Deleta um produto;
```

* ### Order
```
POST /api/orders - Insere um novo pedido;
GET /api/orders - Retorna todos os pedidos;
PUT /api/orders/id - Atualiza informações do pedido;
DELETE /api/orders/id - Deleta um pedido;
```

* ### Category
```
POST /api/categories - Insere uma nova categoria;
GET /api/categories - Retorna todos as categorias;
PUT /api/categories/id - Atualiza informações da categoria;
DELETE /api/categories/id - Deleta uma categoria;
```

