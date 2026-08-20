# Atividade — Desenvolvimento Colaborativo com Git

Você e sua dupla farão parte de uma equipe responsável pela evolução deste pequeno **Gerenciador de Tarefas em Java**.

O sistema inicial permite apenas listar tarefas. Cada integrante deverá desenvolver uma nova funcionalidade utilizando uma branch própria.

## Integrante A — Adicionar tarefa

Crie a branch:

```bash
git switch -c feature-adicionar-tarefa
```

Implemente um método que permita adicionar uma nova tarefa à lista.

Assinatura sugerida:

```java
public void adicionarTarefa(String tarefa)
```

Faça pelo menos um commit e envie sua branch ao GitHub.

## Integrante B — Remover tarefa

Crie a branch:

```bash
git switch -c feature-remover-tarefa
```

Implemente um método que permita remover uma tarefa existente da lista.

Assinatura sugerida:

```java
public boolean removerTarefa(String tarefa)
```

Faça pelo menos um commit e envie sua branch ao GitHub.

## Regras

1. Não é permitido desenvolver diretamente na branch `main`.
2. Cada funcionalidade deve ser desenvolvida em sua própria branch.
3. Cada integrante deve realizar pelo menos um commit.
4. As mensagens dos commits devem descrever claramente a alteração realizada.
5. Cada branch deve ser enviada ao repositório remoto.
6. Cada integrante deve abrir um Pull Request para a `main`.
7. A dupla deve revisar os Pull Requests antes do merge.
8. Depois do primeiro merge, o outro integrante deve atualizar seu repositório local adequadamente antes de concluir a integração.
9. Ao final, as duas funcionalidades devem estar disponíveis na `main`.

## Entrega

Entregar o link do repositório no GitHub contendo:

- as duas funcionalidades;
- histórico de commits;
- branches utilizadas;
- Pull Requests;
- código final integrado à `main`.

## Desafio adicional — conflito de merge

Depois de concluir as funcionalidades, cada integrante deverá criar uma nova branch a partir da `main` e alterar a mesma linha:

```java
System.out.println("=== TAREFAS ===");
```

Cada integrante deverá escolher um texto diferente.

Em seguida, tentem integrar as duas alterações e resolvam o conflito de merge em conjunto.
