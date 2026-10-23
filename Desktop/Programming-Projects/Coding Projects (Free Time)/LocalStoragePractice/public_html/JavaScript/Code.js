/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
var arrCountries = [];
var arrColors = [];
var arrIds = [];
function init(){  
    getLocalStorage();   
    walkThroughStorage();   
}
function getLocalStorage(){
   var countryStorage = localStorage.getItem("Countries");
   var colorStorage = localStorage.getItem("Colors");
   var idStorage = localStorage.getItem("IDs");
   if(countryStorage !== null){
       arrCurStorage = JSON.parse(countryStorage);
       arrCurColor = JSON.parse(colorStorage);
       arrCurId = JSON.parse(idStorage);
       console.log(arrCurStorage);
       for(var i = 0; i<arrCurStorage.length; i++){
           arrCountries.push(arrCurStorage[i]); 
           arrColors.push(arrCurColor[i]);
           arrIds.push(arrCurId[i]);
       }
   }
   else{
       arrCountries = [];
       arrColors = [];
       arrIds = [];
   }
} 
function walkThroughStorage(){
   for(var i = 0; i<arrCountries.length; i++){
        var countryText = document.createElement("p");
        countryText.style.color = arrColors[i]; 
        countryText.innerHTML = arrCountries[i]; 
        countryText.id = arrIds[i];
        countryText.addEventListener("click", deleteCountry);
        document.getElementById("list").append(countryText);      
    }
    
}
function deleteStorage(){
    localStorage.removeItem("Countries");
    localStorage.removeItem("IDs");
    localStorage.removeItem("Colors"); 
    document.getElementById("list").innerHTML = "";
    document.getElementById("country").value = ""; 
    arrCountries = [];
    arrColors = [];
    arrIds = [];
} 
function deleteCountry(event){ 
    var targetEl = event.target;
    targetEl.parentNode.removeChild(targetEl);
    var numPos = arrIds.indexOf(targetEl.id);  
    arrCountries.splice(numPos,1);
    arrColors.splice(numPos,1);  
    arrIds.splice(numPos,1); 
    localStorage.setItem("Countries", JSON.stringify(arrCountries));
    localStorage.setItem("Colors", JSON.stringify(arrColors));
    localStorage.setItem("IDs", JSON.stringify(arrIds));  
}
function saveToStorage(){
    var countryText = document.createElement("p");   
    countryText.addEventListener("click", deleteCountry); 
    var colors = ["Red", "Blue", "Green", "Yellow", "Purple", "Maroon"];
    var randomNum = Math.floor(Math.random() * colors.length);  
    countryText.style.color = colors[randomNum];
    arrColors.push(colors[randomNum]);
    arrCountries.push(document.getElementById("country").value);
    var randId = Math.floor(Math.random() * 1000);
    localStorage.setItem("Countries", JSON.stringify(arrCountries));
    localStorage.setItem("Colors", JSON.stringify(arrColors)); 
    if(document.getElementById("list").children.length > 1){
      for(var i = 0; i<arrIds.length; i++){
         while(arrIds[i] === randId.toString()){
            randId = Math.floor(Math.random() * 1000);
         } 
       }  
   }
    arrIds.push(randId.toString());
    localStorage.setItem("IDs", JSON.stringify(arrIds));
    countryText.innerHTML = document.getElementById("country").value; 
    document.getElementById("list").append(countryText);     
}  
 



