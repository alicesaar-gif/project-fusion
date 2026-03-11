# ☁️ Plano de Deployment: Amazon Web Services (AWS)

Este documento descreve a estratégia de migração do **Project Fusion** do ambiente de desenvolvimento local para uma infraestrutura escalável e resiliente na nuvem AWS.

## 🏗️ Arquitetura de Nuvem Proposta



### 1. Build & Artifacts (CI/CD)
- **Containerização:** Utilização do Dockerfile existente para gerar a imagem imutável da API.
- **Registry:** Publicação da imagem no **Amazon ECR (Elastic Container Registry)** para controle de versionamento e segurança.

### 2. Compute Layer (Serverless)
- **Orquestração:** Deploy via **Amazon ECS (Elastic Container Service)**.
- **Launch Type:** Utilização do **AWS Fargate** (Serverless) para eliminar a necessidade de gerenciar instâncias EC2, focando apenas na execução dos containers.
- **Escalabilidade:** Configuração de *Service Auto Scaling* baseado em consumo de CPU/Memória.

### 3. Database Layer (Managed)
- **Migração:** Substituição do container MySQL local pelo **Amazon RDS (Relational Database Service)**.
- **Benefícios:** Backups automatizados, Multi-AZ (Alta Disponibilidade) e patches de segurança gerenciados pela AWS.

### 4. Networking & Security
- **Isolamento:** VPC com subredes públicas (para o Load Balancer) e privadas (para API e Banco).
- **Secrets:** Gerenciamento de credenciais via **AWS Secrets Manager**.