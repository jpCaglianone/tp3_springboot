CREATE TABLE CURSO (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       nome VARCHAR(255)
);

CREATE TABLE ALUNO (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       nome VARCHAR(255)
);

CREATE TABLE ALUNO_CURSO (
                             aluno_id BIGINT NOT NULL,
                             curso_id BIGINT NOT NULL,
                             FOREIGN KEY (aluno_id) REFERENCES ALUNO(id),
                             FOREIGN KEY (curso_id) REFERENCES CURSO(id)
);
