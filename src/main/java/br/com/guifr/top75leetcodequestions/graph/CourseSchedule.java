package br.com.guifr.top75leetcodequestions.graph;

import java.util.*;

public class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;

        List<Integer> visited = new ArrayList<>();

        while(numCourses-- > 0){
            visited.add(Integer.valueOf(numCourses));
        }
        numCourses = visited.size();

        //System.out.println(visited);

        Map<Integer,List<Integer>> requisites = new HashMap<>();
        Map<Integer,List<Integer>> enable = new HashMap<>();

        for(int[] req : prerequisites){
            int a = req[0];
            int b = req[1];
            visited.remove(Integer.valueOf(a));

            if(requisites.get(a) == null){
                requisites.put(a,new ArrayList<>());
            }
            requisites.get(a).add(b);

            if(enable.get(b) == null){
                enable.put(b,new ArrayList<>());
            }
            enable.get(b).add(a);
        }

        System.out.println(visited);
        System.out.println(requisites);
        System.out.println(enable);

        for(Integer visit : new ArrayList<>(visited)){
            enableRequisites(visit,visited,enable,requisites);
        }


        return numCourses == visited.size();
    }

    public static void enableRequisites(int visit, List<Integer> visited,
                                 Map<Integer,List<Integer>> enable,
                                 Map<Integer,List<Integer>> requisites){
        if(enable.get(visit) != null){

            List<Integer> toEnable = enable.get(visit);

            for(Integer block : toEnable){
                if(visited.contains(block)) continue;

                if(visited.containsAll(requisites.get(block))){
                    visited.add(block);
                    requisites.remove(block);
                    enableRequisites(block,visited,enable,requisites);
                }

            }

        }


    }

}
