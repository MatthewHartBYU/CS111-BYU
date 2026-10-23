/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */
function init(){
    document.getElementById("hover").addEventListener("mouseover", highlightLetters);
    document.getElementById("hover").addEventListener("mouseout", unHighlightLetters);
}
function highlightLetters(){
    var boldWords = document.getElementsByTagName("b");
    for(var i = 0; i<boldWords.length; i++){
        boldWords[i].style.backgroundColor = "yellow";
    }
}
function unHighlightLetters(){
    var boldWords = document.getElementsByTagName("b");
    for(var i = 0; i<boldWords.length; i++){
        boldWords[i].style.backgroundColor = "white";
    }
}


