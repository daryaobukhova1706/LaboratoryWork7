package ru.Lab7.client.generationRequests;

import ru.Lab7.common.arguments.*;
import ru.Lab7.common.request.Request;

import java.util.List;
import java.util.Map;

public class GenerationRequestImpl implements GenerationRequest {
    Request request=null;
    @Override
    public Request help(String login, String password) {
        ArgumentEmptyImpl argument = new ArgumentEmptyImpl(login, password);
        return request = new Request("help", argument);
    }

    @Override
    public Request update(String login,String password, Long id, String name, Double coordinatesX, float coordinatesY, Float fromX, Long fromY, float fromZ, String fromName, Integer toX, int toY, Long toZ, Long distance) {
        ArgumentUpdateImpl argument=new ArgumentUpdateImpl(login, password, id, name, coordinatesX, coordinatesY, fromX, fromY, fromZ, fromName, toX, toY, toZ, distance);
        return request=new Request("update", argument);
    }

    @Override
    public Request add(String login, String password,String name, Double coordinatesX, float coordinatesY, Float fromX, Long fromY, float fromZ, String fromName, Integer toX, int toY, Long toZ, Long distance) {
        ArgumentElementImpl argument = new ArgumentElementImpl(login,password, name, coordinatesX, coordinatesY, fromX, fromY, fromZ, fromName, toX, toY, toZ, distance);
        return request = new Request("add", argument);
    }
    @Override
    public Request info(String login, String password){
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("info", argument);
    }
    @Override
    public Request show(String login, String password){
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("show", argument);
    }
    @Override
    public Request sort(String login, String password){
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("sort", argument);
    }
    @Override
    public Request exit(String login, String password){
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("exit", argument);
    }
    @Override
    public Request clear(String login, String password){
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("clear", argument);
    }
    @Override
    public Request addIfMin(String login, String password,String name, Double coordinatesX, float coordinatesY, Float fromX, Long fromY, float fromZ, String fromName, Integer toX, int toY, Long toZ, Long distance){
        ArgumentElementImpl argument=new ArgumentElementImpl(login,password,name, coordinatesX, coordinatesY, fromX, fromY, fromZ, fromName, toX, toY, toZ, distance);
        return request=new Request("add_if_min", argument);
    }
    @Override
    public Request removeFirst(String login, String password){
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("remove_first", argument);
    }
    @Override
    public Request removeById(String login, String password,Long id){
        ArgumentIdImpl argument=new ArgumentIdImpl(login, password, id);
        return request=new Request("remove_by_id", argument);
    }
    @Override
    public Request minById(String login, String password) {
        ArgumentEmptyImpl argument = new ArgumentEmptyImpl(login, password);
        return request = new Request("min_by_id", argument);
    }
    @Override
    public Request filterContainsName(String login, String password,String name){
        ArgumentNameImpl argument= new ArgumentNameImpl(login, password, name);
        return request=new Request("filter_contains_name", argument);
    }
    @Override
    public Request filterLessThanDistance(String login, String password, Long distance){
        ArgumentDistanceImpl argument=new ArgumentDistanceImpl(login, password, distance);
        return request=new Request("filter_less_than_distance", argument);
    }
    @Override
    public Request executeScript(String login, String password,String fileName){
        ArgumentScriptImpl argument=new ArgumentScriptImpl(login, password, fileName);
        return  request=new Request("execute_script", argument);
    }
    @Override
    public Request userRegistration(String login, String password){
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("user_registration", argument);
    }

    @Override
    public Request userAuthorization(String login, String password) {
        ArgumentEmptyImpl argument=new ArgumentEmptyImpl(login, password);
        return request=new Request("user_authorization", argument);
    }
}




