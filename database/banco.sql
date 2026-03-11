CREATE DATABASE IF NOT EXISTS fusion_analytics;
USE fusion_analytics;

-- Tabela principal com os dados das empresas que estão no pipeline de M&A
CREATE TABLE target_companies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(100) NOT NULL,
    industry_sector VARCHAR(50),
    headquarters_location VARCHAR(50),
    deal_status VARCHAR(50) DEFAULT 'Prospecting', -- Ex: Prospecting, Due Diligence, Closed
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabela de métricas financeiras associada a cada empresa (Relação 1:N)
CREATE TABLE financial_metrics (
    id INT AUTO_INCREMENT PRIMARY KEY,
    company_id INT,
    fiscal_year INT,
    revenue_millions DECIMAL(10, 2),
    ebitda_millions DECIMAL(10, 2),
    valuation_multiple DECIMAL(5, 2),
    FOREIGN KEY (company_id) REFERENCES target_companies(id) ON DELETE CASCADE
);

-TRUNCATE TABLE target_companies;

INSERT INTO target_companies (nome, setor, valuation) VALUES 
('Solaris Energy', 'Energia Renovável', 1250.50),
('AgroTech Solutions', 'Agronegócio', 850.00),
('HealthVibe', 'Saúde/Tech', 2100.20),
('FinEdge Bank', 'Fintech', 4500.00),
('BlueLogistics', 'Logística', 720.40),
('CyberShield', 'Cybersecurity', 3150.00),
('RetailPlus', 'Varejo', 540.00),
('BioGenix', 'Biotecnologia', 1890.30),
('UrbanMobility', 'Transporte', 980.00),
('EduSmart', 'EdTech', 430.50),
('DeepMining Co', 'Mineração', 2700.00),
('CloudFlow', 'Cloud Computing', 5200.00),
('GreenSteel', 'Siderurgia', 1100.20),
('AutoDrive AI', 'Automotivo/IA', 6400.00),
('SafePay', 'Pagamentos', 1250.00),
('FoodCycle', 'Alimentício', 320.00),
('PetroAdvance', 'Óleo e Gás', 8900.00),
('NanoChip', 'Semicondutores', 7300.00),
('AeroSpace X', 'Aeroespacial', 4100.00),
('LuxuryStay', 'Hotelaria', 670.00);