package com.friends.friendsassignment;
import java.util.Collection;
import java.util.HashMap;


public class FriendsRespository implements IFriends<Friends>
    
{
private HashMap<String, Friends>  respository;
    public FriendsRespository(){
        respository = new HashMap<>();
        respository.put("Javaid Miandad",new Friends("Javaid Miandad", "Cricketer", 54));
        respository.put("Wasim Akram",new Friends("Wasim Akram", "Badminton Player",44));
    }

    
    @Override
    public void save(Friends t) {
        respository.put(t.getName(),t);

    }

    @Override
    public Collection<Friends> viewAll() {
        return respository.values();
    }   

    @Override
    public void update(Friends t) {
        
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override public void delete (Friends t){
    throw new UnsupportedOperationException("Unimplemented method '_'");}


    public HashMap<String, Friends> getRespository() {
        return respository;
    }


    public void setRespository(HashMap<String, Friends> respository) {
        this.respository = respository;
    }



    
}