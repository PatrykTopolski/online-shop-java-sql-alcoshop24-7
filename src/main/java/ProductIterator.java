// import java.util.*;

// public class ProductIterator implements Iterator<Product>{
//     private List<Product> wordsList;
//     private int index = 0;

//     public WordIterator(FileContent fileData){
//         this.fileContent = fileData;
//         wordsList = fileContent.getWordsList();
//     }

//     public boolean hasNext(){
//         return index < wordsList.size();
//     }

//     public String next(){
//         return wordsList.get(index++);
//     }

//     public void resetIndex(){
//         index = 0;
//     }
// }