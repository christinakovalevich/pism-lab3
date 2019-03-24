# Task 1:
1. You need to create `questionary.jsp` file under folder `webapp` which contais some questions. After click on the button `save` the form should be send on /questionery. Tip (in your `<form action="questionery" method="post">` in attribute action should write a path (`/questionery`) without slash `/`. For example you are on `localhost:8080/myWonderfulApp` . A form 
`<form action="/questionery">` will send request on `localhost:8080/questionery`, at the same time as `<form action="questionery">` will send it on `localhost:8080/myWonderfulApp/questionery`
2. You have a controller which is ready to serve requests `/questionery`. In `doGet` you should implement functionality which returns created earlier page `questionary.jsp`. In `doPost` you should create QustionaryService and follow the tips described in commens.
**Good luck!**
