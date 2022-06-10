# InvDeCtrl-Spring
<b>-- Le deuxième TP d'inversion de contrôle, en utilisant cette fois-ci le framework Spring</b>
<p>À la suite du cours de la programmation distribué, dans ce tp on va aborder la notion de l'inversion de contrôle et l'injection de dépendances, toujours dans le cadre 
de développement des applications qui ont fermé à la modification et ouverte à l'extension.</p>
<p><b>Alors pour ce TP</b>, nous avons développée le même application que nous avons fait dans le tp01 en respectant toutes les normes et les étapes sauf que cette fois-ci.
nous avons utilisé le framework Spring qui va s'occupe la couche DAO, c'est â dire que le développeur va se concentrer seulement sur les besoins fonctionnelles, et ça
va nous facilite beaucoup le développement, c'est ce que on appelle l'inversion de contrôle.</p>
<p><b>L'application</b> développé est de type maven et elle est construit en trois couches principales:
<ol>
  <li>Couche DAO</li>
  <li>Couche Metier</li>
  <li>Couche Web ou Présentation</li>
</ol>
Chaque couche s'occupe de traiter et manipuler un ensemble des besoins. Ces besoins sont bien défini.
</p>

<h4>1/ Couche DAO : C'est dont laquel on exprime les besoins techniques </h4>
<span> - Voici quelques captures d'écrans de cette couche, comme vous voyez, il exist rien de nouveau c'est le même que le tp01.</span> 
<span>Sauf que il exist quelques annotations, ces annotations désigne l'utilisation de framework Spring, pour s'occupe et gérer les dépendances entre les interfaces et
leurs implémentations</span>
<hr>
<i>1.1/ Interface <b>IntDao</b> :</i>
<br/>
<br/>

![intdao](https://user-images.githubusercontent.com/102219821/162547823-e585cbba-9fab-4f68-9ab2-2fcf0ccdbb2f.png)

<br/>
<br/>
<p><b>NB:</b> Avant d'aller plus loin dans ce rapprot, il fallait de dire que, il exist deux façons différentes pour appliquer le framework :
<ol>
  <li>En utilisant un fichier de Context avec une extension XML</li>
  <li>En utilisant les annotations (le plus utilisées)</li>
</ol>
</p>
<i>1.2/ Classe <b>DaoImpl</b> :</i>
<br/>
<br/> 

![daoimpl](https://user-images.githubusercontent.com/102219821/162546577-ee24f2d0-1191-4a84-a51b-8e2f18134ddf.png)

<br/>
<br/> 
<h4>2/ Couche Metier : C'est dont laquel on exprime les besoins fonctionnelles </h4>
<span> - Voici quelques captures d'écrans de cette couche, comme vous voyez, il exist rien de nouveau c'est le même que le tp01.</span>
<span>Sauf que nous avons ajoutée une nouvel classe que s'appelle Calcul, c'est juste pour visualiser et aborder les test unitaires</span>
<hr>
<i>2.1/ Interface <b>IntMetier</b> :</i>
<br/>
<br/> 

![intmet](https://user-images.githubusercontent.com/102219821/162546780-e3046868-cffb-4cb5-bca0-e1a7b66c6b65.png)

<br/>
<br/> 
<i>2.2/ Classe <b>MetierImpl</b> :</i>
<br/>
<br/> 

![metierimpl](https://user-images.githubusercontent.com/102219821/162546820-75b41feb-117d-40e5-b452-f9073f60876a.png)

<br/>
<br/> 
<i>2.3/ Classe <b>Calcul</b> :</i>
<span>Ce classe été crée pour visualiser et voir comment les test unitaires fonctionne</span>
<br/>
<br/> 

![calcul](https://user-images.githubusercontent.com/102219821/162546952-8075a978-7cdf-41e5-bb6a-f71d24e21820.png)

<br/>
<br/>
<h4>3/ Couche Présentation : C'est dont laquel on instancie et on invoque les méthodes </h4>
<span> - Voici quelques captures d'écrans de cette couche, comme vous voyez, nous avons créé une classe, dont lequel on doit instancier les objets et invoquer
les méthodes que on veut utiliser</span> 
<span>Dans ce tp nous avons crée plusieurs classes de présentation, chacun représente une nouvelle version, je vais pas ajouter les screens de toutes les
classes.</span>
<hr>
<i>3.1/ Classe <b>PresSpringXML</b> :</i>
<span>Ici nous avons s'interssé par la méthode XML pour gérer les dépendanes </span>
<br/>
<br/>

![xml](https://user-images.githubusercontent.com/102219821/162547421-d12dcdd1-7483-4b80-9de6-ba62e90d264f.png)

<br/>
<br/>
<i>3.2/ Classe <b>PresSpringAnnotations</b> :</i>
<span>Ici nous avons s'interssé par utiliser les annotations pour gérer les dépendanes </span>
<br/>
<br/>

![anno](https://user-images.githubusercontent.com/102219821/162547506-e8142a10-768f-4eb4-a6c3-48f4987d10f5.png)

<br/>
<br/>
<h4>4/ Test Unitaire : En utilisant Junit  </h4>
<span> - Voici quelques captures d'écrans, montrant comment vous pouvez appliquer ces tests.</span>
<br/>
<br/>
<i>4.1/ Classe <b>CalculTest</b> :</i>
<br/>
<br/>

![test](https://user-images.githubusercontent.com/102219821/162547687-de78ce11-88c1-44a3-b809-47f92f77485d.png)

<br/>
<br/>
<h4>5/ Maven : Compiler, tester, Installer,... votre application </h4>
<br/>
<br/>

![mvn cmd](https://user-images.githubusercontent.com/102219821/162547757-f858e877-4c9c-4cd9-b196-e6a8310c0f4a.png)

<br/>
<h4>5/ Execution : Quelques captures d'écrans d'execution de l'application </h4>
<i>5.1/ Version <b>Capteurs</b> :</i>
<br/>
<br/>

![vcapteurs](https://user-images.githubusercontent.com/102219821/173118762-0e8278e6-44ce-4b36-92e2-b1fc2b06c4d3.png)

<br/>
<i>5.2/ Version <b>Base de données</b> :</i>
<br/>
<br/>

![vbd](https://user-images.githubusercontent.com/102219821/173118896-b6852cd3-4029-4b6e-96e4-bb83b5fc9e3c.png)

<br/>
<i>5.2/ Version <b>Web services</b> :</i>
<br/>
<br/>

![vwebservices](https://user-images.githubusercontent.com/102219821/173118947-8a73f682-3f54-42a8-b2ef-442173a03f1b.png)



















