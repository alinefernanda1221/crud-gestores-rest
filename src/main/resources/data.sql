-- POPULANDO ALGUNS VALORES --
INSERT INTO TB_SETOR VALUES
	(null, 'ADMINISTRATIVO'),
	(null, 'TECNOLOGIA'),
	(null, 'RECURSOS HUMANOS'),
	(null, 'HELP DESK');
	
	
INSERT INTO TB_GESTOR (ID_GESTOR, DATA_NASCIMENTO, MATRICULA, NOME, ID_SETOR) VALUES 
	(NULL, '1992-12-21 00:00:00	', 123456, 	 	'Aline Carvalho', 	2),	
	(NULL, '1992-05-20 00:00:00	', 789101, 	'João do Teste',	1),	
	(NULL, '1992-07-01 00:00:00	', 121314, 	'Maria do Teste', 	3),	
	(NULL, '1992-10-08 00:00:00	', 161718, 		'Carlos Teste', 	4),	
	(NULL, '1992-12-06 00:00:00	', 192021, 		'Miguel do Teste',	2);	