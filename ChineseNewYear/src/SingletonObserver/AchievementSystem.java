/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hng
 */
//Singleton Class
public class AchievementSystem {
    private static AchievementSystem instance;

    private List<Observer> observers = new ArrayList<>();
    private Map<String, Achievement> achievements = new HashMap<>();
    
    private AchievementSystem() {}
    
    public static AchievementSystem getInstance() {
        if (instance == null) {
            instance = new AchievementSystem();
        }
        return instance;
    }
    
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers(Achievement achievement) {
        for (Observer observer : observers) {
            observer.update(achievement);
        }
    }
    
    public void addAchievement(Achievement achievement) {
        achievements.put(achievement.getName(), achievement);
    }
    
    public Achievement getAchievement(String name) {
        return achievements.get(name);
    }
}
