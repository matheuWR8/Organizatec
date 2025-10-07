DROP TABLE IF EXISTS funcionario;
DROP TABLE IF EXISTS terceirizado;
DROP TABLE IF EXISTS visitante;
DROP TABLE IF EXISTS departamento;
DROP TABLE IF EXISTS projeto;

-- ==============================
-- TABELA: DEPARTAMENTO
-- ==============================
CREATE TABLE departamento (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

-- ==============================
-- TABELA: PROJETO
-- ==============================
CREATE TABLE projeto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255)
);

-- ==============================
-- TABELA: FUNCIONARIO
-- ==============================
CREATE TABLE funcionario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    data_nascimento DATE,
    matricula VARCHAR(20) UNIQUE NOT NULL,
    cargo VARCHAR(50),
    salario_base DECIMAL(10,2),
    data_contratacao DATE,
    departamento_id BIGINT,
    FOREIGN KEY (departamento_id) REFERENCES departamento(id)
);

-- ==============================
-- TABELA: TERCEIRIZADO
-- ==============================
CREATE TABLE terceirizado (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    funcao VARCHAR(50),
    empresa_prestadora VARCHAR(100),
    data_inicio_contrato DATE,
    data_fim_contrato DATE,
    responsavel_interno VARCHAR(100),
    departamento_id BIGINT,
    FOREIGN KEY (departamento_id) REFERENCES departamento(id)
);

-- ==============================
-- TABELA: VISITANTE
-- ==============================
CREATE TABLE visitante (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    documento VARCHAR(20),
    motivo VARCHAR(255),
    data_entrada TIMESTAMP,
    data_saida TIMESTAMP,
    funcionario_visitado VARCHAR(100),
    departamento_id BIGINT,
    FOREIGN KEY (departamento_id) REFERENCES departamento(id)
);
