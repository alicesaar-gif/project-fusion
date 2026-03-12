CREATE DATABASE IF NOT EXISTS fusion_analytics;
USE fusion_analytics;

CREATE TABLE IF NOT EXISTS target_companies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    setor VARCHAR(50),
    valuation DECIMAL(10, 2)
);

CREATE TABLE IF NOT EXISTS financial_metrics (
    id INT AUTO_INCREMENT PRIMARY KEY,
    company_id INT,
    fiscal_year INT,
    revenue_millions DECIMAL(10, 2),
    ebitda_millions DECIMAL(10, 2),
    valuation_multiple DECIMAL(5, 2),
    FOREIGN KEY (company_id) REFERENCES target_companies(id) ON DELETE CASCADE
);

-- Desativa a checagem de chave estrangeira temporariamente para permitir a limpeza
SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE financial_metrics;
TRUNCATE TABLE target_companies;
SET FOREIGN_KEY_CHECKS = 1;

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