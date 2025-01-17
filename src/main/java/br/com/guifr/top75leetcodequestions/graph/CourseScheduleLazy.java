
package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class CourseScheduleLazy {

    //solution more lazy doesn't pass in all test
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;

        List<Integer> visited = new ArrayList<>();

        while(numCourses-- > 0){
            visited.add(Integer.valueOf(numCourses));
        }
        numCourses = visited.size();

        //System.out.println(visited);

        Map<Integer,List<Integer>> requisites = new HashMap<>();

        for(int[] req : prerequisites){
            int a = req[0];
            int b = req[1];
            visited.remove(Integer.valueOf(a));
            if(requisites.get(a) == null){
                requisites.put(a,new ArrayList<>());
            }
            requisites.get(a).add(b);
        }

        //System.out.println(visited);
        //System.out.println(requisites);


        while(requisites.size() > 0){
            int previous = visited.size();
            Iterator<Map.Entry<Integer, List<Integer>>> iterator = requisites.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer, List<Integer>> value = iterator.next();
                if(visited.containsAll(value.getValue())){
                    visited.add(value.getKey());
                    iterator.remove();
                }

            }
            if(previous == visited.size()) break;
        }

        return numCourses == visited.size();

    }

}
