# Entrevista técnica

Crie um algoritmo que receba uma frase e gere um identificador baseando-se nas seguintes regras:

* Remova todas as preposições abaixo:
```java
String[] preposicoes = new String[] {
      "a", "ante", "ate", "apos", "com", "contra", "de", "desde", "desde", "em", "entre",
      "para", "pra", "perante", "por", "per", "sem", "sob", "sobre", "tras", "da", "do"
};
```
* Remova todos os artigos abaixo:
```java
String[] artigos = new String[] {
      "o", "os", "a", "as", "um", "uns", "uma", "umas"
};
```
* Remova as conjunções abaixo:
```java
String[] conjuncoes = new String[] { "e" }; 
```
* Palavras na frase, excluindo a primeira e a última, com mais de 4 caracteres devem ser truncadas.
    * Exemplo:
    * `Dia inicial da prestação de contas` -> `diaInicPresContas`
    * `Tipo de Benefício Previdenciário` -> `tipoBenePrevidenciario`
    * `Informações alteradas do Dependente` -> `informacoesAlteDependente`
* A primeira letra de todas as palavras após a primeira deve ser maiúscula (Palavra Capitalizada)
* O resultado final deve ser concatenado e deve ser inserido o sufixo `_t`
    * Exemplo:
    * `Dia inicial da prestação de contas` -> `diaInicPresContas_t`
    * `Tipo de Benefício Previdenciário` -> `tipoBenePrevidenciario_t`
    * `Informações alteradas do Dependente` -> `informacoesAlteDependente_t`
* Frases com 1 palavra não devem ser convertidas:
    * Exemplo:
    * `numero` -> `numero_t`
* Se receber uma frase composta por vários espaços ou vazia (`String` em branco ou vazia) deve retornar uma `String` em branco
* Se receber uma frase nula deve retornar nulo
* Sinta-se livre para implementar quaisquer outras regras
