
# Calculadora de Imposto de Renda

Este projeto foi desenvolvido como parte de um **desafio proposto pelo professor** durante o estudo de Java.  
O objetivo é criar um programa que leia as informações de renda e despesas de uma pessoa e gere um **relatório detalhado** com o cálculo do imposto de renda devido, considerando regras específicas de tributação e deduções.

---

## 💡 Descrição do Desafio

O programa deve receber as seguintes informações:

- **Renda anual**:
  - Salário
  - Prestação de serviços
  - Ganho de capital (imóveis, ações, etc.)
- **Gastos dedutíveis**:
  - Médicos
  - Educacionais

A partir disso, deve calcular:

1. **Imposto sobre salário** conforme a tabela:

| Faixa de salário mensal   | Alíquota |
|---------------------------|----------|
| Abaixo de R$ 3000,00      | Isento   |
| De R$ 3000,00 até R$ 4999 | 10%      |
| De R$ 5000,00 ou acima    | 20%      |

> 💡 **Observação:** O salário mensal é obtido dividindo a renda anual por 12.

2. **Imposto sobre prestação de serviços**: 15%.

3. **Imposto sobre ganho de capital**: 20%.

4. **Deduções**:  
   A pessoa pode abater **até 30% do imposto bruto** com gastos médicos e educacionais.  
   Se os gastos forem menores do que 30%, **somente os gastos reais** podem ser abatidos.

---

## 📥 Entradas esperadas

O programa solicita os seguintes valores (em formato decimal):

- Renda anual com salário
- Renda anual com prestação de serviço
- Renda anual com ganho de capital
- Gastos médicos no ano
- Gastos educacionais no ano

---

## 📤 Saída (Relatório de Imposto de Renda)

O programa imprime um relatório formatado, mostrando:

1. **Consolidado de renda** (imposto calculado por tipo de renda)
2. **Deduções** (máximo dedutível e gastos dedutíveis)
3. **Resumo** (abatimento, imposto bruto total e imposto devido)

---

## 📝 Exemplo de Execução

**Entrada:**

```
Renda anual com salário: 48000.00
Renda anual com prestação de serviço: 0.00
Renda anual com ganho de capital: 800.00
Gastos médicos: 400.00
Gastos educacionais: 5400.00
```

**Saída:**

```
RELATÓRIO DE IMPOSTO DE RENDA

CONSOLIDADO DE RENDA:
Imposto sobre salário: 4800.00
Imposto sobre serviços: 0.00
Imposto sobre ganho de capital: 160.00

DEDUÇÕES:
Máximo dedutível: 1488.00
Gastos dedutíveis: 5800.00

RESUMO:
Abatimento: 1488.00
Imposto bruto total: 4960.00
Imposto devido: 3472.00
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** (versão compatível com o ambiente do curso)
- IDE utilizada: Eclipse

---

## 📚 Objetivo Didático

Este exercício tem como foco:

- Praticar **entrada e saída de dados** em Java
- Exercitar **operações matemáticas** e **lógica condicional**
- Simular um problema realista de **cálculo tributário**
- Gerar relatórios formatados com clareza

---

## 🚀 Como Executar

1. Clone o repositório para o seu ambiente local:
   ```bash
   git clone https://github.com/Joao-VictorCm/Exercicio_Imposto_de_Renda_com_Java.git
   ```
2. Abra o projeto no Eclipse (ou outra IDE Java).
3. Compile e execute o programa.
4. Insira os valores solicitados quando o programa for executado.

---



