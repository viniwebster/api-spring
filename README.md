
# API REST SpringBoot 

Api feita em Java com SpringBoot


## Documentação da API

#### Retorna todos os usuarios
```http
GET /users
```

#### Retorna um usuario

```http
GET /users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long`     | **Obrigatório**: O ID do usuario que você quer |

#### Deleta um usuario

```http
DELETE /users/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long`     | **Obrigatório**: O ID do usuario que você quer deletar|


#### Retorna todos os produtos
```http
  GET /products
```

#### Retorna um produto

```http
GET /products/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long`     | **Obrigatório**: O ID do produto que você quer |

#### Retorna todos os pedidos
```http
GET /orders
```

#### Retorna um pedido

```http
GET /orders/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long`     | **Obrigatório**: O ID do pedido que você quer |

#### Retorna todos as categorias
```http
GET /categories
```

#### Retorna uma categoria

```http
GET /categories/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long`     | **Obrigatório**: O ID da categoria que você quer |



