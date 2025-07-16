CREATE DATABASE IF NOT EXISTS banco_senac_db;
USE banco_senac_db;

-- Tabela Usuario
CREATE TABLE usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    documento VARCHAR(20) NOT NULL,
    data_nascimento DATE NOT NULL,
    data_cadastro DATE NOT NULL
);

-- Tabela Conta
CREATE TABLE conta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_usuario BIGINT NOT NULL,
    numero_conta BIGINT NOT NULL,
    data_abertura DATE NOT NULL,
    CONSTRAINT fk_conta_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

-- Tabela Carteira
CREATE TABLE carteira (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_conta BIGINT NOT NULL,
    saldo DECIMAL(15,2) NOT NULL,
    ultima_atualizacao DATE NOT NULL,
    CONSTRAINT fk_carteira_conta FOREIGN KEY (id_conta) REFERENCES conta(id)
);

-- Tabela Extrato
CREATE TABLE extrato (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_conta BIGINT NOT NULL,
    valor DECIMAL(15,2) NOT NULL,
    data_operacao DATE NOT NULL,
    CONSTRAINT fk_extrato_conta FOREIGN KEY (id_conta) REFERENCES conta(id)
);

-- Tabela Flux
CREATE TABLE Flux (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_usuario BIGINT NOT NULL,
    chave_flux VARCHAR(100) NOT NULL,
    data_cadastro DATE NOT NULL,
    CONSTRAINT fk_flux_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);