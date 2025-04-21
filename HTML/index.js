//1. Write a function countVowels(str) that returns the number of vowels
const str="Hellow World";
const countVowels= (str)=>{
    str = str.toLowerCase();
    let letters = str.split('')
    let count =0;
    for(let i=0; i<letters.length; i++){
        if(letters[i]=='a'|| letters[i]=='e'|| letters[i]=='i'|| letters[i]=='o'|| letters[i]=='u'){
            count++;
        }
    }
    console.log(count);
    
}
countVowels(str)


// 2.You are given a nested array of numbers. Write a function that flattens it and returns a
// sorted (ascending) array with unique values only

function flattenAndSort(arr){
    let arr1 = arr.flat(Infinity);
    let arr2 = arr1.sort((a,b)=>a-b)
    console.log(arr2);
    
    
}
flattenAndSort([[3, 2, 1], [4, 5, 2], [1, 6]]);

const expenses = [
    { category: "Food", amount: 120 },
    { category: "Travel", amount: 300 },
    { category: "Food", amount: 80 },
    { category: "Bills", amount: 200 },
{ category: "Travel", amount: 100 },
];
//Write a function getCategorySummary(expenses) that returns an object where each key is a category and the value is the total expense in that category.
