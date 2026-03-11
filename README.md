# 🚀 Project Fusion | M&A Strategy Middleware

O **Project Fusion** é um middleware de inteligência financeira desenvolvido para automatizar a consolidação de dados em processos de **Fusões e Aquisições (M&A)**. O sistema utiliza uma arquitetura de microsserviços para transformar métricas de mercado em ativos estratégicos para a tomada de decisão.

## 💼 Aplicação Prática e Dados Reais
Diferente de um sistema estático, o Project Fusion foi estruturado para simular um ambiente de consultoria real:
- **Ingestão de Dados Dinâmicos:** O banco de dados MySQL inicia com 20 empresas de setores estratégicos (Renewables, Fintech, Agrotech).
- **Cálculo de Valuation:** A API processa métricas financeiras (setor e valor de mercado) para gerar inteligência sobre o pipeline de investimentos.
- **Geração de Valor Executivo:** O sistema converte os dados do banco em um **Relatório de Valuation em PDF**, permitindo que consultores entreguem análises prontas para sócios e investidores sem trabalho manual.

## 🛠️ Stack Tecnológica & Arquitetura
- **Back-end:** Java 17 com Spring Boot (APIs REST e Lógica de Negócio).
- **Persistence:** MySQL 8.0 orquestrado via Docker.
- **Reporting:** iText7 para processamento de documentos PDF automatizados.
- **Dashboard:** Interface executiva minimalista em HTML5/JS integrada à API.
- **Infraestrutura:** Docker e Docker Compose para independência de ambiente.

## ☁️ Visão de Nuvem (AWS-Ready)
A aplicação é **Cloud-Native**. O plano de deployment no arquivo `DEPLOY-AWS.md` contempla a migração para **Amazon ECS/Fargate** e **Amazon RDS**, garantindo alta disponibilidade e escalabilidade.

---
*Projeto desenvolvido durante o bootcamp da **Accenture** em parceria com a **DIO**. Agradeço a ambas as instituições pela oportunidade de unir a lógica econômica da UFRJ com engenharia de software de ponta.*
