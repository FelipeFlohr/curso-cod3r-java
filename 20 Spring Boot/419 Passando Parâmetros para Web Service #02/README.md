# Métodos HTTP
Protocolo HTTP serve para transferência de Hyper Text. Possui 8 métodos, sendo o mais famoso o **GET**.

### Métodos e suas funções
- GET: Por via de regras esse método não é para causar nenhum tipo de alteração e/ou efeitos colaterais no servidor, mas sim apenas obter dados.
- POST: Serve para inserir dados no servidor
- PUT: Serve para fazer uma alteração total de um dado
- PATCH: Serve para fazer uma alteração parcial de um dado
- DELETE: Serve para deletar um dado no servidor
- OPTIONS: Retorna quais são os métodos HTTP que uma determinada URL suporta
- TRACE: Requisição de teste/loopback
- HEAD: Requisição parecida com o GET, porém não retorna o corpo (sendo o corpo/body o HTML, JS, CSS, fotos, vídeos, etc).

Esses métodos servem muito mais como uma forma semântica do que para realizar de fato as suas funções. Por exemplo: quando um método DELETE é chamado, não necessáriamente ele irá deletar algo, porém, não fazendo isso, irá quebrar a convenção do REST