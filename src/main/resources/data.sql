insert into utilisateur(nom, email, mdp, role, alert) values ('Q', 'QAnon@whitehouse.com', 'moonIsEmpty', 'Lord', true);
insert into utilisateur(nom, prenom, email, mdp, role, alert) values ('Zuckerberg', 'Marc', 'zuck-marc@facebook.com', 'iRunTheWorld', 'God', false);
insert into utilisateur(nom, prenom, email, mdp, role, alert) values ('Castex', 'Jean', 'jean-castex@matignon.fr', 'ruleThemeAll', 'Admin', true);

insert into categorie(nom) values ('Animal perdu');
insert into categorie(nom) values('Débrits');
insert into categorie(nom) values('mobilier urbain');
insert into categorie(nom) values('Voiries');
insert into categorie(nom) values('Problème de signalisation');

insert into incident(auteur_id, CATEGORIE_CATEGORIE_ID, titre, description, adresse, ouverture, statut)
values (1, 1, 'Shib perdu !',  'Mon chien milou est perdu! \nC est un shib de couleur maron. Si vous le trouvez, contactez moi au 060707070707.\n Merci !\n', '1 rue d Amiens,
         59486 Abscon', '2020-12-03T14:00', 'en attente');

insert into incident(auteur_id, CATEGORIE_CATEGORIE_ID, titre, description, adresse, ouverture, statut)
values (2, 2,'La putain de Poubelle renversé !',  'La semaine porchaine, les éboueurs !! QUI RENVERSE MA POUBELLE !? QUI OSE !?',' 47400 tonneins ' ,'2015-02-21T15:33','en attente' );
