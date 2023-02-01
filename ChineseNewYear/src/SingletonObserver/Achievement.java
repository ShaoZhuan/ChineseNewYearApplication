/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonObserver;


public class Achievement {
    private String name;
    private String description;
    private boolean isUnlocked;
    
    public Achievement(String name, String description) {
        this.name = name;
        this.description = description;
        this.isUnlocked = false;
    }
    
    public void unlock() {
        if (!isUnlocked) {
            isUnlocked = true;
            AchievementSystem.getInstance().notifyObservers(this);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isUnlocked() {
        return isUnlocked;
    }
}
