# JSON
JSON (JavaScript Object Notation) é um formato textual, de padrão aberto independente, de troca de dados simples e rápida. Representa um objeto JavaScript

## Formatando JSON
Para fazer a formatação e validação de JSONs existe o site [JSON Formatter & Validator](https://jsonformatter.curiousconcept.com).

Inserindo o seguinte valor e processando-o, teremos:
Valor original:
```json
{
   nome: "Maria Pedra"
}
```

Valor formatado:
```json
{
   "nome":"Maria Pedra"
}
```
Repare que no valor formatado, há a presença de aspas duplas no parâmetro, visualmente representando que o mesmo se trata de uma String.

### Inserindo um objeto dentro de um JSON
Um JSON em si é um objeto, para inserir um objeto dentro dele basta representá-lo utilizando um par de chaves. Exemplo:
```json
{
   "nome":"Maria Pedra",
   "dataNascimento":"08/07/2003",
   "vip":true,
   "salario":7893.56,
   "endereco":{
      "logradouro":"Rua ABC",
      "numero":123
   }
}
```

### Arrays em JSON
Veja a sintaxe abaixo para arrays em JSON:
```json
{
   "nome":"Maria Pedra",
   "dataNascimento":"08/07/2003",
   "vip":true,
   "salario":7893.56,
   "endereco":{
      "logradouro":"Rua ABC",
      "numero":123
   },
   "dependentes":[
      "Ana",
      "Pedro",
      "Rafael"
   ]
}
```