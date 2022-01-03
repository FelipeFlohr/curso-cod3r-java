# Padrão de Arquitetura MVC (Model - View - Controller)

## Visão Geral:
- Model: terá as regras de negócio, as entidades, camadas de acesso, validação, dados, etc.
- View: responsável por renderizar a resposta. Seja para uma aplicação Web, Desktop, Mobile, etc.
- Controller: faz o intermédio de todo o fluxo da aplicação. Faz a requisição para o Model de dados do banco de dados; Pega informações, trabalha com elas e joga isso para o viewer.

## MVC vs Prédio
Exemplo: vamos supor que você esteja na frente de um prédio grande do governo com vários seguranças, e você possui uma requisição para entregar para alguém que trabalha nesse prédio. Você não tem o andar nem em que sala essa pessoa se encontra, apenas sabe o nome dela. Então, ao entrar no prédio, a primeira coisa com quem você se depara é uma recepcionista na qual dará as informações necessárias para entregar esse *request*. Essa recepcionista dirá o seguinte: "olha, você não pode levar essa requisição em mãos para a pessoa, contudo, há funcionários nesse prédio que possuem a capacidade de levá-la".

Contextualizando: o prédio representa a aplicação MVC. A primeira pessoa que recebe a requisição (no caso do exemplo a *recepcionista*) representa o **Framework MVC**, ou em algum casos chamado de **Front Controller**. Esse Framework MVC - *assim como a secretária* - pode consultar algum arquivo de metadado (exemplo: JSON). Dentro desse arquivo poderá ter o mapeamento das rotas URL (exemplo: qual URL aponta para qual método, etc.) e o Framework MVC terá toda a inteligência para coordenar o fluxo dessas requisições e enviá-las para o lugar certo. Voltando ao exemplo: quando a recepcionista chama alguém para entregar a requisição, a mesma irá falar: "entregue essa requisição *x* para fulano *y* que está na sala *tal* do andar *z*". Essa pessoa que leva a requisição, que se encarrega de pegar as informações para trazer a resposta é o **Controller**. Ou seja, o Controller pede as informações que precisa para o **Model**, coordena esse fluxo, traz as respostas e manda-as para quem solicitou.

---
## Fluxos
Antes de comentar sobre o fluxo, é importante contextualizar o seguinte

- Browser: o Browser irá fazer uma requisição para uma URL :arrow_heading_down:
- Web Server: o Web Server (Tomcat, Nginx, etc.) irá receber essa requisição. A partir da URL, ele irá saber para qual aplicação deverá direcionar :arrow_heading_down:
- Aplicação: dentro da aplicação, o Framework deverá saber para onde direcionar. Com isso, **a primeira camada que deverá receber a requisição será a camada Controller**.
- Controller: camada responsável por coordenar o fluxo da aplicação.

### Cenário 1: não existe a necessidade de acessar dados
Dentro desse cenário, não haverá necessidade de passar pela camada **Model**, tendo em vista que ela se liga ao banco de dados.

*Fluxo*:
1. Browser envia uma requisição para *x* URL para "exibir a tela inicial do sistema como *Menu*" :arrow_heading_down:
2. Controller irá encaminhará a requisição para a **View**
3. A View renderizará a requisição e a resposta é enviada para o Browser

### Cenário 2: existe a necessidade de acessar dados
*Fluxo*:
1. Browser envia uma requisição para *x* URL para "obter a lista de clientes"
2. Controller irá perceber que precisa do Model para buscar os dados
3. Model irá buscar a lista de clientes cadastrados no Banco de Dados e devolverá para o Controller
4. Quando o Controller tiver todos os dados necessários para renderizar a view, encaminhará-los para a mesma
5. A View renderizará a resposta e mandará para o Browser