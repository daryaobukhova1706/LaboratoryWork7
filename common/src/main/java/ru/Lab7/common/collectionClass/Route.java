package ru.Lab7.common.collectionClass;
import ru.Lab7.common.users.Users;

import java.time.format.DateTimeFormatter;

public class Route implements Comparable<Route>{
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private String creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private LocationFrom from; //Поле может быть null
    private LocationTo to; //Поле может быть null
    private Long distance; //Поле может быть null, Значение поля должно быть больше 1
    private String userName;
    public Route(){}
    public Route(Long id, String name, String creationDate, Coordinates coordinates, LocationFrom from, LocationTo to, Long distance, String userName){
        this.id=id;
        this.name=name;
        this.creationDate=creationDate;
        this.coordinates=coordinates;
        this.from=from;
        this.to=to;
        this.distance=distance;
        this.userName=userName;

    }
    //private String localDate=creationDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    public String getLocalDate(){
        return creationDate;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCoordinate(Coordinates coordinates){
        this.coordinates=coordinates;
    }
    public Coordinates getCoordinate(){
        return coordinates;
    }
    public void setFrom(LocationFrom from){
        this.from=from;
    }
    public LocationFrom getFrom(){
        return from;
    }
    public void setTo(LocationTo to){
        this.to=to;
    }
    public LocationTo getTo(){
        return to;
    }
    public void setDistance (Long distance){
        this.distance=distance;
    }
    public Long getDistance(){
        return distance;
    }
    public String getUserName(){return  userName;
    }


    @Override
    public int compareTo(Route o) {
        int result=this.name.compareTo(o.name);
        if (result==0){
            result=this.id.compareTo(o.id);
        }
        /*if(result==0){
            result=this.coordinates.getX().compareTo(o.getCoordinate().getX());
        }if(result==0){
            result=Float.compare(this.getCoordinate().getY(), o.getCoordinate().getY());
        }if(result==0){
            result=this.from.getX().compareTo(o.getFrom().getX());
        }if(result==0){
            result=this.getFrom().getY().compareTo(o.getFrom().getY());
        }if(result ==0){
            result=Float.compare(this.getFrom().getZ(), o.getFrom().getZ());
        }if(result==0){
            result=this.getFrom().getName().compareTo(o.getFrom().getName());
        }if(result==0){
            result=this.getTo().getX().compareTo(o.getTo().getX());
        }if(result==0){
            result=Integer.compare(this.getTo().getY(), o.getTo().getY());
        }if(result==0){
            result=this.getTo().getZ().compareTo(o.getTo().getZ());
        }if (result==0){
            result=this.getDistance().compareTo(o.getDistance());
        }*/
        return result;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", from=" + from +
                ", to=" + to +
                ", distance=" + distance +
                ", userName='" + userName + '\'' +
                '}';
    }
}

