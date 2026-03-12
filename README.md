# Project Fusion — M&A Analytics & Microservices Architecture 🚀

## 🇬🇧 English

### Overview
**Project Fusion** is a microservices-based infrastructure designed to support **Mergers & Acquisitions (M&A) analysis** and automate the generation of valuation reports.

The platform integrates financial data processing with scalable software architecture, enabling structured company data to be transformed into **decision-ready insights for investment and strategic analysis**.

---

### 🏗️ System Architecture
The application processes structured financial data through a containerized microservices architecture.

**Main components:**

- **NGINX (Load Balancer)**  
  Acts as a reverse proxy on port 80 and distributes incoming requests across API instances.

- **API Layer (Java / Spring Boot)**  
  Multiple replicas run simultaneously to ensure high availability and service resilience.

- **MySQL Database**  
  Stores structured financial metrics and information about potential M&A target companies.

---

### 🚀 Core Features

- **Target Company Analysis**  
  Retrieve a consolidated dataset of companies, including sector classification and valuation information.

- **Automated Valuation Reporting**  
  Generate executive-ready **PDF valuation reports** dynamically from database data.

- **Resilient Infrastructure**  
  Docker Swarm ensures service continuity by automatically recreating containers in case of failure.

---

### 🛠️ Technology Stack

**Backend**
- Java 17  
- Spring Boot  
- Hibernate / JPA  

**Database**
- MySQL 8.0  

**Infrastructure**
- Docker  
- Docker Swarm  
- Docker Compose  

**Networking**
- NGINX (Reverse Proxy)

**Reporting**
- iTextPDF

---

### ⚙️ Running the Project

Initialize Docker Swarm:

```bash
docker swarm init

Deploy the microservices stack:

docker stack deploy -c docker-compose.yml project_fusion_stack

Access endpoints via the NGINX proxy (port 80):

Targets endpoint (JSON)

http://localhost/fusion/targets

Valuation report (PDF)

http://localhost/fusion/targets/report
📉 API Endpoints
Method	Route	Description
GET	/fusion/targets	Returns the full list of target companies
GET	/fusion/targets/report	Generates a valuation report in PDF format
🎓 Project Context

Project developed during the Accenture Bootcamp in partnership with DIO, combining software engineering practices with financial analysis concepts from my Economics studies at UFRJ.

🇧🇷 Português
Visão Geral

O Project Fusion é uma infraestrutura baseada em microsserviços desenvolvida para apoiar análises de Fusões e Aquisições (M&A) e automatizar a geração de relatórios de valuation.

A plataforma integra processamento de dados financeiros com uma arquitetura de software escalável, permitindo transformar dados estruturados de empresas em insights prontos para análise estratégica e tomada de decisão.

🏗️ Arquitetura do Sistema

A aplicação foi projetada para processar dados financeiros estruturados por meio de uma arquitetura containerizada baseada em microsserviços.

Principais componentes:

NGINX (Load Balancer)
Atua como proxy reverso na porta 80, distribuindo as requisições entre as instâncias da API.

Camada de API (Java / Spring Boot)
Múltiplas réplicas executadas simultaneamente garantem alta disponibilidade e resiliência.

Banco de Dados MySQL
Armazena métricas financeiras estruturadas e informações sobre empresas alvo em processos de M&A.

🚀 Funcionalidades

Análise de Empresas Alvo
Consulta de um conjunto consolidado de empresas, incluindo setor de atuação e métricas de valuation.

Geração Automatizada de Relatórios
Criação dinâmica de relatórios executivos em PDF a partir dos dados armazenados no banco.

Infraestrutura Resiliente
O Docker Swarm garante continuidade do serviço recriando containers automaticamente em caso de falha.

🛠️ Tecnologias Utilizadas

Backend

Java 17

Spring Boot

Hibernate / JPA

Banco de Dados

MySQL 8.0

Infraestrutura

Docker

Docker Swarm

Docker Compose

Rede

NGINX (Proxy Reverso)

Relatórios

iTextPDF

🎓 Contexto do Projeto

Projeto desenvolvido durante o Bootcamp da Accenture em parceria com a DIO, integrando práticas de engenharia de software com conceitos de análise financeira, utilizando ferramentas de .