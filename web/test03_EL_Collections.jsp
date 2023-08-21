<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Test EL avec des collections</title>
</head>
<body>
 <%
 /* Création d'une liste d'arbres et insertion de quatre éléments */
 java.util.List<String> desArbres = new java.util.ArrayList<>();
 desArbres.add("bouleau");
 desArbres.add("hêtre");
 desArbres.add("pin");
 desArbres.add("chêne");
 request.setAttribute("arbres", desArbres);
 %>
 <!-- Les quatre syntaxes suivantes retournent le deuxième élément de la
liste d'arbres -->
 ${arbres.get(1)} <br>
 ${arbres[1]} <br>
 ${arbres['1']} <br>
 ${arbres["1"]}
 <hr>
 <%
 /* Création d'un tableau */
 String[] desAnimaux = {"chien", "chat", "poisson rouge", "oiseau"};
 request.setAttribute("animaux", desAnimaux);
 %>
 <!-- Les trois syntaxes suivantes retournent le troisième élément du
tableau -->
 ${animaux[2]} <br>
 ${animaux['2']} <br>
 ${animaux["2"]}
 <hr>
 <%
 /* Création d'une Map */
 java.util.Map<String, Integer> desGateaux = new
java.util.HashMap<>();
 desGateaux.put("Charlotte", 12);
 desGateaux.put("baba au rhum", 3);
 desGateaux.put("bûche de noël", 7);
 desGateaux.put("tarte aux pommes", 1);
 request.setAttribute("gateaux", desGateaux);
 %>
 <!-- Les quatre syntaxes suivantes retournent la valeur associée à la
clé "Charlotte" de la Map de gateaux -->
 ${gateaux.Charlotte} <br>
 ${gateaux.get("Charlotte")} <br>
 ${gateaux['Charlotte']} <br>
 ${gateaux["Charlotte"]}
 <hr>
 <!-- Il est également possible d'utiliser un objet au lieu
d'initialiser la clé souhaitée directement dans l'expression -->
 <%
 /* Création d'une chaîne nommée "element" et contenant "bûche de
noël" */
 String element = "bûche de noël";
 request.setAttribute("buche", element);
 %>
 ${gateaux[buche]}
 <hr>
</body>
</html>