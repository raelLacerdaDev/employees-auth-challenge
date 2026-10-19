-- Inserção dos 10 Departamentos
INSERT INTO tb_department (name) VALUES ('Recursos Humanos');
INSERT INTO tb_department (name) VALUES ('Tecnologia da Informação');
INSERT INTO tb_department (name) VALUES ('Financeiro');
INSERT INTO tb_department (name) VALUES ('Marketing');
INSERT INTO tb_department (name) VALUES ('Vendas');
INSERT INTO tb_department (name) VALUES ('Operações');
INSERT INTO tb_department (name) VALUES ('Jurídico');
INSERT INTO tb_department (name) VALUES ('Atendimento ao Cliente');
INSERT INTO tb_department (name) VALUES ('Pesquisa e Desenvolvimento');
INSERT INTO tb_department (name) VALUES ('Logística');


INSERT INTO tb_employee (name, email, department_id) VALUES ('Ana Souza', 'ana.souza@email.com', 1);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Carlos Silva', 'carlos.silva@email.com', 1);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Mariana Costa', 'mariana.costa@email.com', 1);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Lucas Oliveira', 'lucas.oliveira@email.com', 1);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Gabriel Santos', 'gabriel.santos@email.com', 2);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Juliana Lima', 'juliana.lima@email.com', 2);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Rafael Rocha', 'rafael.rocha@email.com', 2);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Beatriz Martins', 'beatriz.martins@email.com', 2);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Bruno Alves', 'bruno.alves@email.com', 3);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Camila Ribeiro', 'camila.ribeiro@email.com', 3);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Diego Fernandes', 'diego.fernandes@email.com', 3);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Larissa Carvalho', 'larissa.carvalho@email.com', 3);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Felipe Araujo', 'felipe.araujo@email.com', 4);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Tatiane Moreira', 'tatiane.moreira@email.com', 4);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Rodrigo Barbosa', 'rodrigo.barbosa@email.com', 4);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Vanessa Cardoso', 'vanessa.cardoso@email.com', 4);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Marcos Vinicius', 'marcos.vinicius@email.com', 5);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Patricia Mendes', 'patricia.mendes@email.com', 5);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Eduardo Ramos', 'eduardo.ramos@email.com', 5);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Renata Duarte', 'renata.duarte@email.com', 5);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Thiago Correia', 'thiago.correia@email.com', 6);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Jessica Pires', 'jessica.pires@email.com', 6);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Matheus Farias', 'matheus.farias@email.com', 6);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Amanda Freitas', 'amanda.freitas@email.com', 6);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Vinicius Castro', 'vinicius.castro@email.com', 7);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Bruna Azevedo', 'bruna.azevedo@email.com', 7);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Leonardo Peixoto', 'leonardo.peixoto@email.com', 7);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Isabela Nogueira', 'isabela.nogueira@email.com', 7);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Guilherme Moreira', 'guilherme.moreira@email.com', 8);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Leticia Campos', 'leticia.campos@email.com', 8);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Gustavo Teles', 'gustavo.teles@email.com', 8);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Natalia Fogaça', 'natalia.fogaca@email.com', 8);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Alexandre Neves', 'alexandre.neves@email.com', 9);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Sabrina Queiroz', 'sabrina.queiroz@email.com', 9);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Igor Siqueira', 'igor.siqueira@email.com', 9);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Daniela Medeiros', 'daniela.medeiros@email.com', 9);


INSERT INTO tb_employee (name, email, department_id) VALUES ('Fernando Guedes', 'fernando.guedes@email.com', 10);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Priscila Viana', 'priscila.viana@email.com', 10);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Marcelo Antunes', 'marcelo.antunes@email.com', 10);
INSERT INTO tb_employee (name, email, department_id) VALUES ('Luana Sales', 'luana.sales@email.com', 10);




INSERT INTO tb_user (email, secret_key) VALUES ('maria@gmail.com', '$2a$10$pDWtRbrhz9.1T5iNRUpcRuXT4SModSzLLvbI2H5Op1hBoYynuuAu6');
INSERT INTO tb_user (email, secret_key) VALUES ( 'alex@gmail.com',  '$2a$10$pDWtRbrhz9.1T5iNRUpcRuXT4SModSzLLvbI2H5Op1hBoYynuuAu6');

INSERT INTO tb_role(name) VALUES ('ROLE_CLIENT');
INSERT INTO tb_role(name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role(user_id,role_id) VALUES (1,1);
INSERT INTO tb_user_role(user_id,role_id) VALUES (2,1);
INSERT INTO tb_user_role(user_id,role_id) VALUES (2,2);
