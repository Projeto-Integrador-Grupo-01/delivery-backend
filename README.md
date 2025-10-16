<div align="center">
  <a href="https://git.io/typing-svg">
    <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=24&duration=3000&pause=1000&color=00C853&center=true&vCenter=true&width=850&lines=Sabor+Local+–+Delivery+Sustentável+de+Alimentos+Naturais!" alt="Typing SVG" />
  </a>
</div>

**Grupo:** TechSisters
**Versão:** 1.0
**Objetivo:** Conectar restaurantes, produtores locais e consumidores conscientes em uma experiência de delivery saudável, prática e sustentável.

---

<div align="center">
  <img src="https://ik.imagekit.io/5qjemq96e/Projeto1%20-%20delivery/SaborLocal_logo.png?updatedAt=1760625885744" alt="Tech Sisters Preview" width="300" />
</a>
</div>





---

## 🧭 Visão de Negócio

O **Sabor Local** nasceu da ideia de unir **tecnologia, propósito e alimentação saudável** em uma única plataforma.
Nosso objetivo é oferecer uma **solução acessível e sustentável** para conectar **restaurantes, produtores locais, entregadores e consumidores**.

A proposta é criar um **delivery digital de refeições naturais e produtos regionais**, promovendo **conveniência**, **bem-estar** e **responsabilidade ambiental**.
O sistema organiza e automatiza etapas como **seleção de pratos, pagamento, logística de entrega e avaliações**, garantindo eficiência e impacto positivo.

---

## 🛠️ Metodologia de Desenvolvimento

O desenvolvimento foi realizado de forma **colaborativa e iterativa**, priorizando aprendizado coletivo e clareza técnica.
O grupo realizou **brainstorms**, **abstração de requisitos** e **documentação contínua**, garantindo alinhamento entre design, código e propósito.

Pilares principais:
1. **Simplicidade de uso**
2. **Sustentabilidade como propósito**
3. **Escalabilidade para futuras evoluções**

---

## 🗂️ Documentação e Organização

A documentação foi elaborada com o **Typora**, utilizando arquivos Markdown para criar um **README.md** padronizado e legível.
Essa escolha garante uma estrutura clara, ideal para **apresentações e futuras manutenções**.

---

## 🔄 Controle de Versão e Colaboração

- Versionamento realizado com **Git**
- Repositório hospedado no **GitHub**
- Uso de **commits frequentes** e **revisões em grupo**

---

## 🚀 Escopo da Primeira Versão

A primeira entrega do **Sabor Local** foi focada em uma **base sólida de backend**, garantindo o funcionamento essencial de um sistema de delivery.

### ✅ Funcionalidades Implementadas
- CRUD completo da entidade **Produto**
- Validações básicas de dados
- Testes de endpoints via **Insomnia**
- Estrutura **API RESTful** com boas práticas
- Banco de dados relacional **MySQL** com **JPA/Hibernate**
- Deploy local via **Maven** e **Tomcat embutido**

---

## 📈 Resultados e Entrega

O grupo entregou um **protótipo funcional de backend**, validado com endpoints REST e integração ao banco de dados.

**Principais conquistas:**
- Domínio de fundamentos em **Java e Spring Boot**
- Aplicação correta do padrão **MVC e RESTful**
- Organização técnica e documentação coerente
- Clareza entre **propósito e sustentabilidade**

---

## 🧩 Arquitetura do Sistema

| Componente | Descrição |
|-------------|------------|
| **Camadas** | Model, Repository, Controller |
| **Padrão de Projeto** | MVC (Model-View-Controller) |
| **API** | RESTful, endpoints padronizados |
| **Banco de Dados** | MySQL, via JPA/Hibernate |
| **Deploy Local** | Maven + Tomcat (Spring Boot) |

---

## 🍽️ Modelo de Entidade – Produto

```java
@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;
    private Boolean disponivel;

    // Getters e Setters
}
```

---

## ⚙️ Ferramentas e Tecnologias

| Categoria | Ferramenta |
|------------|-------------|
| Linguagem | Java |
| Framework | Spring Boot |
| IDE | Eclipse / STS |
| Banco de Dados | MySQL |
| ORM | JPA + Hibernate |
| Teste de API | Insomnia |
| Dependências | Maven |
| Servidor | Tomcat embutido |
| Versionamento | Git + GitHub |
| Documentação | Typora / SharePoint |

---

## 🧪 Testes

Foram realizados testes manuais via Insomnia e automatizados (JUnit) para validar:
- Inserção, atualização, consultar e exclusão de produtos
- Retornos corretos dos endpoints REST
- Persistência no banco de dados
- Respostas HTTP adequadas

---

## 🧱 Desafios e Soluções

| Desafio | Solução |
|----------|----------|
| Configuração do banco | Ajuste no application.properties e uso de spring.jpa.hibernate.ddl-auto |
| Padronização de endpoints | Definição de convenções REST |
| Divisão de tarefas | Organização via Git |
| Testes de API | Uso do Insomnia e validações CRUD |

---

## 🌎 Impactos e Benefícios

- Facilita o acesso a refeições naturais e produtos locais
- Incentiva o consumo consciente
- Valoriza pequenos produtores regionais
- Cria base para integração com front-end e marketplace
- Demonstra o uso da tecnologia como agente de sustentabilidade

---

## 🙌 Equipe

Desenvolvido por [Tech Sisters](https://projeto-integrador-grupo-01.github.io/techsisters/) 🍃



<table align="center">
  <tr>
    <td align="center">
      <a href="https://github.com/LemesdeMorais">
        <img src="https://github.com/LemesdeMorais.png?size=100" width="100" style="border-radius:50%; border:2px solid #00C853;" alt="Rafaela Morais"/>
        <br/><sub><b>Rafaela Morais</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/alineromanini">
        <img src="https://github.com/alineromanini.png?size=100" width="100" style="border-radius:50%; border:2px solid #00C853;" alt="Aline Romanini"/>
        <br/><sub><b>Aline Romanini</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/cdouradom">
        <img src="https://github.com/cdouradom.png?size=100" width="100" style="border-radius:50%; border:2px solid #00C853;" alt="Cinthia Dourado"/>
        <br/><sub><b>Cinthia Dourado</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/nicollyjesus">
        <img src="https://github.com/nicollyjesus.png?size=100" width="100" style="border-radius:50%; border:2px solid #00C853;" alt="Nicolly Jesus"/>
        <br/><sub><b>Nicolly Jesus</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/queren-alves">
        <img src="https://github.com/queren-alves.png?size=100" width="100" style="border-radius:50%; border:2px solid #00C853;" alt="Quéren Alves"/>
        <br/><sub><b>Quéren Alves</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/crissmcoelho">
        <img src="https://github.com/crissmcoelho.png?size=100" width="100" style="border-radius:50%; border:2px solid #00C853;" alt="Cristina Coelho"/>
        <br/><sub><b>Cristina Coelho</b></sub>
      </a>
    </td>
  </tr>
</table>

---















