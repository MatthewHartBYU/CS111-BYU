/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
var size = 16;
function init(){
    document.getElementById("expandButton").addEventListener("click", growFont);
    document.getElementById("text").value = "";
}
function growFont(){
    
    var userText = document.getElementById("text").value;
    var userTextBox = document.createElement("p");
    userTextBox.innerHTML = userText;
    userTextBox.style.color = "blue";
    userTextBox.style.textAlign = "center";
    userTextBox.style.fontSize = size + "px";
    userTextBox.id = "theText";
    var textArea = document.getElementById("textArea");
    var length = textArea.querySelectorAll('p').length; 
    if(length === 0){
        document.getElementById("textArea").appendChild(userTextBox);
    }else{
        document.getElementById("theText").style.fontSize = (size + 10) + "px";
        if(size > 180){    
            alert("Woops! The element got too big, let's bring it down a size!");
            document.getElementById("theText").style.fontSize = 16 + "px"; 
        } 
        size +=10; 
        
    }
}



