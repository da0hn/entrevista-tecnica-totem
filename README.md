# Entrevista técnica

Crie um algoritmo que receba uma frase e gere um identificador baseando-se nas seguintes regras:

* Se receber uma frase composta por vários espaços ou vazia (`String` em branco ou vazia) deve retornar uma `String` em branco

* Se receber uma frase nula deve retornar nulo

* A primeira letra de todas as palavras após a primeira deve ser maiúscula (Palavra Capitalizada)

* O resultado final deve ser concatenado e deve ser inserido o sufixo `_t`
  * Exemplo:
  * `Dia inicial da prestação de contas` -> `diaInicPresContas_t`
  * `Tipo de Benefício Previdenciário` -> `tipoBenePrevidenciario_t`
  * `Informações alteradas do Dependente` -> `informacoesAlteDependente_t`

* Frases com 1 palavra não devem ser convertidas:
  * Exemplo:
  * `numero` -> `numero_t`

* Palavras na frase, excluindo a primeira e a última, com mais de 4 caracteres devem ser truncadas.
  * Exemplo:
  * `Dia inicial da prestação de contas` -> `diaInicPresContas_t`
  * `Tipo de Benefício Previdenciário` -> `tipoBenePrevidenciario_t`
  * `Informações alteradas do Dependente` -> `informacoesAlteDependente_t`

* Remova todas as preposições abaixo:

```java
String[] preposicoes = new String[] {
  "a","ante","ate","apos","com","contra","de","desde","desde","em","entre",
  "para","pra","perante","por","per","sem","sob","sobre","tras","da","do"
};
```

* Remova todos os artigos abaixo:

```java
String[] artigos = new String[] {
  "o","os","a","as","um","uns","uma","umas"
};
```

* Remova as conjunções abaixo:

```java
String[] conjuncoes = new String[]{ "e" }; 
```

* Esse projeto foi criado utilizando `Java 8` + `Maven` e na pasta `src/main/java/` possui uma classe Java com o setup inicial para implementar o 
  teste

* Sinta-se livre para alterar a versão do `Java` ou o gerenciador de dependência caso sinta necessidade

* Sinta-se livre para implementar quaisquer outras regras além das descritas acima.
