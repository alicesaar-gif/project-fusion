# 🚀 Project Fusion | M&A Analytics & Microservices Architecture



## 🇬🇧 Overview
**Project Fusion** is a financial intelligence middleware developed to support **Mergers & Acquisitions (M&A)** processes. The platform integrates financial data processing with a scalable microservices architecture, transforming raw market metrics into executive-ready insights for strategic decision-making.

### 🏗️ System Architecture
The application is designed for high availability and resilience:
* **NGINX (Load Balancer):** Acts as a reverse proxy on port 80, distributing requests.
* **API Layer (Java / Spring Boot):** Orchestrated with **3 replicas** via Docker Swarm.
* **Database (MySQL):** Stores financial metrics for strategic sectors (Renewables, Fintech, Agrotech).
* **Reporting:** Dynamic generation of **Valuation PDF Reports** using iTextPDF.

---

## 🇧🇷 Visão Geral
O **Project Fusion** é um middleware de inteligência financeira desenvolvido para apoiar processos de **Fusões e Aquisições (M&A)**. A plataforma integra o processamento de dados financeiros com uma arquitetura de microsserviços escalável, transformando métricas de mercado em relatórios executivos prontos para a tomada de decisão.

### 🏗️ Arquitetura do Sistema
A aplicação utiliza uma infraestrutura resiliente baseada em containers:
* **NGINX (Load Balancer):** Proxy reverso na porta 80, distribuindo a carga entre as instâncias.
* **Camada de API (Java / Spring Boot):** Orquestrada com **3 réplicas** via Docker Swarm.
* **Banco de Dados (MySQL):** Armazena métricas financeiras de setores estratégicos.
* **Relatórios:** Geração dinâmica de **Relatórios de Valuation em PDF** via iTextPDF.

## 🛠️ Technology Stack | Tecnologias
* **Backend:** Java 17, Spring Boot, Hibernate/JPA.
* **Infra:** Docker, **Docker Swarm** (Cluster Mode), Docker Compose.
* **Network:** NGINX (Reverse Proxy).

## ⚙️ Running the Project | Como Executar
```bash
docker swarm init
docker network create --driver overlay --attachable fusion_network
docker stack deploy -c docker-compose.yml project_fusion_stack
>>>>>>> 344b75be3807ecad57dbeeb9f79f1baf016b5feb
