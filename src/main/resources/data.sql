-- DEPARTAMENTOS
INSERT INTO departamento (nome) VALUES ('Recursos Humanos');
INSERT INTO departamento (nome) VALUES ('Tecnologia da Informação');
INSERT INTO departamento (nome) VALUES ('Financeiro');
INSERT INTO departamento (nome) VALUES ('Segurança');

-- PROJETOS
INSERT INTO projeto (nome, descricao) VALUES ('Sistema de Ponto', 'Desenvolvimento de sistema interno de registro de ponto.');
INSERT INTO projeto (nome, descricao) VALUES ('Portal do Funcionário', 'Aplicação web para gestão de dados pessoais e folha de pagamento.');

-- FUNCIONÁRIOS
INSERT INTO funcionario (nome, cpf, data_nascimento, matricula, cargo, salario_base, data_contratacao, departamento_id)
VALUES ('Carlos Almeida', '123.456.789-00', '1988-05-12', 'F001', 'Analista de Sistemas', 6500.00, '2022-01-10', 2);

INSERT INTO funcionario (nome, cpf, data_nascimento, matricula, cargo, salario_base, data_contratacao, departamento_id)
VALUES ('Mariana Souza', '987.654.321-00', '1992-09-03', 'F002', 'Assistente de RH', 4200.00, '2023-03-15', 1);

-- TERCEIRIZADOS
INSERT INTO terceirizado (nome, cpf, funcao, empresa_prestadora, data_inicio_contrato, data_fim_contrato, responsavel_interno, departamento_id)
VALUES ('João Pereira', '111.222.333-44', 'Vigilante', 'SegurTec', '2024-01-01', '2024-12-31', 'Carlos Almeida', 4);

-- VISITANTES
INSERT INTO visitante (nome, documento, motivo, data_entrada, funcionario_visitado, departamento_id)
VALUES ('Ana Ribeiro', 'RG1234567', 'Reunião de negócios', CURRENT_TIMESTAMP, 'Mariana Souza', 1);

-- USUÁRIO PADRÃO (ROLE_RH)
CREATE TABLE IF NOT EXISTS usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    perfil VARCHAR(30) NOT NULL
);

INSERT INTO usuario (username, senha, perfil)
VALUES (
    'admin',
    '$2a$10$Dow1pL7Sn0EZ8sKXjnygZuk4B9IAb9n8zM3MWyrKjKaOfZC3/Ez6a', -- BCrypt de 'admin123'
    'RH'
);
