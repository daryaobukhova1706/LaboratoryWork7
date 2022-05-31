package ru.Lab7.client.generationRequests;

import ru.Lab7.common.request.Request;

public interface GenerationRequest {
    Request help(String login, String password);
    Request update(String login, String password,Long id,  String name, Double coordinatesX, float coordinatesY, Float fromX, Long fromY, float fromZ, String fromName, Integer toX, int toY, Long toZ, Long distance);
    Request add(String login,String password, String name, Double coordinatesX, float coordinatesY, Float fromX, Long fromY, float fromZ, String fromName, Integer toX, int toY, Long toZ, Long distance);
    Request info(String login, String password);
    Request show(String login, String password);
    Request sort(String login, String password);
    Request exit(String login, String password);
    Request clear(String login, String password);
    Request addIfMin(String login,String password, String name, Double coordinatesX, float coordinatesY, Float fromX, Long fromY, float fromZ, String fromName, Integer toX, int toY, Long toZ, Long distance);
    Request removeFirst(String login, String password);
    Request removeById(String login, String password, Long id);
    Request minById(String login, String password);
    Request filterContainsName(String login, String password, String name);
    Request filterLessThanDistance(String login, String password, Long distance);
    Request executeScript(String login, String password, String fileName);
    Request userRegistration(String login, String password);
    Request userAuthorization(String login, String password);
}
