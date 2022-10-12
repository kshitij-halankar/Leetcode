/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    var i=0;
    var a="abcdefghijklmnopqrstuvwxyz";
    for(i=0;i<26;i++){
        if(!sentence.includes(""+a.charAt(i))){
            return false;
        }
    }
    return true;
};