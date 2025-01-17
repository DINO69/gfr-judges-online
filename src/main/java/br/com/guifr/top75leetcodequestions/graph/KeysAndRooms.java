package br.com.guifr.top75leetcodequestions.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Set<Integer> roomsVisited = new HashSet<>();

        int roomsAmount = rooms.size();

        goTryVisitAllRooms(rooms,roomsVisited,0);

        //System.out.println(roomsVisited);

        return roomsAmount == roomsVisited.size();
    }

    public void goTryVisitAllRooms(List<List<Integer>> rooms, Set<Integer> roomsVisited, int room){
        if(roomsVisited.contains(room)) return;

        roomsVisited.add(room);

        rooms.get(room).forEach(r -> {
            goTryVisitAllRooms(rooms,roomsVisited,r);
        });

    }

}
