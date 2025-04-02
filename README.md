# Sistema de Pedidos de Venda

Este é um aplicativo web para gerenciamento de pedidos de venda, incluindo cadastro de produtos, clientes e vendas, com autenticação de usuários, geração de relatórios e gráficos.

## Tecnologias Utilizadas

- **Back-end**: Spring Boot, JPA, API Rest
- **Front-end**: Next.js, React.js, Bulma CSS, PrimeReact
- **Banco de Dados**: PostgreSQL
- **Relatórios**: JasperReports
- **Autenticação**: Integração com sites de terceiros (GitHub, Auth0)
- **Containerização**: Docker

## Funcionalidades

- **Cadastro**: Produtos, clientes e vendas
- **Autenticação de Usuários**: Suporte a login via GitHub e Auth0
- **Relatórios**: Geração de relatórios utilizando JasperReports
- **Gráficos**: Visualização de dados através de gráficos interativos
- **API Rest**: Endpoints para integração com outras aplicações

## Estrutura do Projeto

O projeto está dividido nos seguintes diretórios:

- **bd**: Contém scripts relacionados ao banco de dados
- **others**: Inclui arquivos diversos e de configuração
- **vendas-api**: Código-fonte da API desenvolvida com Spring Boot
- **vendas-app**: Aplicação front-end desenvolvida com Next.js e React.js

## Como Executar o Projeto

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/williammian/vendas.git
   ```

2. **Configurar o Banco de Dados**:
   - Certifique-se de ter o PostgreSQL instalado e em execução.
   - Crie um banco de dados chamado `vendas` e configure as credenciais no arquivo de propriedades do `vendas-api`.

3. **Executar a API**:
   - Navegue até o diretório `vendas-api`:
     ```bash
     cd vendas-api
     ```
   - Execute a aplicação Spring Boot:
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Executar a Aplicação Front-end**:
   - Navegue até o diretório `vendas-app`:
     ```bash
     cd ../vendas-app
     ```
   - Instale as dependências:
     ```bash
     npm install
     ```
   - Inicie o servidor de desenvolvimento:
     ```bash
     npm run dev
     ```

A aplicação estará disponível em `http://localhost:3000`.

## Licença

Este projeto está licenciado sob a licença MIT.
