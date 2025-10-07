-- ==============================
-- DADOS INICIAIS
-- ==============================

INSERT INTO departamento (nome) VALUES 
('Administração'),
('Recursos Humanos'),
('Tecnologia da Informação'),
('Segurança'),
('Limpeza');

INSERT INTO projeto (nome, descricao) VALUES 
('Sistema Interno', 'Desenvolvimento do sistema de gestão da empresa'),
('Portal do Cliente', 'Portal web para acesso de clientes'),
('Modernização da Infraestrutura', 'Atualização de servidores e redes');

INSERT INTO funcionario 
(nome, cpf, data_nascimento, matricula, cargo, salario_base, data_contratacao, departamento_id) VALUES
('Ana Souza', '123.456.789-00', '1990-04-12', 'F001', 'Analista de Sistemas', 6500.00, '2021-03-10', 3),
('Carlos Lima', '321.654.987-00', '1985-10-23', 'F002', 'Gerente de TI', 9000.00, '2020-08-05', 3),
('Fernanda Rocha', '987.654.321-00', '1992-01-30', 'F003', 'Assistente Administrativo', 4000.00, '2022-06-15', 1);

INSERT INTO terceirizado 
(nome, cpf, funcao, empresa_prestadora, data_inicio_contrato, data_fim_contrato, responsavel_interno, departamento_id) VALUES
('José Pereira', '456.789.123-00', 'Segurança', 'SegurTec', '2023-01-10', '2024-12-31', 'Carlos Lima', 4),
('Maria Antunes', '789.123.456-00', 'Limpeza', 'CleanService', '2022-02-15', '2025-02-14', 'Fernanda Rocha', 5);

INSERT INTO visitante 
(nome, documento, motivo, data_entrada, data_saida, funcionario_visitado, departamento_id) VALUES
('Ricardo Alves', 'RG1234567', 'Reunião de parceria', CURRENT_TIMESTAMP, NULL, 'Carlos Lima', 3),
('Luciana Mendes', 'RG7654321', 'Entrevista de emprego', CURRENT_TIMESTAMP, NULL, 'Fernanda Rocha', 2);
