# Gerenciador de Tarefas — Exercício de Git

Projeto Java simples utilizado para praticar um fluxo colaborativo com Git e GitHub.

## Projeto inicial

O sistema possui duas tarefas cadastradas e permite apenas listá-las.

As novas funcionalidades serão implementadas por uma dupla, cada integrante trabalhando em uma branch diferente:

- `feature-adicionar-tarefa`
- `feature-remover-tarefa`

Não desenvolva diretamente na branch `main`.

## Como executar

Requer Java instalado.

### Compilar

```bash
javac -d out src/*.java
```

### Executar

```bash
java -cp out Main
```

## Fluxo esperado

```text
clone
  ↓
branch
  ↓
implementação
  ↓
git status
  ↓
git add
  ↓
git commit
  ↓
git push
  ↓
Pull Request
  ↓
revisão
  ↓
merge
  ↓
git pull
```

Consulte `ATIVIDADE.md` para o enunciado completo.
