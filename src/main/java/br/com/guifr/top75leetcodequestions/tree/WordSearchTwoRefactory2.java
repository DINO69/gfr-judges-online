//package br.com.guifr.top75leetcodequestions.tree;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class WordSearchTwoRefactory2 {
//    public List<String> findWords(char[][] board, String[] words) {
//
//        List<String> result = new ArrayList<>();
//
//        List<String> originalWords = new ArrayList<>(List.of(words));
//
//        Set<String> process = new HashSet<>();
//
//        int[] letters = new int[26];
//
//        for(int i = 0; i < board.length; i++){
//            for(int j = 0; j < board[i].length; j++){
//                letters[board[i][j] - 'a'] = 1;
//            }
//        }
//
//        for(int i = 0; i < letters.length;i++){
//            if(letters[i] == 1) continue;
//            char c = (char) (i + 'a');
//            //System.out.println(String.valueOf(c));
//            originalWords.removeIf( o -> o.contains(String.valueOf(c)));
//        }
//
//
//        //System.out.println(Arrays.toString(letters));
//        //System.out.println(originalWords);
//
//        for(int i = 0; i < board.length; i++){
//            for(int j = 0; j < board[i].length; j++){
//
//                String prefix = String.valueOf(board[i][j]);
//
//
//
//                if(process.contains(prefix) || startWith(prefix, originalWords).isEmpty()){
//                    originalWords.removeIf(w -> w.startsWith(prefix));
//                    process.add(prefix);
//                    continue;
//                }
//
//                //System.out.println("entrou -> " + prefix);
//                //System.out.println(originalWords);
//
//                goSearch(i, j, board, prefix, originalWords, new HashSet<Pair>(Set.of(new Pair(i,j))),result);
//            }
//        }
//
//        // think about the works with the same prefix
//
//        result = result.stream().distinct().toList();
//
//        return result;
//    }
//
//    public void goSearch(int i, int j, char[][] board, String prefix, List<String> words, Set<Pair> alreadyVisit, List<String> result){
//
//        if(startWith(prefix, words).isEmpty()) return;
//
//        if(words.contains(prefix)) {
//            result.add(prefix);
//            words.removeIf( w -> w.equals(prefix));
//        }
//
//        if(words.isEmpty()) return;
//
//        MyPair toLeft = new MyPair(i,j,0,-1);
//        MyPair toRight = new MyPair(i,j,0,+1);
//        MyPair toUp = new MyPair(i,j,-1,0);
//        MyPair toDown = new MyPair(i,j,+1,0);
//
//        List<MyPair> process = new ArrayList<>(List.of(toLeft,toRight,toUp,toDown));
//
//        process.stream().map( p -> p.next())
//                .filter( p -> validPath(p,board) && !alreadyVisit.contains(p))
//                .forEach(p -> {
//                    int newI = (int) p.getKey();
//                    int newJ = (int) p.getValue();
//
//                    String newPrefix = prefix + String.valueOf(board[newI][newJ]);
//                    Set<WordSearchTwo.Pair> newAlreadyVisit = new HashSet<WordSearchTwo.Pair>(alreadyVisit);
//
//                    newAlreadyVisit.add(p);
//                    if(hasStartWith(prefix,words)){
//                        goSearch(newI, newJ, board, newPrefix, words, newAlreadyVisit, result);
//                    }
//                });
//
//    }
//
//    public boolean validPath(int i,int j,char[][] board){
//        if(i < 0 || i >= board.length) return false;
//        if(j < 0 || j >= board[i].length) return false;
//        return true;
//    }
//
//    public List<String> startWith(String prefix, List<String> words){
//        List<String> result = new ArrayList<>();
//
//        for(String s : words){
//            if(s.startsWith(prefix)) result.add(s);
//        }
//
//        return result;
//    }
//
//    public boolean hasStartWith(String prefix, List<String> words){
//        List<String> result = new ArrayList<>();
//
//        for(String s : words){
//            if(s.startsWith(prefix)) return true;
//        }
//
//        return false;
//    }
//
//    public boolean validPath(MyPair pair,char[][] board){
//        return validPath((int) pair.getKey(),(int) pair.getValue(),board);
//    }
//
//
//    public class MyPair extends WordSearchTwo.Pair {
//        int deltaI;
//        int deltaJ;
//
//        public MyPair(int i, int j, int deltaI, int deltaJ){
//            super(i,j);
//            this.deltaI = deltaI;
//            this.deltaJ = deltaJ;
//        }
//
//        public MyPair next(){
//            MyPair result = new MyPair((int)this.getKey()+this.deltaI,(int)this.getValue()+this.deltaJ,this.deltaI,this.deltaJ);
//            return result;
//        }
//    }
//}
